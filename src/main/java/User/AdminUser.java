package User;

import Chatbot.Chatbot;
import Flow.Flow;
import Option.Option;
import System.System;

import java.util.ArrayList;

/**
 * Clase AdminUser
 * @author Agustin Vera
 */
public class AdminUser implements UserInterface {

    /**
     * Nombre del AdminUser
     */
    private String name;

    /**
     * Booleano representador de si NormalUser es administrador
     */
    private boolean adminUser;

    /**
     * Instancia un AdminUser
     * @param name Nombre del AdminUser
     */
    public AdminUser(String name) {
        this.name = name;
        this.adminUser = true;
    }

    /**
     * Obtiene el nombre del AdminUser
     * @return Devuelve el nombre del AdminUser
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el booleano representador de si es AdminUser
     * @return Devuelve el booleano representador de si AdminUser es administrador
     */
    public boolean isAdminUser() {
        return adminUser;
    }

    /**
     * Permite a un AdminUser conversar con un Chatbot
     * @param sys System contenedor de los Chatbots
     * @param message Mensaje del AdminUser
     */
    public void talkToChatbot(System sys, String message) {
        sys.systemTalk(message);
    }

    /**
     * Permite ver todos los Chatbots del System
     * @param sys System contenedor de Chatbots
     */
    public void verChatbots(System sys){
        sys.printChatbots();
    }

    /**
     * Permite ver todos los Chatbots con sus Flows y Options
     * @param sys System contenedor de Chatbots
     */
    public void verChatbotsFlowsOptions(System sys) {
        sys.printChatbotsFlowsOptions();
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "name='" + name + '\'' +
                ", adminUser=" + adminUser +
                '}';
    }

    /**
     * Permite a un AdminUser crear una Option
     * @param code Identificador de la Option
     * @param message Mensaje de la Option
     * @param chatbotCodeLink Identificador del Chatbot al cual apunta la Option
     * @param initialFlowCodeLink Indentificador del Flow al cual apunta la Option
     * @param keyword Lista de las palabras clave de la Option
     * @return La Option creada
     */
    public Option makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword){
        Option option = new Option(code, message, chatbotCodeLink, initialFlowCodeLink, keyword);
        return option;
    }

    /**
     * Permite a un AdminUser crear un Flow
     * @param id Identificador del Flow
     * @param nameMsg Nombre y mensaje del Flow
     * @param options Options del Flow
     * @return El Flow creado
     */
    public Flow makeFlow(int id, String nameMsg, ArrayList<Option> options){
        Flow flow = new Flow(id, nameMsg, options);
        return flow;
    }

    /**
     * Permite a un AdminUser crear un Chatbot
     * @param chatbotID Identificador del Chatbot
     * @param chatbotName Nombre del Chatbot
     * @param chatbotWelcomeMessage Mensaje de bienvenida del Chatbot
     * @param chatbotStartFlowID Identificador del Flow inicial
     * @param flows Flows del Chatbot
     * @return EL Chatbot creado
     */
    public Chatbot makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow> flows){
        Chatbot chatbot = new Chatbot(chatbotID, chatbotName, chatbotWelcomeMessage, chatbotStartFlowID, flows);
        return chatbot;
    }

    /**
     * Permite a un AdminUser agregar un Flow a un Chatbot
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flow Flow a ser agregado
     */
    public void addFlow(System sys, int chatbotID, Flow flow) {
        sys.addFlowToChatbotByChatbotID(chatbotID, flow);
    }

    /**
     * Permite a un AdminUser agregar una Option a un Flow
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flowID Identificador del Flow
     * @param option Option a ser agregada
     */
    public void addOption(System sys, int chatbotID, int flowID, Option option) {
        sys.addOptionToFlowByChatbotFlowIDs(chatbotID, flowID, option);
    }
}

