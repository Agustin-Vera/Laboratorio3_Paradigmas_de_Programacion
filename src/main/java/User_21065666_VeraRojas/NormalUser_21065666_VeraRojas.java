package User_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import System_21065666_VeraRojas.System_21065666_VeraRojas;

import java.util.ArrayList;

public class NormalUser_21065666_VeraRojas implements UserInterface_21065666_VeraRojas {

    private String name;
    private boolean adminUser;


    public NormalUser_21065666_VeraRojas(String name) {
        this.name = name;
        this.adminUser = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAdminUser() {
        return adminUser;
    }


    public void talkToChatbot(System_21065666_VeraRojas sys, String message) {
        sys.systemTalk(message);
    }

    public void getUserSynthesis(System_21065666_VeraRojas sys, String username) {
        sys.systemSynthesis(username);
    }

    public void verChatbots(System_21065666_VeraRojas sys){
        sys.printChatbots();
    }



    public void verChatbotsFlowsOptions(System_21065666_VeraRojas sys) {
        sys.printChatbotsFlowsOptions();
    }

    public Option_21065666_VeraRojas makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword){
        System.out.println("Usted no es usuario administrador.");
        return null;
    }

    public Flow_21065666_VeraRojas makeFlow(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options){
        System.out.println("Usted no es usuario administrador.");
        return null;
    }

    public Chatbot_21065666_VeraRojas makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow_21065666_VeraRojas> flows){
        System.out.println("Usted no es usuario administrador.");
        return null;
    }

    public void addFlow(System_21065666_VeraRojas sys, int chatbotID, Flow_21065666_VeraRojas flow) {
        System.out.println("Usted no es usuario administrador.");
    }
    public void addOption(System_21065666_VeraRojas sys, int chatbotID, int flowID, Option_21065666_VeraRojas option) {
        System.out.println("Usted no es usuario administrador.");
    }

    @Override
    public String toString() {
        return "NormalUser_21065666_VeraRojas{" +
                "name='" + name + '\'' +
                ", adminUser=" + adminUser +
                '}';
    }
}
