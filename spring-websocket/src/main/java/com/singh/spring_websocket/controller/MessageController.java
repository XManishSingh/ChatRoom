package com.singh.spring_websocket.controller;


import com.singh.spring_websocket.models.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MessageController {
    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(Message message) throws InterruptedException {
        try {
            System.out.println("Received Message: " + message);

            // Simulate delay
            //Thread.sleep(2000);

            System.out.println("Sending Response: " + message);

            // Return the message
            return message;
        } catch (Exception e) {
            // Log the exception for better visibility
            System.err.println("Error processing message: " + e.getMessage());
            e.printStackTrace();

            // Rethrow to ensure proper handling
            throw new RuntimeException("Error processing message", e);
        }
    }
}
