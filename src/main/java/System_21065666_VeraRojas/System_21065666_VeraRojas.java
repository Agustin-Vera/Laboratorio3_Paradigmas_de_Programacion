package System_21065666_VeraRojas;

import java.util.ArrayList;
import java.util.Date;

import ChatHistory_21065666_VeraRojas.Chathistory_21065666_VeraRojas;
import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import User_21065666_VeraRojas.*;

public class System_21065666_VeraRojas implements SystemInterface_21065666_VeraRojas{

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

    // RF 11
    public void systemLogout(){
        this.currentChatbotID = initialChatbotCodeLink;
        this.currentFlowID = getChatbotByID(initialChatbotCodeLink).getId();
        this.currentUser = null;
    }

    // RF 12

    public void systemTalk(String message){
        if(usersLogged()){
            Chatbot_21065666_VeraRojas chatbotInicio = getChatbotByID(this.currentChatbotID);
            Flow_21065666_VeraRojas flowInicio = chatbotInicio.getFlowByID(this.currentFlowID);
            if(flowInicio.optionExistByMessage(message)){
                Option_21065666_VeraRojas option = flowInicio.getOptionByMessage(message);
                int chatbotCodeLink = option.getChatbotCodeLink();
                int flowCodeLink = option.getInitialFlowCodeLink();
                Chatbot_21065666_VeraRojas chatbotDestino = getChatbotByID(chatbotCodeLink);
                Flow_21065666_VeraRojas flowDestino = chatbotDestino.getFlowByID(flowCodeLink);
                String interaction = makeInteraction(this.currentUser, message, chatbotDestino, flowDestino);
                addInteractionToChathistory(this.currentUser, interaction);
                this.setCurrentChatbotID(chatbotDestino.getId());
                this.setCurrentFlowID(flowDestino.getId());
            }
            else{
                String interaction = makeInteraction(this.currentUser, message, chatbotInicio, flowInicio);
                addInteractionToChathistory(this.currentUser, interaction);
            }
        }
        else{
            System.out.println("Inicia sesión con un usuario para interactuar con un chatbot.");
        }
    }

    public String makeInteraction(String username, String message, Chatbot_21065666_VeraRojas chatbotDestino, Flow_21065666_VeraRojas flowDestino){
        String interaction = new Date() + " - " + username + ": " + message + "\n" + new Date() + " - " + chatbotDestino.getName() + ": " + flowDestino.getNameMsg() + "\n" + flowDestino.optionsToString() + "\n";
        System.out.println(chatbotDestino.getName() + ": " + flowDestino.getNameMsg() + "\n" + flowDestino.optionsToString());
        return interaction;
    }

    public void addInteractionToChathistory(String username, String interaction){
        for(Chathistory_21065666_VeraRojas chathistory: this.chathistorys){
            if(chathistory.getUsername().equals(username)){
                chathistory.setHistory(interaction);
            }
        }
    }

    public void systemSynthesis(String username){
        if(userExistByName(username)){
            for(Chathistory_21065666_VeraRojas chathistory: this.chathistorys){
                if(chathistory.getUsername().equals(username)){
                    System.out.println(chathistory.getHistory());
                }
            }
        }
    }

    public void setCurrentChatbotID(int currentChatbotID) {
        this.currentChatbotID = currentChatbotID;
    }

    public void setCurrentFlowID(int currentFlowID) {
        this.currentFlowID = currentFlowID;
    }

    public void printUsers() {
        for(UserInterface_21065666_VeraRojas user: this.users){
            System.out.println(user.getName());
        }
        System.out.println("");
    }

    public UserInterface_21065666_VeraRojas getUserLogged() {
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(this.currentUser)){
                return user;
            }
        }
        return null;
    }

    public boolean userIsAdminUser(String username){
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(username) && user.isAdminUser() == true){
                return true;
            }
        }
        return false;
    }


    public boolean chatbotExistByID(int id) {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots) {
            if(chatbot.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean flowExistByFlowID(int chatbotID, int flowID) {
        Chatbot_21065666_VeraRojas chatbot = getChatbotByID(chatbotID);
        return chatbot.flowExistByID(flowID);
    }

    public void addFlowToChatbotByChatbotID(int chatbotID, Flow_21065666_VeraRojas flow) {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots) {
            if(chatbot.getId() == chatbotID) {
                chatbot.chatbotAddFlow(flow);
            }
        }
    }

    public void addOptionToFlowByChatbotFlowIDs(int chatbotID, int flowID, Option_21065666_VeraRojas option) {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots) {
            if (chatbot.getId() == chatbotID) {
                chatbot.addOptionToFlowByFlowID(flowID, option);
            }
        }
    }



    public void printChatbots() {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            System.out.println(chatbot.getId() + ". " + chatbot.getName());
        }
    }

    public void printChatbotsFlowsOptions() {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            System.out.println(chatbot.getId() + ". " + chatbot.getName());
            chatbot.printFlows();
        }
    }
    public void printChatbotFlowNames(int chatbotID) {
        Chatbot_21065666_VeraRojas chatbot = getChatbotByID(chatbotID);
        chatbot.printFlowNames();
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
