package org.example;

import java.util.ArrayList;

public class Chatbot_21065666_VeraRojas {

    private int id;
    private String name;
    private String welcomeMessage;
    private int startFlowID;
    private ArrayList<Flow_21065666_VeraRojas> flows;


    // ########### RF4 - TDA Chatbot - Constructor ################
    public Chatbot_21065666_VeraRojas(int id, String name, String welcomeMessage, int startFlowID, ArrayList<Flow_21065666_VeraRojas> flows) {
        this.id = id;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowID = startFlowID;
        this.flows = getUniqueFlows(flows);
    }

    public ArrayList<Flow_21065666_VeraRojas> getUniqueFlows(ArrayList<Flow_21065666_VeraRojas> flows){
        for(int i = 0; i < flows.size(); i++){
            for(int j = i+1; j < flows.size(); j++){
                if(flows.get(i).getId() == flows.get(j).getId()){
                    flows.remove(j);
                    j--;
                }
            }
        }
        return flows;
    }

    // ########### RF5 - TDA Chatbot - Modificador ################
    private void chatbotAddFlow(Flow_21065666_VeraRojas flow){
        if(this.flowExist(flow)){
            System.out.println("Ya existe un flujo con ese identificador dentro del chatbot, pruebe con otro.");
        }
        this.flows.add(flow);
        System.out.println("Flujo " + flow.getId() + " fue agregado con exito.");
    }

    // Verifica si un flow existe en el chatbot
    public boolean flowExist(Flow_21065666_VeraRojas newFlow){
        for(Flow_21065666_VeraRojas flow: this.flows){
            if(flow.getId() == newFlow.getId()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Chatbot_21065666_VeraRojas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", welcomeMessage='" + welcomeMessage + '\'' +
                ", startFlowID=" + startFlowID +
                ", flows=" + flows +
                '}';
    }
}
