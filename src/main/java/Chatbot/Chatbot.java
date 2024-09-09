package Chatbot;

import Flow.Flow;
import Option.Option;

import java.util.ArrayList;

/**
 * Clase Chatbot
 * @author Agustin Vera
 */
public class Chatbot implements ChatbotInterface {

    /**
     * Identificador del Chatbot
     */
    private int id;

    /**
     * Nombre del Chatbot
     */
    private String name;

    /**
     * Mensaje de bienvenida del Chatbot
     */
    private String welcomeMessage;

    /**
     * Identificador del Flow inicial
     */
    private int startFlowID;

    /**
     * Los Flows del Chatbot
     */
    private ArrayList<Flow> flows;

    // ########### RF4 - TDA Chatbot - Constructor ################

    /**
     * Instancia un Chatbot
     * @param id El identificador del Chatbot
     * @param name El nombre del Chatbot
     * @param welcomeMessage El mensaje de bienvenida del Chatbot
     * @param startFlowID El identificador del Flow inicial del Chatbot
     * @param flows Los Flows del Chatbot
     */
    public Chatbot(int id, String name, String welcomeMessage, int startFlowID, ArrayList<Flow> flows) {
        this.id = id;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowID = startFlowID;
        this.flows = getUniqueFlows(flows);
    }

    /**
     * Obtiene el Identificador del Flow inicial
     * @return Devuelve el identificador del Flow inicial
     */
    public int getStartFlowID() {
        return startFlowID;
    }

    /**
     * Obtiene el identificador del Chatbot
     * @return Devuelve el identificador del Chatbot
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del Chatbot
     * @return Devuelve el nombre del Chatbot
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene las primeras instancias de los Flows
     * @param flows Lista de Flows
     * @return Devuelve la lista con las primeras instancias de los Flows
     */
    public ArrayList<Flow> getUniqueFlows(ArrayList<Flow> flows){
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

    /**
     * Agrega un Flow a un Chatbot
     * @param flow Flow a ser agregado
     */
    public void chatbotAddFlow(Flow flow){
        if(this.flowExist(flow)){
            System.out.println("Ya existe un flujo con ese identificador dentro del chatbot, pruebe con otro.");
        }
        this.flows.add(flow);
        System.out.println("Flujo " + flow.getId() + " fue agregado con exito.");
    }


    /**
     * Verifica si un Flow existe en el chatbot
     * @param newFlow Flow a ser verificado
     * @return El booleano representador de la existencia del Flow
     */
    public boolean flowExist(Flow newFlow){
        for(Flow flow: this.flows){
            if(flow.getId() == newFlow.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene un Flow dado un identificador
     * @param id El identificador del Flow a ser buscado
     * @return Devuelve el Flow con el id respectivo
     */
    public Flow getFlowByID(int id){
        for(Flow flow: this.flows){
            if(flow.getId() == id){
                return flow;
            }
        }
        return null;
    }

    /**
     * Verifica si un Flow existe dado su identificador
     * @param flowID El identificador del Flow a verificar
     * @return El booleano representador de la existencia del Flow
     */
    public boolean flowExistByID(int flowID) {
        for(Flow flow: this.flows) {
            if(flow.getId() == flowID) {
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega una Option a un Flow
     * @param flowID El identificador del Flow
     * @param option La Option a ser agregada
     */
    public void addOptionToFlowByFlowID(int flowID, Option option) {
        for (Flow flow : this.flows) {
            if (flow.getId() == flowID) {
                flow.flowAddOption(option);
            }
        }
    }

    /**
     * Imprime los Flows del Chatbot
     */
    public void printFlows() {
        for(Flow flow: this.flows){
            System.out.println("    " + "Flow: " + flow.getId() + ". " + flow.getNameMsg());
            flow.printOptions();
        }
    }

    /**
     * Imprime los nombre de los Flows del Chatbot
     */
    public void printFlowNames() {
        for(Flow flow: this.flows){
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
