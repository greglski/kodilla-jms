package com.kodilla.kodillajms.receiver;

import com.kodilla.kodillajms.controller.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
    public void receive(String message) {
        System.out.println("Received the message: " + message);
    }

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-order")
    public void receiveOrder(Order order) {
        System.out.println("Received order: " + order);
    }

}
