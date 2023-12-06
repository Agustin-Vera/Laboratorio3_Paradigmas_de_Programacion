package org.example;

import java.util.ArrayList;
import java.util.Date;
import UserInterface_21065666_VeraRojas.*;

public class System_21065666_VeraRojas {

    private String name;
    private int initialChatbotCodeLink;
    private ArrayList<Chatbot_21065666_VeraRojas> chatbots;
    private ArrayList<UserInterface_21065666_VeraRojas> users;
    private String currentUser;
    private ArrayList<Chathistory_21065666_VeraRojas> chathistorys;
    private int currentChatbotID;
    private int currentFlowID;
    private Date date;


    // ########### RF7 - TDA System - Constructor #################
    public System_21065666_VeraRojas(String name, int initialChatbotCodeLink, ArrayList<Chatbot_21065666_VeraRojas> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = getUniqueChatbots(chatbots);
        this.users = new ArrayList<UserInterface_21065666_VeraRojas>();
        this.currentUser = null;
        this.chathistorys = new ArrayList<Chathistory_21065666_VeraRojas>();
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

    // RF 8
    public void systemAddChatbot(Chatbot_21065666_VeraRojas chatbot){
        if(this.chatbotExist(chatbot)){
            System.out.println("Ya existe un chatbot con ese identificador dentro del sistema, pruebe con otro.");
        }
        this.chatbots.add(chatbot);
        System.out.println("Chatbot " + chatbot.getId() + " fue agregado con exito.");
    }

    // Verifica si un chatbot existe en el system
    public boolean chatbotExist(Chatbot_21065666_VeraRojas newChatbot){
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            if(chatbot.getId() == newChatbot.getId()){
                return true;
            }
        }
        return false;
    }

    // RF 9
    public void systemAddUser(UserInterface_21065666_VeraRojas user){
        if(this.userExist(user)){
            System.out.println("Ya existe un usuario con el mismo nombre dentro del sistema, pruebe con otro.");
        }
        else {
            this.users.add(user);
            this.chathistorys.add(new Chathistory_21065666_VeraRojas(user.getName()));
            System.out.println("Usuario '" + user.getName() + "' fue agregado con exito.");
        }
    }

    // RF 10
    public void systemLogin(String username){
        if(!usersLogged() && userExistByName(username)){
            this.currentUser = username;
            System.out.println("El usuario " + username + " inicio sesion de manera correcta.");
        }
        else {
            System.out.println("No se pudo iniciar la sesión del usuario, porfavor pruebe con un usuario existente o cierre la sesión iniciada.");
        }
    }

    public boolean usersLogged(){
        if (this.currentUser == null){
            return false;
        }
        return true;
    }

    public boolean userExistByName(String username){
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(username)){
                return true;
            }
        }
        return false;
    }

    public boolean userExist(UserInterface_21065666_VeraRojas newUser){
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(newUser.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "System_21065666_VeraRojas{" +
                "name='" + name + '\'' +
                ", initialChatbotCodeLink=" + initialChatbotCodeLink +
                ", chatbots=" + chatbots +
                ", users=" + users +
                ", currentUser='" + currentUser + '\'' +
                ", chathistorys=" + chathistorys +
                ", currentChatbotID=" + currentChatbotID +
                ", currentFlowID=" + currentFlowID +
                ", date=" + date +
                '}';
    }
}
