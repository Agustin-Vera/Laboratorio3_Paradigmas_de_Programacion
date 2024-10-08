package System;

import Chatbot.Chatbot;
import Flow.Flow;
import User.UserInterface;

import java.util.ArrayList;

/**
 * Interface System
 * @author Agustin Vera
 */
public interface SystemInterface {

    /**
     * Obtiene las primeras instancias de los Chatbots ingresados
     * @param chatbots Los Chatbots del System
     * @return Devuelve las primeras ocurrencias de los Chatbots
     */
    ArrayList<Chatbot> getUniqueChatbots(ArrayList<Chatbot> chatbots);

    /**
     * Agrega un Chatbot al System
     * @param chatbot El Chatbot a ser agregado
     */
    void systemAddChatbot(Chatbot chatbot);

    /**
     * Verifica si un chatbot existe en el System
     * @param newChatbot El Chatbot a ser agregado
     * @return El booleano que representa si existe o no el Chatbot
     */
    boolean chatbotExist(Chatbot newChatbot);

    /**
     * Agrega un User al System
     * @param user El User a ser agregado
     */
    void systemAddUser(UserInterface user);

    /**
     * Verifica si existe un User en el System
     * @param newUser El User a ser verificado
     * @return El booleano que representa si existe el User
     */
    boolean userExist(UserInterface newUser);

    /**
     * Inicia la sesion de un User
     * @param username Nombre del User a ser iniciado
     */
    void systemLogin(String username);

    /**
     * Verifica si existe algun usuario con la sesion iniciada
     * @return El booleano que representa si existe un User iniciado
     */
    boolean usersLogged();

    /**
     * Verifica si existe un User dado un nombre de usuario
     * @param username Nombre del User a ser verificado
     * @return El booleano que representa si existe el User
     */
    boolean userExistByName(String username);

    /**
     * Cierra la sesion de un User
     */
    void systemLogout();

    /**
     * Permite la interaccion con un Chatbot
     * @param message El mensaje para realizar la interaccion
     */
    void systemTalk(String message);

    /**
     * Agrega una interaccion a un Chathistory
     * @param username El nombre del User que interactua
     * @param interaction La interaccion entre el User y el Chatbot
     */
    void addInteractionToChathistory(String username, String interaction);

    /**
     * Crea el String con un formato representador de la interaccion
     * @param username El nombre del User que envia el mensaje
     * @param message El mensaje realizado por el User
     * @param chatbotDestino El Chatbot al cual apunta el mensaje del User
     * @param flowDestino El Flow al cual apunta el mensaje del User
     * @return El String que representa la interaccion con un formato
     */
    String makeInteraction(String username, String message, Chatbot chatbotDestino, Flow flowDestino);

    /**
     * Obtiene un Chatbot dado un identificador
     * @param id El identificador del Chatbot
     * @return Devuelve el Chatbot
     */
    Chatbot getChatbotByID(int id);

    /**
     * Ofrece una sintesis de las interacciones entre un User y el Chatbot
     * @param username El nombre del User al que se le mostrara sus sintesis
     */
    void systemSynthesis(String username);

    /**
     * Imprime los nombres de los User del System
     */
    void printUsers();

    /**
     * Obtiene al User con sesion iniciada
     * @return Devuelve el User con sesion iniciada
     */
    UserInterface getUserLogged();

    /**
     * Verifica si un Usuario es administrador
     * @param username Nombre del User a ser verficado
     * @return Devuelve el User con sesion iniciada
     */
    boolean userIsAdminUser(String username);

}
