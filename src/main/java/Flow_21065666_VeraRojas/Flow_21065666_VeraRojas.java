package Flow_21065666_VeraRojas;

import Option_21065666_VeraRojas.Option_21065666_VeraRojas;

import java.util.ArrayList;

/**
 * Clase Flow
 * @author Agustin Vera
 */
public class Flow_21065666_VeraRojas implements FlowInterface_21065666_VeraRojas{

    /**
     * El identificador del Flow
     */
    private int id;

    /**
     * El nombre y mensaje del Flow
     */
    private String nameMsg;

    /**
     * Las Options del Flow
     */
    private ArrayList<Option_21065666_VeraRojas> options;

    /**
     * Instancia un Flow
     * @param id El identificador del Flow
     * @param nameMsg El nombre y mensaje del Flow
     * @param options Las Options del Flow
     */
    public Flow_21065666_VeraRojas(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options) {
        this.id = id;
        this.nameMsg = nameMsg;
        this.options = getUniqueOptions(options);
    }

    /**
     * Obtiene el identificador del Flow
     * @return Devuelve el identificador
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre y mensaje del Flow
     * @return Devuelve el nombre y mensaje
     */
    public String getNameMsg() {
        return nameMsg;
    }

    /**
     * Obtiene las primeras ocurrencias de cada Option en una lista
     * @param options Las Options del Flow
     * @return Devuelve las primeras ocurrencias de cada Option
     */
    public ArrayList<Option_21065666_VeraRojas> getUniqueOptions(ArrayList<Option_21065666_VeraRojas> options){
        for(int i = 0; i < options.size(); i++){
            for(int j = i+1; j < options.size(); j++){
                if(options.get(i).getCode() == options.get(j).getCode()){
                    options.remove(j);
                    j--;
                }
            }
        }
        return options;
    }

    /**
     * Verifica si una option existe en el flow
     * @param newOption Option a ser agregada
     * @return El booleano que representa si existe o no la Option
     */
    public boolean optionExist(Option_21065666_VeraRojas newOption){
        for(Option_21065666_VeraRojas option: this.options){
            if(option.getCode() == newOption.getCode()){
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega una Option al Flow
     * @param option Option a ser agregada al Flow
     */
    public void flowAddOption(Option_21065666_VeraRojas option){
        if(this.optionExist(option)){
            System.out.println("Ya existe una opcion con ese identificador, pruebe con otra.");
        }else {
            this.options.add(option);
            System.out.println("Opcion " + option.getCode() + " fue agregada con exito.");
        }
    }

    /**
     * Obtiene una Option dado un mensaje, verificando las keywords
     * @param message El mensaje ingresado por el usuario
     * @return La Option a la que hace referencia el message
     */
    public Option_21065666_VeraRojas getOptionByMessage(String message){
        for(Option_21065666_VeraRojas option: this.options){
            ArrayList<String> keywords = option.getKeywords();
            if(keywords.contains(message)){
                return option;
            }
        }
        return null;
    }

    /**
     * Verifica si existe una Option en el Flow dado un mensaje
     * @param message Es el mensaje ingreso por el usuario
     * @return El booleano indicara si existe o no la Option
     */
    public boolean optionExistByMessage(String message){
        for(Option_21065666_VeraRojas option: this.options){
            if(option.getKeywords().contains(message)){
                return true;
            }
        }
        return false;
    }

    /**
     * Tranforma las Options del Flow a formato String
     * @return Las Options con su mensaje en formato string
     */
    public String optionsToString(){
        String optionsString = "";
        for(Option_21065666_VeraRojas option: this.options){
            optionsString = optionsString + option.getMessage() + "\n";
        }
        return optionsString;
    }

    /**
     * Imprime las Options
     */
    public void printOptions() {
        for(Option_21065666_VeraRojas option: this.options){
            System.out.println("        Option: Code = " + option.getCode() + "   Message = " + option.getMessage() + "  chatbotCodeLink = " + option.getChatbotCodeLink() + "   InitialFlowCodeLink = " + option.getInitialFlowCodeLink() + "   Keywords = " + option.getKeywords());
        }
    }

    @Override
    public String toString() {
        return "Flow_21065666_VeraRojas{" +
                "id=" + id +
                ", nameMsg='" + nameMsg + '\'' +
                ", options=" + options +
                '}';
    }

}
