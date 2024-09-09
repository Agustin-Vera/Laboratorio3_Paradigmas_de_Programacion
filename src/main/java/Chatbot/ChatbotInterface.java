package Chatbot;

import Flow.Flow;
import Option.Option;

import java.util.ArrayList;

/**
 * Interface Chatbot
 * @author Agustin Vera
 */
public interface ChatbotInterface {

    /**
     * Obtiene las primeras instancias de los Flows
     * @param flows Lista de Flows
     * @return Devuelve la lista con las primeras instancias de los Flows
     */
    ArrayList<Flow> getUniqueFlows(ArrayList<Flow> flows);

    /**
     * Agrega un Flow a un Chatbot
     * @param flow Flow a ser agregado
     */
    void chatbotAddFlow(Flow flow);

    /**
     * Verifica si un Flow existe en el chatbot
     * @param newFlow Flow a ser verificado
     * @return El booleano representador de la existencia del Flow
     */
    boolean flowExist(Flow newFlow);

    /**
     * Obtiene un Flow dado un identificador
     * @param id El identificador del Flow a ser buscado
     * @return Devuelve el Flow con el id respectivo
     */
    Flow getFlowByID(int id);

    /**
     * Verifica si un Flow existe dado su identificador
     * @param flowID El identificador del Flow a verificar
     * @return El booleano representador de la existencia del Flow
     */
    boolean flowExistByID(int flowID);

    /**
     * Agrega una Option a un Flow
     * @param flowID El identificador del Flow
     * @param option La Option a ser agregada
     */
    void addOptionToFlowByFlowID(int flowID, Option option);

}
