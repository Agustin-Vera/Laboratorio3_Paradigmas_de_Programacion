package org.example;

import java.util.ArrayList;

public class Flow_21065666_VeraRojas {

    private int id;
    private String nameMsg;
    private ArrayList<Option_21065666_VeraRojas> options;

    // ########### RF2 - TDA Flow - Constructor ################
    public Flow_21065666_VeraRojas(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options) {
            this.id = id;
            this.nameMsg = nameMsg;
            this.options = getUniqueOptions(options);
    }

    // Obtiene las primeras ocurrencias de cada Option en una lista
    public ArrayList<Option_21065666_VeraRojas> getUniqueOptions(ArrayList<Option_21065666_VeraRojas> options){
        for(int i = 0; i < options.size(); i++){
            for(int j = i+1; j < options.size(); j++){
                if(options.get(i).getCode() == options.get(j).getCode()){
                    options.remove(j);
                }
            }
        }
        return options;
    }

    // Verifica si una option existe en el flow
    public boolean optionExist(Option_21065666_VeraRojas newOption){
        for(Option_21065666_VeraRojas option: this.options){
            if(option.getCode() == newOption.getCode()){
                return true;
            }
        }
        return false;
    }
    // ########### RF3 - TDA flowAddOption - Modificador #######
    // ESTO LO EJECUTA EL USUARIO ADMINISTRADOR
    public void flowAddOption(Option_21065666_VeraRojas option){
        if(this.optionExist(option)){
            System.out.println("Ya existe una opcion con ese identificador, pruebe con otra.");
            //return;
        }else {
            this.options.add(option);
            System.out.println("Opcion " + option.getCode() + " fue agregada con exito.");
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

    public int getId() {
        return id;
    }
}
