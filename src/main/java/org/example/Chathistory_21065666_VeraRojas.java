package org.example;

public class Chathistory_21065666_VeraRojas {

    private String username;
    private String history;


    public Chathistory_21065666_VeraRojas(String username) {
        this.username = username;
        this.history = "";
    }

    public void setHistory(String newInteraction) {
        this.history = this.history + newInteraction;
    }

    @Override
    public String toString() {
        return "Chathistory_21065666_VeraRojas{" +
                "username='" + username + '\'' +
                ", history='" + history + '\'' +
                '}';
    }
}
