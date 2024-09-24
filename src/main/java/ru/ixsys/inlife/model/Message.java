package ru.ixsys.inlife.model;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Data
//@Getter
//@Setter

//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor

//@Builder

//public record Message(String title, String content) {}

public record Message (
        String title,
        String content
) {}

//public class Message {
//    private String title;
//    private String content;
//
//    public Message(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//}
