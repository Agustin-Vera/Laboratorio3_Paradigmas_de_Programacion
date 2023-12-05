package org.example;

import UserInterface_21065666_VeraRojas.*;

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
        ArrayList<Option_21065666_VeraRojas> optionsFlow1CB0 = new ArrayList<>(Arrays.asList(op1F1CB0));
        var f1CB0 = new Flow_21065666_VeraRojas(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Qué te gustaría hacer?", optionsFlow1CB0);
        f1CB0.flowAddOption(op2F1CB0);

        // Chatbot 0
        ArrayList<Flow_21065666_VeraRojas> flujosCB0 = new ArrayList<>(Arrays.asList(f1CB0));
        var cb0 = new Chatbot_21065666_VeraRojas(0, "Inicial" ,"Bienvenido\n¿Qué te gustaría hacer?", 1, flujosCB0);


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

        // Opciones - Flujo 2 - Chatbot 1
        ArrayList<String>  keywordOp1F2CB1 = new ArrayList<>(Arrays.asList("Central", "Park", "Central Park"));
        var op1F2CB1 = new Option_21065666_VeraRojas(1, "1) Central Park", 1, 2, keywordOp1F2CB1);

        ArrayList<String>  keywordOp2F2CB1 = new ArrayList<>(Arrays.asList("Museo"));
        var op2F2CB1 = new Option_21065666_VeraRojas(2, "2) Museos", 1, 2, keywordOp2F2CB1);

        ArrayList<String>  keywordOp3F2CB1 = new ArrayList<>(Arrays.asList("Museo"));
        var op3F2CB1 = new Option_21065666_VeraRojas(3, "3) Ningún otro atractivo", 1, 3, keywordOp3F2CB1);

        ArrayList<String>  keywordOp4F2CB1 = new ArrayList<>(Arrays.asList("Cambiar", "Volver", "Salir"));
        var op4F2CB1 = new Option_21065666_VeraRojas(4, "4) Cambiar destino", 1, 1, keywordOp4F2CB1);

        // Opciones - Flujo 3 - Chatbot 1
        ArrayList<String>  keywordOp1F3CB1 = new ArrayList<>(Arrays.asList("Solo"));
        var op1F3CB1 = new Option_21065666_VeraRojas(1, "1) Solo", 1, 3, keywordOp1F3CB1);

        ArrayList<String>  keywordOp2F3CB1 = new ArrayList<>(Arrays.asList("Pareja"));
        var op2F3CB1 = new Option_21065666_VeraRojas(2, "2) En pareja", 1, 3, keywordOp2F3CB1);

        ArrayList<String>  keywordOp3F3CB1 = new ArrayList<>(Arrays.asList("Familia"));
        var op3F3CB1 = new Option_21065666_VeraRojas(3, "3) En familia", 1, 3, keywordOp3F3CB1);

        ArrayList<String>  keywordOp4F3CB1 = new ArrayList<>(Arrays.asList("Volver", "Atractivos"));
        var op4F3CB1 = new Option_21065666_VeraRojas(4, "4) Agregar más atractivos", 1, 2, keywordOp4F3CB1);

        ArrayList<String>  keywordOp5F3CB1 = new ArrayList<>(Arrays.asList("Cambiar destino"));
        var op5F3CB1 = new Option_21065666_VeraRojas(5, "5) En realidad quiero otro destino", 1, 1, keywordOp5F3CB1);

        // Flujo 1 - Chatbot 1
        ArrayList<Option_21065666_VeraRojas> optionsFlow1CB1 = new ArrayList<>(Arrays.asList(op1F1CB1, op2F1CB1, op3F1CB1, op4F1CB1));
        var f1CB1 = new Flow_21065666_VeraRojas(1, "Flujo 1 Chatbot 1\n¿Dónde te Gustaría ir?", optionsFlow1CB1);

        // Flujo 2 - Chatbot 1
        ArrayList<Option_21065666_VeraRojas> optionsFlow2CB1 = new ArrayList<>(Arrays.asList(op1F2CB1, op2F2CB1, op3F2CB1, op4F2CB1));
        var f2CB1 = new Flow_21065666_VeraRojas(2, "Flujo 2 Chatbot 1\n¿Qué atractivo te gustaría visitar?", optionsFlow2CB1);

        // Flujo 3 - Chatbot 1
        ArrayList<Option_21065666_VeraRojas> optionsFlow3CB1 = new ArrayList<>(Arrays.asList(op1F3CB1, op2F3CB1, op3F3CB1, op4F3CB1, op5F3CB1));
        var f3CB1 = new Flow_21065666_VeraRojas(3, "Flujo 3 Chatbot 1\n¿Vas solo o acompañado?", optionsFlow3CB1);

        // Chatbot 1
        ArrayList<Flow_21065666_VeraRojas> flujosCB1 = new ArrayList<>(Arrays.asList(f1CB1, f2CB1, f3CB1));
        var cb1 = new Chatbot_21065666_VeraRojas(1, "Agencia de Viajes", "Bienvenido\n¿Dónde quieres viajar?", 1, flujosCB1);

        // ######################### Chatbot 2 #####################################

        // Opciones - Flujo 1 - Chatbot 2
        ArrayList<String>  keywordOp1F1CB2 = new ArrayList<>(Arrays.asList("Técnica"));
        var op1F1CB2 = new Option_21065666_VeraRojas(1, "1) Carrera Técnica", 2, 1, keywordOp1F1CB2);

        ArrayList<String>  keywordOp2F1CB2 = new ArrayList<>(Arrays.asList("Doctorado", "Magister", "Postgrado"));
        var op2F1CB2 = new Option_21065666_VeraRojas(2, "2) Postgrado", 2, 1, keywordOp2F1CB2);

        ArrayList<String>  keywordOp3F1CB2 = new ArrayList<>(Arrays.asList("Volver", "Salir", "Regresar"));
        var op3F1CB2 = new Option_21065666_VeraRojas(3, "3) Volver", 0, 1, keywordOp3F1CB2);

        // Flujo 1 - Chatbot 2
        ArrayList<Option_21065666_VeraRojas> optionsFlow1CB2 = new ArrayList<>(Arrays.asList(op1F1CB2, op2F1CB2, op3F1CB2));
        var f1CB2 = new Flow_21065666_VeraRojas(1, "Flujo 1 Chatbot 2\n¿Qué te gustaría estudiar?", optionsFlow1CB2);

        // Chatbot 2
        ArrayList<Flow_21065666_VeraRojas> flujosCB2 = new ArrayList<>(Arrays.asList(f1CB2));
        var cb2 = new Chatbot_21065666_VeraRojas(2, "Orientador Académico", "Bienvenido\n¿Qué te gustaría estudiar?", 1, flujosCB2);


        // ######################### System #####################################

        // Chatbots - System
        ArrayList<Chatbot_21065666_VeraRojas> chatbotsSystem = new ArrayList<>(Arrays.asList(cb0, cb1, cb2, cb2, cb2, cb1));
        var sys = new System_21065666_VeraRojas("Chatbots Paradigmas", 0, chatbotsSystem);

        // Users
        UserInterface_21065666_VeraRojas user1 = new AdminUser_21065666_VeraRojas("Messi");
        sys.systemAddUser(user1);

        UserInterface_21065666_VeraRojas user2 = new NormalUser_21065666_VeraRojas("Mora");
        sys.systemAddUser(user2);


        //sys.systemAddChatbot(cb1);
        System.out.println(sys);
    }
}