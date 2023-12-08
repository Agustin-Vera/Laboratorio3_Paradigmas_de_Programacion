package Chatbot_21065666_VeraRojas;

import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;

import java.util.ArrayList;

public class Chatbot_21065666_VeraRojas implements ChatbotInterface_21065666_VeraRojas{

    private int id;
    private String name;
    private String welcomeMessage;

    public int getStartFlowID() {
        return startFlowID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

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
    public void chatbotAddFlow(Flow_21065666_VeraRojas flow){
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

    public Flow_21065666_VeraRojas getFlowByID(int id){
        for(Flow_21065666_VeraRojas flow: this.flows){
            if(flow.getId() == id){
                return flow;
            }
        }
        return null;
    }

    public boolean flowExistByID(int flowID) {
        for(Flow_21065666_VeraRojas flow: this.flows) {
            if(flow.getId() == flowID) {
                return true;
            }
        }
        return false;
    }

    public void addOptionToFlowByFlowID(int flowID, Option_21065666_VeraRojas option) {
        for (Flow_21065666_VeraRojas flow : this.flows) {
            if (flow.getId() == flowID) {
                flow.flowAddOption(option);
            }
        }
    }

    public void printFlows() {
        for(Flow_21065666_VeraRojas flow: this.flows){
            System.out.println("    " + flow.getId() + ". " + flow.getNameMsg());
            flow.printOptions();
        }
    }

    public void printFlowNames() {
        for(Flow_21065666_VeraRojas flow: this.flows){
            System.out.println(flow.getId() + ". " + flow.getNameMsg());
        }
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
