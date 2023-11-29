package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Laboratorio 3: Paradigmas\n");

        // ######################### Chatbot 0 #####################################

        // Opciones - Flujo 1 - Chatbot 0
        ArrayList<String> keywordOp1F1CB0 = new ArrayList<>(Arrays.asList("viajar", "turistear", "conocer"));
        var op1F1CB0 = new Option_21065666_VeraRojas(1, "1) Viajar", 1, 1, keywordOp1F1CB0);

        ArrayList<String> keywordOp2F1CB0 = new ArrayList<>(Arrays.asList("estudiar", "aprender", "perfeccionarme"));
        var op2F1CB0 = new Option_21065666_VeraRojas(2, "2) Estudiar", 2, 1, keywordOp2F1CB0);

        // Flujo 1 - Chatbot 0
        ArrayList<Option_21065666_VeraRojas> optionsFlow1CB0 = new ArrayList<>(Arrays.asList(op1F1CB0, op2F1CB0));
        var f1CB0 = new Flow_21065666_VeraRojas(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Qué te gustaría hacer?", optionsFlow1CB0);

        // ######################### Chatbot 1 #####################################

        // Opciones - Flujo 1 - Chatbot 1
        ArrayList<String> keywordOp1F1CB1 = new ArrayList<>(Arrays.asList("USA", "Estados Unidos", "New York"));
        var op1F1CB1 = new Option_21065666_VeraRojas(1, "1) New York, Usa", 1, 2, keywordOp1F1CB1);

        ArrayList<String> keywordOp2F1CB1 = new ArrayList<>(Arrays.asList("Paris", "Eiffel"));
        var op2F1CB1 = new Option_21065666_VeraRojas(2, "2) París, Francia", 1, 1, keywordOp2F1CB1);

        ArrayList<String>  keywordOp3F1CB1 = new ArrayList<>(Arrays.asList("Chile", "Torres", "Torres Paine", "Torres del Paine"));
        var op3F1CB1 = new Option_21065666_VeraRojas(3, "3) Torres del Paine", 1, 1, keywordOp3F1CB1);

        ArrayList<String> keywordOp4F1CB1 = new ArrayList<>(Arrays.asList("Regresar", "Salir", "Volver"));
        var op4F1CB1 = new Option_21065666_VeraRojas(4, "4) Volver", 0, 1, keywordOp4F1CB1);

        ArrayList<Option_21065666_VeraRojas> optionsFlow1CB1 = new ArrayList<>(Arrays.asList(op1F1CB1, op2F1CB1, op3F1CB1));
        var f1CB1 = new Flow_21065666_VeraRojas(1, "Flujo 1 Chatbot 1\n¿Dónde te Gustaría ir?", optionsFlow1CB1);

        f1CB1.flowAddOption(op4F1CB1);
        System.out.println(f1CB1);
    }
}