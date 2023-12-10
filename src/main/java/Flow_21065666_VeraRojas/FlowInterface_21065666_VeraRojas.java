package Flow_21065666_VeraRojas;

import Option_21065666_VeraRojas.Option_21065666_VeraRojas;

import java.util.ArrayList;

/**
 * Interface correspondiente a Flow
 * @author Agustin Vera
 */
public interface FlowInterface_21065666_VeraRojas {

    /**
     * Agrega una Option al Flow
     * @param option Option a ser agregada al Flow
     */
    void flowAddOption(Option_21065666_VeraRojas option);

    /**
     * Verifica si una option existe en el flow
     * @param newOption Option a ser agregada
     * @return El booleano que representa si existe o no la Option
     */
    boolean optionExist(Option_21065666_VeraRojas newOption);

    /**
     * Obtiene las primeras ocurrencias de cada Option en una lista
     * @param options Las Options del Flow
     * @return Devuelve las primeras ocurrencias de cada Option
     */
    ArrayList<Option_21065666_VeraRojas> getUniqueOptions(ArrayList<Option_21065666_VeraRojas> options);

    /**
     * Verifica si existe una Option en el Flow dado un mensaje
     * @param message Es el mensaje ingreso por el usuario
     * @return El booleano indicara si existe o no la Option
     */
    boolean optionExistByMessage(String message);

    /**
     * Obtiene una Option dado un mensaje, verificando las keywords
     * @param message El mensaje ingresado por el usuario
     * @return La Option a la que hace referencia el message
     */
    Option_21065666_VeraRojas getOptionByMessage(String message);

    /**
     * Tranforma las Options del Flow a formato String
     * @return Las Options con su mensaje en formato string
     */
    String optionsToString();

}
