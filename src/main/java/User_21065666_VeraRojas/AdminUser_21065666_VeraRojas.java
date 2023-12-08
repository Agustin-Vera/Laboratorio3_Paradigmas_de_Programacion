package User_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import System_21065666_VeraRojas.System_21065666_VeraRojas;

import java.util.ArrayList;

public class AdminUser_21065666_VeraRojas implements UserInterface_21065666_VeraRojas{

    private String name;
    private boolean adminUser;

    public AdminUser_21065666_VeraRojas(String name) {
        this.name = name;
        this.adminUser = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAdminUser() {
        return adminUser;
    }

    public void addOptionToFlow(Flow_21065666_VeraRojas flow, Option_21065666_VeraRojas option) {
        flow.flowAddOption(option);
    }


    public void addFlowToChatbot() {

    }


    public void addChatbotToSystem(System_21065666_VeraRojas sys, Chatbot_21065666_VeraRojas chatbot) {
        sys.systemAddChatbot(chatbot);
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

    @Override
    public String toString() {
        return "AdminUser{" +
                "name='" + name + '\'' +
                ", adminUser=" + adminUser +
                '}';
    }

    public Option_21065666_VeraRojas makeOption(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword){
        Option_21065666_VeraRojas option = new Option_21065666_VeraRojas(code, message, chatbotCodeLink, initialFlowCodeLink, keyword);
        return option;
    }

    public Flow_21065666_VeraRojas makeFlow(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options){
        Flow_21065666_VeraRojas flow = new Flow_21065666_VeraRojas(id, nameMsg, options);
        return flow;
    }

    public Chatbot_21065666_VeraRojas makeChatbot(int chatbotID, String chatbotName, String chatbotWelcomeMessage, int chatbotStartFlowID, ArrayList<Flow_21065666_VeraRojas> flows){
        Chatbot_21065666_VeraRojas chatbot = new Chatbot_21065666_VeraRojas(chatbotID, chatbotName, chatbotWelcomeMessage, chatbotStartFlowID, flows);
        return chatbot;
    }

    public void addFlow(System_21065666_VeraRojas sys, int chatbotID, Flow_21065666_VeraRojas flow) {
        sys.addFlowToChatbotByChatbotID(chatbotID, flow);
    }

    public void addOption(System_21065666_VeraRojas sys, int chatbotID, int flowID, Option_21065666_VeraRojas option) {
        sys.addOptionToFlowByChatbotFlowIDs(chatbotID, flowID, option);
    }


}

