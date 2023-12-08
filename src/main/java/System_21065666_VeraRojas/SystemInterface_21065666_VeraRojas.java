package System_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import User_21065666_VeraRojas.UserInterface_21065666_VeraRojas;

import java.util.ArrayList;

public interface SystemInterface_21065666_VeraRojas {


    ArrayList<Chatbot_21065666_VeraRojas> getUniqueChatbots(ArrayList<Chatbot_21065666_VeraRojas> chatbots);

    void systemAddChatbot(Chatbot_21065666_VeraRojas chatbot);

    boolean chatbotExist(Chatbot_21065666_VeraRojas newChatbot);

    void systemAddUser(UserInterface_21065666_VeraRojas user);

    boolean userExist(UserInterface_21065666_VeraRojas newUser);

    void systemLogin(String username);

    boolean usersLogged();

    boolean userExistByName(String username);

    void systemLogout();

    void systemTalk(String message);

    void addInteractionToChathistory(String username, String interaction);

    String makeInteraction(String username, String message, Chatbot_21065666_VeraRojas chatbotDestino, Flow_21065666_VeraRojas flowDestino);

    Chatbot_21065666_VeraRojas getChatbotByID(int id);

    void systemSynthesis(String username);


    void printUsers();

    UserInterface_21065666_VeraRojas getUserLogged();

    boolean userIsAdminUser(String username);


}
