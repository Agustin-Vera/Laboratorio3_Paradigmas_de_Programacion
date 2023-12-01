package org.example;

import java.util.ArrayList;
import java.util.Date;

public class System_21065666_VeraRojas {

    private String name;
    private int initialChatbotCodeLink;
    private ArrayList<Chatbot_21065666_VeraRojas> chatbots;
    //private ArrayList<User> users;
    private String currentUser;
    //private ArrayList<Chathistory> chathistorys;
    private int currentChatbotID;
    private int currentFlowID;
    private Date date;


    // ########### RF7 - TDA System - Constructor #################
    public System_21065666_VeraRojas(String name, int initialChatbotCodeLink, ArrayList<Chatbot_21065666_VeraRojas> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = getUniqueChatbots(chatbots);
        //this.users = new ArrayList<User>();
        this.currentUser = null;
        //this.chathistorys = new ArrayList<Chathistory>();
        this.currentChatbotID = initialChatbotCodeLink;
        this.currentFlowID = getChatbotByID(initialChatbotCodeLink).getStartFlowID();;
        this.date = new Date();
    }

    public ArrayList<Chatbot_21065666_VeraRojas> getUniqueChatbots(ArrayList<Chatbot_21065666_VeraRojas> chatbots){
        for(int i = 0; i < chatbots.size(); i++){
            for(int j = i+1; j < chatbots.size(); j++){
                if(chatbots.get(i).getId() == chatbots.get(j).getId()){
                    chatbots.remove(j);
                    System.out.println("Mismo ID");
                    j--;
                }
            }
        }
        return chatbots;
    }

    public Chatbot_21065666_VeraRojas getChatbotByID(int id){
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            if(chatbot.getId() == id){
                return chatbot;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "System_21065666_VeraRojas{" +
                "name='" + name + '\'' +
                ", initialChatbotCodeLink=" + initialChatbotCodeLink +
                ", chatbots=" + chatbots +
                ", currentUser='" + currentUser + '\'' +
                ", currentChatbotID=" + currentChatbotID +
                ", currentFlowID=" + currentFlowID +
                ", date=" + date +
                '}';
    }
}
