package ChatHistory_21065666_VeraRojas;

/**
 * Clase Chathistory
 * @author Agustin Vera
 */
public class Chathistory_21065666_VeraRojas implements ChathistoryInterface_21065666_VeraRojas{

    /**
     * Nombre del usuario al cual le pertenece el Chathistory
     */
    private String username;

    /**
     * Historial entre usuario y chatbots
     */
    private String history;

    /**
     * Instancia un Chathistory
     * @param username Nombre del usuario al que le pertenece el Chathistory
     */
    public Chathistory_21065666_VeraRojas(String username) {
        this.username = username;
        this.history = "";
    }

    /**
     * Obtiene el nombre del usuario al cual le pertenece el Chathistory
     * @return Devuelve el nombre del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Obtiene el historial entre el usuario y chatbots
     * @return Devuelve el historial entre usuario y chatbots
     */
    public String getHistory() {
        return history;
    }

    /**
     * Modifica el historial de Chathistory agregando contenido a este
     * @param newInteraction Nueva interaccion entre el usuario y un Chatbot
     */
    public void setHistory(String newInteraction) {
        this.history = this.history + newInteraction;
    }

    @Override
    public String toString() {
        return "Chathistory_21065666_VeraRojas{" +
                "username='" + username + '\'' +
                ", history='" + history + '\'' +
                '}';
    }
}
