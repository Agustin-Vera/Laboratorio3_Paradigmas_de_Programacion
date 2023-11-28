package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Laboratorio 3: Paradigmas\n");

        // ######################### Chatbot 0 #####################################

        // Opciones - Flujo 1 - Chatbot 0
        ArrayList<String> keywordOp1F1CB0 = new ArrayList<>(Arrays.asList("viajar", "turistear", "conocer"));
        var op1F1CB0 = new Option_21065666_VeraRojas(1, "1) Viajar", 1, 1, keywordOp1F1CB0);

        ArrayList<String> keywordOp2F1CB0 = new ArrayList<>(Arrays.asList("estudiar", "aprender", "perfeccionarme"));
        var op2F1CB0 = new Option_21065666_VeraRojas(2, "2) Estudiar", 2, 1, keywordOp2F1CB0);

        // Flujo 1 - Chatbot 0
        ArrayList<Option_21065666_VeraRojas> optionsFlow1CB0 = new ArrayList<>(Arrays.asList(op1F1CB0, op2F1CB0));
        var f1CB0 = new Flow_21065666_VeraRojas(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Que te gustaria hacer?", optionsFlow1CB0);

        System.out.println(f1CB0);
    }
}