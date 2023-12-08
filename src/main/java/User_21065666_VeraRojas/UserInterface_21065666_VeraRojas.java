package User_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import System_21065666_VeraRojas.System_21065666_VeraRojas;

import java.util.ArrayList;

public interface UserInterface_21065666_VeraRojas {



    // Metodos de ambos Usuarios
    String getName();

    boolean isAdminUser();



    void talkToChatbot(System_21065666_VeraRojas sys, String message);

    void getUserSynthesis(System_21065666_VeraRojas sys, String username);

    void verChatbots(System_21065666_VeraRojas sys);

    void verChatbotsFlowsOptions(System_21065666_VeraRojas sys);

    Option_21065666_VeraRojas makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword);

    Flow_21065666_VeraRojas makeFlow(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options);

    Chatbot_21065666_VeraRojas makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow_21065666_VeraRojas> flows);

    void addFlow(System_21065666_VeraRojas sys, int chatbotID, Flow_21065666_VeraRojas flow);

    void addOption(System_21065666_VeraRojas sys, int chatbotID, int flowID, Option_21065666_VeraRojas option);

}
