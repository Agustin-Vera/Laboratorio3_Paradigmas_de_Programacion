package Option;

import java.util.ArrayList;

/**
 * Interface Flow
 * @author Agustin Vera
 */
public interface OptionInterface {

    /**
     * Obtiene el code o identificador de la Option
     * @return Devuelve el code o idenificador
     */
    int getCode();

    /**
     * Obtiene el message de la Option
     * @return Devuelve el message
     */
    String getMessage();

    /**
     * Obtiene la lista de keywords de la Option
     * @return Devuelve la lista de keywords
     */
    ArrayList<String> getKeywords();

    /**
     * Obtiene el chatbotCodeLink de la Option
     * @return Devuelve el chatbotCodeLink
     */
    int getChatbotCodeLink();

    /**
     * Obtiene el initialFlowCodeLink de la Option
     * @return Devuelve el initialFlowCodeLink
     */
    int getInitialFlowCodeLink();

}
