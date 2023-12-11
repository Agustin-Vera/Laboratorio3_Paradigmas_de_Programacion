package System_21065666_VeraRojas;

import java.util.ArrayList;
import java.util.Date;

import ChatHistory_21065666_VeraRojas.Chathistory_21065666_VeraRojas;
import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import User_21065666_VeraRojas.*;

/**
 * Clase System
 * @author Agustin Vera
 */
public class System_21065666_VeraRojas implements SystemInterface_21065666_VeraRojas{

    /**
     * Nombre del System
     */
    private String name;

    /**
     * Identificador del Chatbot inicial
     */
    private int initialChatbotCodeLink;

    /**
     * Lista de los Chatbots del System
     */
    private ArrayList<Chatbot_21065666_VeraRojas> chatbots;

    /**
     * Lista de Users del System
     */
    private ArrayList<UserInterface_21065666_VeraRojas> users;

    /**
     * Nombre del Usuario iniciado
     */
    private String currentUser;

    /**
     * Lista de los Chathistorys del System
     */
    private ArrayList<Chathistory_21065666_VeraRojas> chathistorys;

    /**
     * Identificador del ultimo Chatbot en ser utilizado
     */
    private int currentChatbotID;

    /**
     * Identificador del ultimo Flow en ser utilizado
     */
    private int currentFlowID;

    /**
     * Fecha de creacion del System
     */
    private Date date;

    /**
     * Instancia un System
     * @param name El nombre del System
     * @param initialChatbotCodeLink El identificador del Chatbot inicial
     * @param chatbots Lista de Chatbots a ser agregados al System
     */
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

    /**
     * Obtiene las primeras instancias de los Chatbots ingresados
     * @param chatbots Los Chatbots del System
     * @return Devuelve las primeras ocurrencias de los Chatbots
     */
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

    /**
     * Obtiene un Chatbot dado un identificador
     * @param id El identificador del Chatbot
     * @return Devuelve el Chatbot
     */
    public Chatbot_21065666_VeraRojas getChatbotByID(int id){
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            if(chatbot.getId() == id){
                return chatbot;
            }
        }
        return null;
    }

    /**
     * Agrega un Chatbot al System
     * @param chatbot El Chatbot a ser agregado
     */
    public void systemAddChatbot(Chatbot_21065666_VeraRojas chatbot){
        if(this.chatbotExist(chatbot)){
            System.out.println("Ya existe un chatbot con ese identificador dentro del sistema, pruebe con otro.");
        }
        this.chatbots.add(chatbot);
        System.out.println("Chatbot " + chatbot.getId() + " fue agregado con exito.");
    }

    /**
     * Verifica si un chatbot existe en el System
     * @param newChatbot El Chatbot a ser agregado
     * @return El booleano que representa si existe o no el Chatbot
     */
    public boolean chatbotExist(Chatbot_21065666_VeraRojas newChatbot){
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            if(chatbot.getId() == newChatbot.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega un User al System
     * @param user El User a ser agregado
     */
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

    /**
     * Inicia la sesion de un User
     * @param username Nombre del User a ser iniciado
     */
    public void systemLogin(String username){
        if(!usersLogged() && userExistByName(username)){
            this.currentUser = username;
            System.out.println("El usuario " + username + " inicio sesion de manera correcta.");
        }
        else {
            System.out.println("No se pudo iniciar la sesión del usuario, porfavor pruebe con un usuario existente o cierre la sesión iniciada.");
        }
    }

    /**
     * Verifica si existe algun usuario con la sesion iniciada
     * @return El booleano que representa si existe un User iniciado
     */
    public boolean usersLogged(){
        if (this.currentUser == null){
            return false;
        }
        return true;
    }

    /**
     * Verifica si existe un User dado un nombre de usuario
     * @param username Nombre del User a ser verificado
     * @return El booleano que representa si existe el User
     */
    public boolean userExistByName(String username){
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(username)){
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si existe un User en el System
     * @param newUser El User a ser verificado
     * @return El booleano que representa si existe el User
     */
    public boolean userExist(UserInterface_21065666_VeraRojas newUser){
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(newUser.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Cierra la sesion de un User
     */
    public void systemLogout(){
        this.currentChatbotID = initialChatbotCodeLink;
        this.currentFlowID = getChatbotByID(initialChatbotCodeLink).getId();
        this.currentUser = null;
    }

    /**
     * Permite la interaccion con un Chatbot
     * @param message El mensaje para realizar la interaccion
     */
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

    /**
     * Crea el String con un formato representador de la interaccion
     * @param username El nombre del User que envia el mensaje
     * @param message El mensaje realizado por el User
     * @param chatbotDestino El Chatbot al cual apunta el mensaje del User
     * @param flowDestino El Flow al cual apunta el mensaje del User
     * @return El String que representa la interaccion con un formato
     */
    public String makeInteraction(String username, String message, Chatbot_21065666_VeraRojas chatbotDestino, Flow_21065666_VeraRojas flowDestino){
        String interaction = new Date() + " - " + username + ": " + message + "\n" + new Date() + " - " + chatbotDestino.getName() + ": " + flowDestino.getNameMsg() + "\n" + flowDestino.optionsToString() + "\n";
        System.out.println(chatbotDestino.getName() + ": " + flowDestino.getNameMsg() + "\n" + flowDestino.optionsToString());
        return interaction;
    }

    /**
     * Agrega una interaccion a un Chathistory
     * @param username El nombre del User que interactua
     * @param interaction La interaccion entre el User y el Chatbot
     */
    public void addInteractionToChathistory(String username, String interaction){
        for(Chathistory_21065666_VeraRojas chathistory: this.chathistorys){
            if(chathistory.getUsername().equals(username)){
                chathistory.setHistory(interaction);
            }
        }
    }

    /**
     * Ofrece una sintesis de las interacciones entre un User y el Chatbot
     * @param username El nombre del User al que se le mostrara sus sintesis
     */
    public void systemSynthesis(String username){
        if(userExistByName(username) && usersLogged()){
            for(Chathistory_21065666_VeraRojas chathistory: this.chathistorys){
                if(chathistory.getUsername().equals(username)){
                    System.out.println(chathistory.getHistory());
                }
            }
            System.out.println("Ingrese un usuario valido o inicie sesion primero.");
        }
    }

    /**
     * Modifica el identificador del ultimo Chatbot utilizado
     * @param currentChatbotID El identificador del Chatbot
     */
    public void setCurrentChatbotID(int currentChatbotID) {
        this.currentChatbotID = currentChatbotID;
    }

    /**
     * Modifica el identificador del ultimo Flow utilizado
     * @param currentFlowID El identificador del Flow
     */
    public void setCurrentFlowID(int currentFlowID) {
        this.currentFlowID = currentFlowID;
    }

    /**
     * Imprime los nombres de los User del System
     */
    public void printUsers() {
        for(UserInterface_21065666_VeraRojas user: this.users){
            System.out.println(user.getName());
        }
        System.out.println("");
    }

    /**
     * Obtiene al User con sesion iniciada
     * @return Devuelve el User con sesion iniciada
     */
    public UserInterface_21065666_VeraRojas getUserLogged() {
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(this.currentUser)){
                return user;
            }
        }
        return null;
    }

    /**
     * Verifica si un Usuario es administrador
     * @param username Nombre del User a ser verficado
     * @return Devuelve el User con sesion iniciada
     */
    public boolean userIsAdminUser(String username){
        for(UserInterface_21065666_VeraRojas user: this.users){
            if(user.getName().equals(username) && user.isAdminUser() == true){
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si existe un Chatbot dado un identificador
     * @param id El identificador del Chatbot
     * @return El booleano representa la existencia del Chatbot en el System
     */
    public boolean chatbotExistByID(int id) {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots) {
            if(chatbot.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si existe un Flow dado un identificador de Chatbot y Flow
     * @param chatbotID El identificador del Chatbot
     * @param flowID El identificador del Flow
     * @return El booleano representa la existencia del Flow
     */
    public boolean flowExistByFlowID(int chatbotID, int flowID) {
        Chatbot_21065666_VeraRojas chatbot = getChatbotByID(chatbotID);
        return chatbot.flowExistByID(flowID);
    }

    /**
     * Agrega un Flow a un Chatbot dado un identificador de Chatbot
     * @param chatbotID Identificador del Chatbot
     * @param flow Flow a ser agregado
     */
    public void addFlowToChatbotByChatbotID(int chatbotID, Flow_21065666_VeraRojas flow) {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots) {
            if(chatbot.getId() == chatbotID) {
                chatbot.chatbotAddFlow(flow);
            }
        }
    }

    /**
     * Agrega una Option a un Flow dado un identificador del Flow y Chatbot
     * @param chatbotID Identificadro del Chatbot
     * @param flowID Identificador del Flow
     * @param option Option a ser agregada
     */
    public void addOptionToFlowByChatbotFlowIDs(int chatbotID, int flowID, Option_21065666_VeraRojas option) {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots) {
            if (chatbot.getId() == chatbotID) {
                chatbot.addOptionToFlowByFlowID(flowID, option);
            }
        }
    }

    /**
     * Imprime los nombres de los Chatbots
     */
    public void printChatbots() {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            System.out.println(chatbot.getId() + ". " + chatbot.getName());
        }
    }

    /**
     * Imprime todo el contenido de los Chatbots, Flows y Options
     */
    public void printChatbotsFlowsOptions() {
        for(Chatbot_21065666_VeraRojas chatbot: this.chatbots){
            System.out.println("Chatbot: " + chatbot.getId() + ". " + chatbot.getName() + "   startFlowID = " + chatbot.getStartFlowID());
            chatbot.printFlows();
        }
    }

    /**
     * Imprime los nombres de los Flows de un Chatbot
     * @param chatbotID Identificador del Chatbot al que se le imprimiran los Flows
     */
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
