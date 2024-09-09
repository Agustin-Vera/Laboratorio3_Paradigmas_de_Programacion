package User;

import Chatbot.Chatbot;
import Flow.Flow;
import Option.Option;
import System.System;

import java.util.ArrayList;

/**
 * Interface User
 * @author Agustin Vera
 */
public interface UserInterface {

    /**
     * Obtiene el nombre del AdminUser
     * @return Devuelve el nombre del User
     */
    String getName();

    /**
     * Obtiene el booleano representador de si es User
     * @return Devuelve el booleano representador de si User es administrador
     */
    boolean isAdminUser();

    /**
     * Permite a un User conversar con un Chatbot
     * @param sys System contenedor de los Chatbots
     * @param message Mensaje del AdminUser
     */
    void talkToChatbot(System sys, String message);

    /**
     * Permite ver todos los Chatbots del System
     * @param sys System contenedor de Chatbots
     */
    void verChatbots(System sys);

    /**
     * Permite ver todos los Chatbots con sus Flows y Options
     * @param sys System contenedor de Chatbots
     */
    void verChatbotsFlowsOptions(System sys);

    /**
     * Permite a un User crear una Option
     * @param code Identificador de la Option
     * @param message Mensaje de la Option
     * @param chatbotCodeLink Identificador del Chatbot al cual apunta la Option
     * @param initialFlowCodeLink Indentificador del Flow al cual apunta la Option
     * @param keyword Lista de las palabras clave de la Option
     * @return La Option creada
     */
    Option makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword);

    /**
     * Permite a un User crear un Flow
     * @param id Identificador del Flow
     * @param nameMsg Nombre y mensaje del Flow
     * @param options Options del Flow
     * @return El Flow creado
     */
    Flow makeFlow(int id, String nameMsg, ArrayList<Option> options);

    /**
     * Permite a un User crear un Chatbot
     * @param chatbotID Identificador del Chatbot
     * @param chatbotName Nombre del Chatbot
     * @param chatbotWelcomeMessage Mensaje de bienvenida del Chatbot
     * @param chatbotStartFlowID Identificador del Flow inicial
     * @param flows Flows del Chatbot
     * @return EL Chatbot creado
     */
    Chatbot makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow> flows);

    /**
     * Permite a un User agregar un Flow a un Chatbot
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flow Flow a ser agregado
     */
    void addFlow(System sys, int chatbotID, Flow flow);

    /**
     * Permite a un User agregar una Option a un Flow
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flowID Identificador del Flow
     * @param option Option a ser agregada
     */
    void addOption(System sys, int chatbotID, int flowID, Option option);

}
