package org.example;

import java.util.ArrayList;

public class Flow_21065666_VeraRojas {

    private int id;
    private String nameMsg;
    private ArrayList<Option_21065666_VeraRojas> options;

    public Flow_21065666_VeraRojas(int id, String nameMsg, ArrayList<Option_21065666_VeraRojas> options) {
        if(this.uniqueOptions(options)) {
            this.id = id;
            this.nameMsg = nameMsg;
            this.options = options;
        }else {
            this.id = id;
            this.nameMsg = nameMsg;
            this.options = new ArrayList<>();
        }
    }

    // Verifica si una lista de options no posee ninguna option repetida
    public boolean uniqueOptions(ArrayList<Option_21065666_VeraRojas> options){
        for(int i = 0; i < options.size(); i++){
            for(int j = i+1; j < options.size(); j++){
                if(options.get(i).getCode() == options.get(j).getCode()){
                    System.out.println("Existe al menos una opcion repetida a la hora de crear el flujo, pruebe con otras opciones no repetidas.");
                    return false;
                }
            }
        }
        return true;
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
