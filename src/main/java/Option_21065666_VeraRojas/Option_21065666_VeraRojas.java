package Option_21065666_VeraRojas;

import java.util.ArrayList;

/**
 * Clase Option
 * @author Agustin Vera
 */
public class Option_21065666_VeraRojas implements OptionInterface_21065666_VeraRojas{

    /**
     * El identificador de la Option
     */
    private int code;

    /**
     * El mensaje respectivo a la Option
     */
    private String message;

    /**
     * El id del Chatbot al que dirige la Option
     */
    private int chatbotCodeLink;

    /**
     * El id del Flow al que dirige la Option
     */
    private int initialFlowCodeLink;

    /**
     * Las keywords de la Option
     */
    private ArrayList<String> keywords;

    /**
     * Instancia una Option
     * @param code el identificador de Option
     * @param message el mensaje que expone la Option
     * @param chatbotCodeLink el id del Chatbot al que dirige link la Option
     * @param initialFlowCodeLink el id del Flow al que dirige la Option
     * @param keywords las keywords de la Option
     */
    public Option_21065666_VeraRojas(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    /**
     * Obtiene el code o identificador de la Option
     * @return Devuelve el code o idenificador
     */
    public int getCode() {
        return code;
    }

    /**
     * Obtiene la lista de keywords de la Option
     * @return Devuelve la lista de keywords
     */
    public ArrayList<String> getKeywords() {
        return keywords;
    }

    /**
     * Obtiene el chatbotCodeLink de la Option
     * @return Devuelve el chatbotCodeLink
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * Obtiene el initialFlowCodeLink de la Option
     * @return Devuelve el initialFlowCodeLink
     */
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * Obtiene el message de la Option
     * @return Devuelve el message
     */
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Option_21065666_VeraRojas{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", chatbotCodeLink=" + chatbotCodeLink +
                ", initialFlowCodeLink=" + initialFlowCodeLink +
                ", keywords=" + keywords +
                '}';
    }

}
