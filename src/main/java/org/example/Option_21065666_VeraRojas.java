package org.example;

import java.util.ArrayList;

public class Option_21065666_VeraRojas {

    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private ArrayList<String> keywords;

    public int getCode() {
        return code;
    }

    public Option_21065666_VeraRojas(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Option_21065666_VeraRojas{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", chatbotCodeLink=" + chatbotCodeLink +
                ", initialFlowCodeLink=" + initialFlowCodeLink +
                ", keywords=" + keywords +
                '}';
    }

}
