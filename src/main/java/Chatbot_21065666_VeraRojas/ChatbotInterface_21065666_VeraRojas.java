package Chatbot_21065666_VeraRojas;

import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;

import java.util.ArrayList;

public interface ChatbotInterface_21065666_VeraRojas {

    ArrayList<Flow_21065666_VeraRojas> getUniqueFlows(ArrayList<Flow_21065666_VeraRojas> flows);

    void chatbotAddFlow(Flow_21065666_VeraRojas flow);

    boolean flowExist(Flow_21065666_VeraRojas newFlow);

    Flow_21065666_VeraRojas getFlowByID(int id);


    boolean flowExistByID(int flowID);

    void addOptionToFlowByFlowID(int flowID, Option_21065666_VeraRojas option);


}
