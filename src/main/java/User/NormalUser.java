package User;

import Chatbot.Chatbot;
import Flow.Flow;
import Option.Option;
import System.System;

import java.util.ArrayList;

/**
 * Clase NormalUser
 * @author Agustin Vera
 */
public class NormalUser implements UserInterface {

    /**
     * Nombre del NormalUser
     */
    private String name;

    /**
     * Booleano representador de si NormalUser es administrador
     */
    private boolean adminUser;

    /**
     * Instacia un NormalUser
     * @param name Nombre del NormalUser
     */
    public NormalUser(String name) {
        this.name = name;
        this.adminUser = false;
    }

    /**
     * Obtiene el nombre del NormalUser
     * @return Devuelve el nombre del NormalUser
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el booleano representador de si es AdminUser
     * @return Devuevle el booleano representador de si NormalUser es administrador
     */
    public boolean isAdminUser() {
        return adminUser;
    }

    /**
     * Permite la interaccion entre el NormalUser y el System
     * @param sys System contenedor de los Chatbots
     * @param message Mensaje del NormalUser
     */
    public void talkToChatbot(System sys, String message) {
        sys.systemTalk(message);
    }

    /**
     * Imprime los Chatbots del System
     * @param sys System contenedor de Chatbots
     */
    public void verChatbots(System sys){
        sys.printChatbots();
    }

    /**
     * Imprime los Chatbots con sus Flows y Options
     * @param sys System contenedor de Chatbots
     */
    public void verChatbotsFlowsOptions(System sys) {
        sys.printChatbotsFlowsOptions();
    }

    /**
     * NO permite a un NormalUser crear una Option
     * @param code Identificador de la Option
     * @param message Mensaje de la Option
     * @param chatbotCodeLink Identificador del Chatbot al cual apunta la Option
     * @param initialFlowCodeLink Identificador del Flow al cual apunta la Option
     * @param keyword Lista de palabras clave de la Option
     * @return Null debido a que no tiene permitido crear una Option
     */
    public Option makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword){
        java.lang.System.out.println("Usted no es usuario administrador.");
        return null;
    }

    /**
     * NO permite a un NormalUser crear un Flow
     * @param id Identificador del Flow
     * @param nameMsg Nombre y mensaje del Flow
     * @param options Options del Flow
     * @return Null debido a que no tiene permitido crear un Flow
     */
    public Flow makeFlow(int id, String nameMsg, ArrayList<Option> options){
        java.lang.System.out.println("Usted no es usuario administrador.");
        return null;
    }

    /**
     * NO permite a un NormalUser crear un Chatbot
     * @param chatbotID Identificador del Chatbot
     * @param chatbotName Nombre del Chatbot
     * @param chatbotWelcomeMessage Mensaje de bienvenida del Chatbot
     * @param chatbotStartFlowID Identificador del Flow inicial
     * @param flows Flows del Chatbot
     * @return Null debido a que no tiene permitido crear un Chatbot
     */
    public Chatbot makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow> flows){
        java.lang.System.out.println("Usted no es usuario administrador.");
        return null;
    }

    /**
     * NO permite agregar un Flow a un Chatbot
     * @param sys System contenedor del Flow
     * @param chatbotID Identificador del Chatbot al cual se le agrega el Flow
     * @param flow Flow a ser agregado
     */
    public void addFlow(System sys, int chatbotID, Flow flow) {
        java.lang.System.out.println("Usted no es usuario administrador.");
    }

    /**
     * NO permite agregar una Option a un Flow
     * @param sys System contenedor de Flows
     * @param chatbotID Identificador del Chatbot contenedor de Flows
     * @param flowID Identificador del Flow
     * @param option Option a ser agregada
     */
    public void addOption(System sys, int chatbotID, int flowID, Option option) {
        java.lang.System.out.println("Usted no es usuario administrador.");
    }

    @Override
    public String toString() {
        return "NormalUser_21065666_VeraRojas{" +
                "name='" + name + '\'' +
                ", adminUser=" + adminUser +
                '}';
    }
}
