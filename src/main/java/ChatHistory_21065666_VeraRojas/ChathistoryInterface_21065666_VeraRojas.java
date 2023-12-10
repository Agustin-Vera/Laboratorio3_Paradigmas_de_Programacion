package ChatHistory_21065666_VeraRojas;

/**
 * Interface Chathistory
 * @author Agustin Vera
 */
public interface ChathistoryInterface_21065666_VeraRojas {

    /**
     * Obtiene el nombre del usuario al cual le pertenece el Chathistory
     * @return Devuelve el nombre del usuario
     */
    String getUsername();

    /**
     * Obtiene el historial entre el usuario y chatbots
     * @return Devuelve el historial entre usuario y chatbots
     */
    String getHistory();

    /**
     * Modifica el historial de Chathistory agregando contenido a este
     * @param newInteraction Nueva interaccion entre el usuario y un Chatbot
     */
    void setHistory(String newInteraction);
}
