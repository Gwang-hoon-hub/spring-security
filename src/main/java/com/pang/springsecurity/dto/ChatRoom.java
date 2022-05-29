package com.pang.springsecurity.dto;

import com.pang.springsecurity.service.ChatService;
import lombok.Builder;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom {

    private String roomId;
    private String name;
    private Set<WebSocketSession> webSocketSessions = new HashSet<>();

    @Builder
    public ChatRoom(String roomId, String name) {
        this.roomId = roomId;
        this.name = name;
    }
//    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService) {
//        if (chatMessage.getType().equals(ChatMessage.MessageType.ENTER)) {
//            sessions.add(session);
//            chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
//        }
//        sendMessage(chatMessage, chatService);
//    }

//    public <T> void sendMessage(T message, ChatService chatService) {
//        sessions.parallelStream().forEach(session -> chatService.sendMessage(session, message));
//    }

    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatServie chatServie){
        if (chatMessage.getMessageType().equals(ChatMessage.MessageType.ENTER)){
            webSocketSessions.add(session);
            chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
        }

    }

    public <T> void sendMessage(T message, ChatService chatService){
        webSocketSessions.parallelStream().forEach(session -> chatService.sendMesaage(session, message));
    }
}
