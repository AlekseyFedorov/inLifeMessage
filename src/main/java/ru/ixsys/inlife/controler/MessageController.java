package ru.ixsys.inlife.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ixsys.inlife.model.Message;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Messages")
public class MessageController {

    public List<Message> findAllMessages() {
        return List.of(
                new Message("title 1", "comment 1"),
                new Message("titlw 2", "comment 2"),
                new Message("title 3", "comment 3")
        );
    }
}
