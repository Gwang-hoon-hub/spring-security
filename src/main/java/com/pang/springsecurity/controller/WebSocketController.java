package com.pang.springsecurity.controller;

import com.pang.springsecurity.entity.websocket.Content;
import com.pang.springsecurity.entity.websocket.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Content greeting (HelloMessage message) throws InterruptedException {
        Thread.sleep(1000); // simulated delay
        return new Content("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
