package com.chatbot.backend.Controller;


import com.chatbot.backend.Model.MessageRequest;
import com.chatbot.backend.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {
        System.out.println("Received message: " + request.getMessage());

        return chatService.getReply(request.getMessage());
    }
}