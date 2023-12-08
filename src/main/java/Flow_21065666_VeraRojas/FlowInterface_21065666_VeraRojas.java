package Flow_21065666_VeraRojas;

import Option_21065666_VeraRojas.Option_21065666_VeraRojas;

import java.util.ArrayList;

public interface FlowInterface_21065666_VeraRojas {

    void flowAddOption(Option_21065666_VeraRojas option);

    boolean optionExist(Option_21065666_VeraRojas newOption);

    ArrayList<Option_21065666_VeraRojas> getUniqueOptions(ArrayList<Option_21065666_VeraRojas> options);

    boolean optionExistByMessage(String message);

    Option_21065666_VeraRojas getOptionByMessage(String message);

    String optionsToString();

}
