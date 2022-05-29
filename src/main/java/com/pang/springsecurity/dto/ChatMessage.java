package com.pang.springsecurity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ChatMessage {

    public enum MessageType{
        ENTER, TALK
    }

    private MessageType messageType;
    private String roomId;
    private String message;
    private String sender;

}
