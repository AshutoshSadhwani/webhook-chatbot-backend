package com.chatbot.backend.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {
        if (message == null) return "Invalid message";

        return switch (message.toLowerCase()) {
            case "hi" -> "Hello";
            case "bye" -> "Goodbye";
            default -> "I didn't understand that";
        };
    }
}