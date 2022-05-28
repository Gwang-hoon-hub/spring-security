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
    @SendTo("/topic/greetings") // 여기를 구독하는 사용자에게 Content 객체를 모두 보여주게 된다.
    public Content greeting (HelloMessage message) throws InterruptedException {
        Thread.sleep(1000); // simulated delay
        return new Content("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
