package Chatbot_21065666_VeraRojas;

import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;

import java.util.ArrayList;

/**
 * Interface Chatbot
 * @author Agustin Vera
 */
public interface ChatbotInterface_21065666_VeraRojas {

    /**
     * Obtiene las primeras instancias de los Flows
     * @param flows Lista de Flows
     * @return Devuelve la lista con las primeras instancias de los Flows
     */
    ArrayList<Flow_21065666_VeraRojas> getUniqueFlows(ArrayList<Flow_21065666_VeraRojas> flows);

    /**
     * Agrega un Flow a un Chatbot
     * @param flow Flow a ser agregado
     */
    void chatbotAddFlow(Flow_21065666_VeraRojas flow);

    /**
     * Verifica si un Flow existe en el chatbot
     * @param newFlow Flow a ser verificado
     * @return El booleano representador de la existencia del Flow
     */
    boolean flowExist(Flow_21065666_VeraRojas newFlow);

    /**
     * Obtiene un Flow dado un identificador
     * @param id El identificador del Flow a ser buscado
     * @return Devuelve el Flow con el id respectivo
     */
    Flow_21065666_VeraRojas getFlowByID(int id);

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
    void addOptionToFlowByFlowID(int flowID, Option_21065666_VeraRojas option);

}
