package org.example;

import Chatbot.Chatbot;
import Flow.Flow;
import Menu.Menu;
import Option.Option;
import System.System;
import User.AdminUser;
import User.NormalUser;
import User.UserInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ######################### Chatbot 0 #####################################

        // Opciones - Flujo 1 - Chatbot 0
        ArrayList<String> keywordOp1F1CB0 = new ArrayList<>(Arrays.asList("viajar", "turistear", "conocer"));
        var op1F1CB0 = new Option(1, "1) Viajar", 1, 1, keywordOp1F1CB0);

        ArrayList<String> keywordOp2F1CB0 = new ArrayList<>(Arrays.asList("estudiar", "aprender", "perfeccionarme"));
        var op2F1CB0 = new Option(2, "2) Estudiar", 2, 1, keywordOp2F1CB0);

        // Flujo 1 - Chatbot 0
        ArrayList<Option> optionsFlow1CB0 = new ArrayList<>(Arrays.asList(op1F1CB0));
        var f1CB0 = new Flow(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Que te gustaria hacer?", optionsFlow1CB0);
        f1CB0.flowAddOption(op2F1CB0);

        // Chatbot 0
        ArrayList<Flow> flujosCB0 = new ArrayList<>(Arrays.asList(f1CB0));
        var cb0 = new Chatbot(0, "Inicial" ,"Bienvenido\n¿Que te gustaria hacer?", 1, flujosCB0);


        // ######################### Chatbot 1 #####################################

        // Opciones - Flujo 1 - Chatbot 1
        ArrayList<String> keywordOp1F1CB1 = new ArrayList<>(Arrays.asList("USA", "Estados Unidos", "New York"));
        var op1F1CB1 = new Option(1, "1) New York, Usa", 1, 2, keywordOp1F1CB1);

        ArrayList<String> keywordOp2F1CB1 = new ArrayList<>(Arrays.asList("Paris", "Eiffel"));
        var op2F1CB1 = new Option(2, "2) Paris, Francia", 1, 1, keywordOp2F1CB1);

        ArrayList<String>  keywordOp3F1CB1 = new ArrayList<>(Arrays.asList("Chile", "Torres", "Torres Paine", "Torres del Paine"));
        var op3F1CB1 = new Option(3, "3) Torres del Paine", 1, 1, keywordOp3F1CB1);

        ArrayList<String> keywordOp4F1CB1 = new ArrayList<>(Arrays.asList("Regresar", "Salir", "Volver"));
        var op4F1CB1 = new Option(4, "4) Volver", 0, 1, keywordOp4F1CB1);

        // Opciones - Flujo 2 - Chatbot 1
        ArrayList<String>  keywordOp1F2CB1 = new ArrayList<>(Arrays.asList("Central", "Park", "Central Park"));
        var op1F2CB1 = new Option(1, "1) Central Park", 1, 2, keywordOp1F2CB1);

        ArrayList<String>  keywordOp2F2CB1 = new ArrayList<>(Arrays.asList("Museo"));
        var op2F2CB1 = new Option(2, "2) Museos", 1, 2, keywordOp2F2CB1);

        ArrayList<String>  keywordOp3F2CB1 = new ArrayList<>(Arrays.asList("Museo"));
        var op3F2CB1 = new Option(3, "3) Ningun otro atractivo", 1, 3, keywordOp3F2CB1);

        ArrayList<String>  keywordOp4F2CB1 = new ArrayList<>(Arrays.asList("Cambiar", "Volver", "Salir"));
        var op4F2CB1 = new Option(4, "4) Cambiar destino", 1, 1, keywordOp4F2CB1);

        // Opciones - Flujo 3 - Chatbot 1
        ArrayList<String>  keywordOp1F3CB1 = new ArrayList<>(Arrays.asList("Solo"));
        var op1F3CB1 = new Option(1, "1) Solo", 1, 3, keywordOp1F3CB1);

        ArrayList<String>  keywordOp2F3CB1 = new ArrayList<>(Arrays.asList("Pareja"));
        var op2F3CB1 = new Option(2, "2) En pareja", 1, 3, keywordOp2F3CB1);

        ArrayList<String>  keywordOp3F3CB1 = new ArrayList<>(Arrays.asList("Familia"));
        var op3F3CB1 = new Option(3, "3) En familia", 1, 3, keywordOp3F3CB1);

        ArrayList<String>  keywordOp4F3CB1 = new ArrayList<>(Arrays.asList("Volver", "Atractivos"));
        var op4F3CB1 = new Option(4, "4) Agregar mas atractivos", 1, 2, keywordOp4F3CB1);

        ArrayList<String>  keywordOp5F3CB1 = new ArrayList<>(Arrays.asList("Cambiar destino"));
        var op5F3CB1 = new Option(5, "5) En realidad quiero otro destino", 1, 1, keywordOp5F3CB1);

        // Flujo 1 - Chatbot 1
        ArrayList<Option> optionsFlow1CB1 = new ArrayList<>(Arrays.asList(op1F1CB1, op2F1CB1, op3F1CB1, op4F1CB1));
        var f1CB1 = new Flow(1, "Flujo 1 Chatbot 1\n¿Donde te Gustaria ir?", optionsFlow1CB1);

        // Flujo 2 - Chatbot 1
        ArrayList<Option> optionsFlow2CB1 = new ArrayList<>(Arrays.asList(op1F2CB1, op2F2CB1, op3F2CB1, op4F2CB1));
        var f2CB1 = new Flow(2, "Flujo 2 Chatbot 1\n¿Que atractivo te gustaria visitar?", optionsFlow2CB1);

        // Flujo 3 - Chatbot 1
        ArrayList<Option> optionsFlow3CB1 = new ArrayList<>(Arrays.asList(op1F3CB1, op2F3CB1, op3F3CB1, op4F3CB1, op5F3CB1));
        var f3CB1 = new Flow(3, "Flujo 3 Chatbot 1\n¿Vas solo o acompaniado?", optionsFlow3CB1);

        // Chatbot 1
        ArrayList<Flow> flujosCB1 = new ArrayList<>(Arrays.asList(f1CB1, f2CB1, f3CB1));
        var cb1 = new Chatbot(1, "Agencia de Viajes", "Bienvenido\n¿Donde quieres viajar?", 1, flujosCB1);

        // ######################### Chatbot 2 #####################################

        // Opciones - Flujo 1 - Chatbot 2
        ArrayList<String>  keywordOp1F1CB2 = new ArrayList<>(Arrays.asList("Tecnica"));
        var op1F1CB2 = new Option(1, "1) Carrera Tecnica", 2, 1, keywordOp1F1CB2);

        ArrayList<String>  keywordOp2F1CB2 = new ArrayList<>(Arrays.asList("Doctorado", "Magister", "Postgrado"));
        var op2F1CB2 = new Option(2, "2) Postgrado", 2, 1, keywordOp2F1CB2);

        ArrayList<String>  keywordOp3F1CB2 = new ArrayList<>(Arrays.asList("Volver", "Salir", "Regresar"));
        var op3F1CB2 = new Option(3, "3) Volver", 0, 1, keywordOp3F1CB2);

        // Flujo 1 - Chatbot 2
        ArrayList<Option> optionsFlow1CB2 = new ArrayList<>(Arrays.asList(op1F1CB2, op2F1CB2, op3F1CB2));
        var f1CB2 = new Flow(1, "Flujo 1 Chatbot 2\n¿Que te gustaria estudiar?", optionsFlow1CB2);

        // Chatbot 2
        ArrayList<Flow> flujosCB2 = new ArrayList<>(Arrays.asList(f1CB2));
        var cb2 = new Chatbot(2, "Orientador Academico", "Bienvenido\n¿Que te gustaria estudiar?", 1, flujosCB2);


        // ######################### System #####################################

        // Chatbots - System
        ArrayList<Chatbot> chatbotsSystem = new ArrayList<>(Arrays.asList(cb0, cb1, cb2, cb2, cb2, cb1));
        var sys = new System("Chatbots Paradigmas", 0, chatbotsSystem);

        // Users
        UserInterface user1 = new AdminUser("Messi");
        sys.systemAddUser(user1);

        UserInterface user2 = new NormalUser("Mora");
        sys.systemAddUser(user2);

        Menu menu = new Menu();

        java.lang.System.out.println("\n\n#############################################################################################");
        java.lang.System.out.println("Para una revision y interaccion mas optima se crea un sistema de chatbots.");
        java.lang.System.out.println("El sistema creado es el mismo creado para los scripts de pruebas de laboratorios anteriores");
        java.lang.System.out.println("Los cuales fueron brindados por coordinacion.");
        java.lang.System.out.println("#############################################################################################\n\n");

        menu.start(sys);

    }
}