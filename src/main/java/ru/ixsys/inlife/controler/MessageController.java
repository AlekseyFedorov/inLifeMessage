package ru.ixsys.inlife.controler;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ixsys.inlife.model.Message;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Messages")
public class MessageController {

    @GetMapping
    public List<Message> findAllMessages() {
        return List.of(
                new Message("title 1", "content 1"),
                new Message("title 2", "content 2"),
                new Message("title 3", "content 3")
//                Message.builder().title("title 1").content("content 1").build(),
//                Message.builder().title("title 2").content("content 2").build(),
//                Message.builder().title("title 3").content("content 3").build()
        );
    }
}
