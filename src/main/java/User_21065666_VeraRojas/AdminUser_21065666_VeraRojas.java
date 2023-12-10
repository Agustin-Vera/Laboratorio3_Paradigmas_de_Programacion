package User_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import System_21065666_VeraRojas.System_21065666_VeraRojas;

import java.util.ArrayList;

/**
 * Clase AdminUser
 * @author Agustin Vera
 */
public class AdminUser_21065666_VeraRojas implements UserInterface_21065666_VeraRojas{

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
    public AdminUser_21065666_VeraRojas(String name) {
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
    public void talkToChatbot(System_21065666_VeraRojas sys, String message) {
        sys.systemTalk(message);
    }

    /**
     * Permite ver todos los Chatbots del System
     * @param sys System contenedor de Chatbots
     */
    public void verChatbots(System_21065666_VeraRojas sys){
        sys.printChatbots();
    }

    /**
     * Permite ver todos los Chatbots con sus Flows y Options
     * @param sys System contenedor de Chatbots
     */
    public void verChatbotsFlowsOptions(System_21065666_VeraRojas sys) {
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
    public Option_21065666_VeraRojas makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword){
        Option_21065666_VeraRojas option = new Option_21065666_VeraRojas(code, message, chatbotCodeLink, initialFlowCodeLink, keyword);
        return option;
    }

    /**
     * Permite a un AdminUser crear un Flow
     * @param id Identificador del Flow
     * @param nameMsg Nombre y mensaje del Flow
     * @param options Options del Flow
     * @return El Flow creado
     */
    public Flow_21065666_VeraRojas makeFlow(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options){
        Flow_21065666_VeraRojas flow = new Flow_21065666_VeraRojas(id, nameMsg, options);
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
    public Chatbot_21065666_VeraRojas makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow_21065666_VeraRojas> flows){
        Chatbot_21065666_VeraRojas chatbot = new Chatbot_21065666_VeraRojas(chatbotID, chatbotName, chatbotWelcomeMessage, chatbotStartFlowID, flows);
        return chatbot;
    }

    /**
     * Permite a un AdminUser agregar un Flow a un Chatbot
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flow Flow a ser agregado
     */
    public void addFlow(System_21065666_VeraRojas sys, int chatbotID, Flow_21065666_VeraRojas flow) {
        sys.addFlowToChatbotByChatbotID(chatbotID, flow);
    }

    /**
     * Permite a un AdminUser agregar una Option a un Flow
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flowID Identificador del Flow
     * @param option Option a ser agregada
     */
    public void addOption(System_21065666_VeraRojas sys, int chatbotID, int flowID, Option_21065666_VeraRojas option) {
        sys.addOptionToFlowByChatbotFlowIDs(chatbotID, flowID, option);
    }
}

