package User_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import System_21065666_VeraRojas.System_21065666_VeraRojas;

import java.util.ArrayList;

/**
 * Interface User
 * @author Agustin Vera
 */
public interface UserInterface_21065666_VeraRojas {

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
    void talkToChatbot(System_21065666_VeraRojas sys, String message);
    
    /**
     * Permite ver todos los Chatbots del System
     * @param sys System contenedor de Chatbots
     */
    void verChatbots(System_21065666_VeraRojas sys);

    /**
     * Permite ver todos los Chatbots con sus Flows y Options
     * @param sys System contenedor de Chatbots
     */
    void verChatbotsFlowsOptions(System_21065666_VeraRojas sys);

    /**
     * Permite a un User crear una Option
     * @param code Identificador de la Option
     * @param message Mensaje de la Option
     * @param chatbotCodeLink Identificador del Chatbot al cual apunta la Option
     * @param initialFlowCodeLink Indentificador del Flow al cual apunta la Option
     * @param keyword Lista de las palabras clave de la Option
     * @return La Option creada
     */
    Option_21065666_VeraRojas makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword);

    /**
     * Permite a un User crear un Flow
     * @param id Identificador del Flow
     * @param nameMsg Nombre y mensaje del Flow
     * @param options Options del Flow
     * @return El Flow creado
     */
    Flow_21065666_VeraRojas makeFlow(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options);

    /**
     * Permite a un User crear un Chatbot
     * @param chatbotID Identificador del Chatbot
     * @param chatbotName Nombre del Chatbot
     * @param chatbotWelcomeMessage Mensaje de bienvenida del Chatbot
     * @param chatbotStartFlowID Identificador del Flow inicial
     * @param flows Flows del Chatbot
     * @return EL Chatbot creado
     */
    Chatbot_21065666_VeraRojas makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow_21065666_VeraRojas> flows);

    /**
     * Permite a un User agregar un Flow a un Chatbot
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flow Flow a ser agregado
     */
    void addFlow(System_21065666_VeraRojas sys, int chatbotID, Flow_21065666_VeraRojas flow);

    /**
     * Permite a un User agregar una Option a un Flow
     * @param sys System contenedor de Chatbots
     * @param chatbotID Identificador del Chatbot
     * @param flowID Identificador del Flow
     * @param option Option a ser agregada
     */
    void addOption(System_21065666_VeraRojas sys, int chatbotID, int flowID, Option_21065666_VeraRojas option);

}
