package Menu_21065666_VeraRojas;

import Chatbot_21065666_VeraRojas.Chatbot_21065666_VeraRojas;
import Flow_21065666_VeraRojas.Flow_21065666_VeraRojas;
import Option_21065666_VeraRojas.Option_21065666_VeraRojas;
import System_21065666_VeraRojas.System_21065666_VeraRojas;
import User_21065666_VeraRojas.AdminUser_21065666_VeraRojas;
import User_21065666_VeraRojas.NormalUser_21065666_VeraRojas;
import User_21065666_VeraRojas.UserInterface_21065666_VeraRojas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Menu
 * @author Agustin Vera
 */
public class Menu_21065666_VeraRojas {

    /**
     * Permite a un usuario interactuar con un sistema creado para facilitar la revision e interaccion
     */
    public void start(System_21065666_VeraRojas sys){
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 3;


        int opcionInicio, opcionLoginUsuario, opcionRegistroUsuario, opcionMenuUsuarioNormal, opcionMenuUsuarioAdministrador;
        String optionOrMessage;
        String username;
        UserInterface_21065666_VeraRojas user;
        Chatbot_21065666_VeraRojas chatbot;

        do {
            menuInicio();
            opcionInicio = input.nextInt();

            switch (opcionInicio) {

                case 1: // 1. Login de Usuario
                    do {
                        System.out.println("\n\n### Sistema de Chatbots - Login ###\n");
                        System.out.println("Usuarios registrados: ");
                        sys.printUsers();
                        System.out.print("INTRODUZCA NOMBRE DE USUARIO: ");
                        input.nextLine();
                        username = input.nextLine();
                        if(sys.userExistByName(username)) {
                            sys.systemLogin(username);
                            user = sys.getUserLogged();
                            if (sys.userIsAdminUser(username)) {
                                do {
                                    menuUsuarioAdministrador(username);
                                    opcionMenuUsuarioAdministrador = input.nextInt();
                                    input.nextLine();
                                    switch (opcionMenuUsuarioAdministrador) {
                                        case 1: // 1. Crear un chatbot
                                            System.out.println("\n\n### Sistema de Chatbots - Crear un Chatbot ###");
                                            chatbot = makeNewChatbot(user);
                                            sys.systemAddChatbot(chatbot);
                                            System.out.println("Chatbot creado y agregado el Sistema");
                                            break;

                                        case 2: // 2. Modificar un Chatbot
                                            modificarChatbot(sys, user);
                                            break;

                                        case 3: // 3. Ejecutar un Chatbot
                                            System.out.println("\n\n### Sistema de Chatbots - Ejecutar un Chatbot ###");
                                            System.out.println("Ejecutar 'EXIT' para finalizar simulacion.\n");
                                            do {
                                                System.out.print("INTRODUZCA UN MENSAJE: ");
                                                optionOrMessage = input.nextLine();
                                                user.talkToChatbot(sys, optionOrMessage);
                                            } while(!optionOrMessage.equals("EXIT"));
                                            break;

                                        case 4: // 4. Visualizar todos los chatbots existentes en el sistema
                                            System.out.println("\n\n### Sistema de Chatbots - Chatbots ###\n");
                                            user.verChatbots(sys);
                                            break;

                                        case 5: // 5. Visualizar todos los chatbots con sus flujos y opciones creada
                                            System.out.println("\n\n### Sistema de Chatbots - Chatbots - Flows - Options ###\n");
                                            user.verChatbotsFlowsOptions(sys);
                                            break;

                                        case 6: // 6. Visualizar su historial de interacciones con el sistema
                                            System.out.println("Su historial de interacciones con el sistema es: \n");
                                            sys.systemSynthesis(user.getName());
                                            break;

                                        case 7: // 7. Salir
                                            sys.systemLogout();
                                            System.out.println("Cerrando sesion, ha salido del menu de Usuario administrador.");
                                            break;

                                        default:
                                            System.out.println("Ingrese una opcion válida.");
                                    }
                                } while (opcionMenuUsuarioAdministrador != 7);
                            }
                            else {
                                do {
                                    menuUsuarioNormal(username);
                                    opcionMenuUsuarioNormal = input.nextInt();
                                    input.nextLine();
                                    switch (opcionMenuUsuarioNormal) {
                                        case 1: // 1. Ejecutar un Chatbot
                                            System.out.println("\n\n### Sistema de Chatbots - Ejecutar un Chatbot ###");
                                            System.out.println("Ejecutar 'EXIT' para finalizar simulacion.\n");
                                            do {
                                                System.out.print("INTRODUZCA UN MENSAJE: ");
                                                optionOrMessage = input.nextLine();
                                                user.talkToChatbot(sys, optionOrMessage);
                                            } while(!optionOrMessage.equals("EXIT"));
                                            break;

                                        case 2: // 2. Visualizar todos los chatbots existentes en el sistema
                                            System.out.println("\n\n### Sistema de Chatbots - Chatbots ###\n");
                                            user.verChatbots(sys);
                                            break;

                                        case 3: // 3. Visualizar todos los chatbots con sus flujos y opciones creadas
                                            System.out.println("\n\n### Sistema de Chatbots - Chatbots - Flows - Options ###\n");
                                            user.verChatbotsFlowsOptions(sys);
                                            break;

                                        case 4: // 4. Visualizar su historial de interacciones con el sistema
                                            System.out.println("Su historial de interacciones con el sistema es: \n");
                                            sys.systemSynthesis(user.getName());
                                            break;

                                        case 5: // 5. Salir
                                            sys.systemLogout();
                                            System.out.println("\nCerrando sesion, ha salido del menú de Usuario.");
                                            break;

                                        default:
                                            System.out.println("Ingrese una opcion válida.");
                                    }
                                } while (opcionMenuUsuarioNormal != 5);
                            }
                        }
                        System.out.println("Ingrese un nombre de usuario valido.");
                    } while (sys.usersLogged());
                    break;

                case 2: // 2. Registro de Usuario
                    do {
                        menuRegistroUsuario();
                        opcionRegistroUsuario = input.nextInt();
                        switch (opcionRegistroUsuario){
                            case 1: // 1. Registrar usuario normal
                                System.out.println("\n\n### Sistema de Chatbots - Registro ###\n");
                                System.out.print("Ingrese el nombre del usuario normal a registrar: ");
                                input.nextLine();
                                username = input.nextLine();
                                user = new NormalUser_21065666_VeraRojas(username);
                                sys.systemAddUser(user);
                                break;

                            case 2: // 2. Registrar usuario administrador
                                System.out.println("\n\n### Sistema de Chatbots - Login ###\n");
                                System.out.print("Ingrese el nombre del usuario administrador a registrar: ");
                                input.nextLine();
                                username = input.nextLine();
                                user = new AdminUser_21065666_VeraRojas(username);
                                sys.systemAddUser(user);
                                break;

                            case 3: // 3. Salir
                                System.out.println("Ha salido del menu Registro de Usuario.");
                                break;

                            default:
                                System.out.println("Ingrese una opcion valida.");
                        }
                    } while(opcionRegistroUsuario != 3);
                    break;

                case 3: // 3. Salir
                    System.out.println("\nFinalizando el programa, tenga un buen dia :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println(opcionInicio + " no es una opcion válida, pruebe con una opcion existente.");

            }
        } while (opcionInicio != MENU_EXIT_OPTION);
    }

    /**
     * Imprime el menu de inicio
     */
    private void menuInicio() {
        System.out.println("\n\n### Sistema de Chatbots - Inicio ###\n");
        System.out.print("1. Login de Usuario.\n");
        System.out.print("2. Registro de Usuario.\n");
        System.out.print("3. Salir.\n");
        System.out.print("\nINTRODUZCA SU OPCION: ");
    }

    /**
     * Imprime el menu de registro de usuario
     */
    private void menuRegistroUsuario() {
        System.out.println("\n\n### Sistema de Chatbots - Registro ###\n");
        System.out.println("1. Registrar usuario normal.");
        System.out.println("2. Registrar usuario administrador.");
        System.out.println("3. Salir.");
        System.out.print("\nINTRODUZCA SU OPCION: ");
    }

    /**
     * Imprime el menu de usuario administrador
     * @param username Nombre del usuario
     */
    private void menuUsuarioAdministrador(String username) {
        System.out.println("\n\n### Sistema de Chatbots - Usuario administrador ###");
        System.out.println("Bienvenido " + username + " usted es administrador.\n");
        System.out.println("1. Crear un chatbot.");
        System.out.println("2. Modificar un Chatbot.");
        System.out.println("3. Ejecutar un Chatbot.");
        System.out.println("4. Visualizar todos los chatbots existentes en el sistema.");
        System.out.println("5. Visualizar todos los chatbots con sus flujos y opciones creadas.");
        System.out.println("6. Visualizar su historial de interacciones con el sistema.");
        System.out.println("7. Cerrar sesion, salir.");
        System.out.print("\nINTRODUZCA SU OPCION: ");

    }

    /**
     * Imprime el menu del usuario normal
     * @param username Nombre del usuario
     */
    private void menuUsuarioNormal(String username) {
        System.out.println("\n\n### Sistema de Chatbots - Usuario ###");
        System.out.println("Bienvenido " + username +  ".\n");
        System.out.println("1. Ejecutar un Chatbot.");
        System.out.println("2. Visualizar todos los chatbots existentes en el sistema.");
        System.out.println("3. Visualizar todos los chatbots con sus flujos y opciones creadas.");
        System.out.println("4. Visualizar su historial de interacciones con el sistema.");
        System.out.println("5. Cerrar sesion, salir.");
        System.out.print("\nINTRODUZCA SU OPCION: ");
    }

    /**
     * Permite al User pedir los necesario para crear una Option
     * @param user User que creara la Option
     * @return Option creada por el User
     */
    private Option_21065666_VeraRojas makeNewOption(UserInterface_21065666_VeraRojas user) {
        int optionCode, optionChatbotCodeLink, optionInitialFlowCodeLink;
        String optionMessage, optionKeyword;
        int cantidadKeywords;
        ArrayList<String> optionKeywords = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n### Sistema de Chatbots - Crear una opcion ###\n");
        System.out.print("\nIngrese el numero identificador o code: ");
        optionCode = input.nextInt();
        input.nextLine();
        System.out.print("\nIngrese el mensaje de la opcion: ");
        optionMessage = input.nextLine();
        System.out.print("\nIngrese el id del chatbot al cual apunta esta opcion (chatbotCodeLink): ");
        optionChatbotCodeLink = input.nextInt();
        input.nextLine();
        System.out.print("\nIngrese el id del flow al cual apunta esta opcion (initialFlowCodeLink): ");
        optionInitialFlowCodeLink = input.nextInt();
        input.nextLine();
        System.out.print("\nIngrese la cantidad de keywords a ingresar: ");
        cantidadKeywords = input.nextInt();
        input.nextLine();
        for(int k = 0; k < cantidadKeywords; k++){
            System.out.print("\nIngrese una keyword: ");
            optionKeyword = input.nextLine();
            optionKeywords.add(optionKeyword);
        }
        return user.makeOption(optionCode, optionMessage, optionChatbotCodeLink, optionInitialFlowCodeLink, optionKeywords);
    }

    /**
     * Permite al User pedir lo necesario para crear un Flow
     * @param user User que creara el Flow
     * @return Flow creado por el User
     */
    private Flow_21065666_VeraRojas makeNewFlow(UserInterface_21065666_VeraRojas user) {
        int flowID;
        String flowNameMsg;
        int cantidadOptions;
        ArrayList<Option_21065666_VeraRojas> flowOptions = new ArrayList<Option_21065666_VeraRojas>();
        Scanner input = new Scanner(System.in);
        Option_21065666_VeraRojas option;

        System.out.println("\n\n### Sistema de Chatbots - Crear un Flujo ###\n");
        System.out.print("\nIngrese el id del flujo: ");
        flowID = input.nextInt();
        input.nextLine();
        System.out.print("\nIngrese el nombre y mensaje del flujo: ");
        flowNameMsg = input.nextLine();
        System.out.print("\nIngrese la cantidad de opciones a crear: ");
        cantidadOptions = input.nextInt();
        for(int j = 0; j < cantidadOptions; j++) {
            option = makeNewOption(user);
            flowOptions.add(option);
            System.out.println("\nOpcion creada y agregada a las Opciones del Flow");
        }
        return user.makeFlow(flowID, flowNameMsg, flowOptions);
    }

    /**
     * Permite al User pedir lo necesario para crear un Chatbot
     * @param user User que creara el Chatbot
     * @return Chatbot creado por el User
     */
    private Chatbot_21065666_VeraRojas makeNewChatbot(UserInterface_21065666_VeraRojas user){
        int chatbotID, chatbotStartFlowID;
        String chatbotName, chatbotWelcomeMessage;
        int cantidadFlujos;
        ArrayList<Flow_21065666_VeraRojas> chatbotFlows = new ArrayList<Flow_21065666_VeraRojas>();
        Scanner input = new Scanner(System.in);
        Flow_21065666_VeraRojas flow;

        System.out.print("\nIngrese el id del chatbot: ");
        chatbotID = input.nextInt();
        input.nextLine();
        System.out.print("\nIngrese el nombre del Chatbot: ");
        chatbotName = input.nextLine();
        System.out.print("\nIngrese el mensaje de bienvenida: ");
        chatbotWelcomeMessage = input.nextLine();
        System.out.print("\nIngrese el el identificador del flujo inicial: ");
        chatbotStartFlowID = input.nextInt();
        input.nextLine();
        System.out.print("\nIngrese la cantidad de flujos a crear: ");
        cantidadFlujos = input.nextInt();
        for(int i = 0; i < cantidadFlujos; i++) {
            flow = makeNewFlow(user);
            chatbotFlows.add(flow);
            System.out.println("\nFlujo creado y agregado a los Flujos del Chatbot");
        }
        return user.makeChatbot(chatbotID, chatbotName, chatbotWelcomeMessage, chatbotStartFlowID, chatbotFlows);
    }

    /**
     * Permite al User pedir lo necesario para modificar un Chatbot
     * @param sys System contenedor del Chatbot
     * @param user User que modificara el Chatbot
     */
    public void modificarChatbot(System_21065666_VeraRojas sys, UserInterface_21065666_VeraRojas user){
        Scanner input = new Scanner(System.in);
        int chatbotID, flowID, tipoModificacionChatbot;
        Flow_21065666_VeraRojas flow;
        Option_21065666_VeraRojas option;

        do {
            System.out.println("\n\n### Sistema de Chatbots - Modificar un Chatbot - Eleccion de Chatbot ###");
            System.out.println("Chatbots disponibles para ser modificados: \n");
            user.verChatbots(sys);
            System.out.print("\nINTRODUZCA EL NUMERO DEL CHATBOT: ");
            chatbotID = input.nextInt();
            input.nextLine();
            if (sys.chatbotExistByID(chatbotID)) {
                do {
                    System.out.println("\n\n### Sistema de Chatbots - Modificar un Chatbot - Tipo de Modificacion ###");
                    System.out.println("1. Agregar un flujo.");
                    System.out.println("2. Modificar un flujo existente.");
                    System.out.print("\nINTRODUZCA UNA OPCION: ");
                    tipoModificacionChatbot = input.nextInt();
                    input.nextLine();
                    switch (tipoModificacionChatbot) {
                        case 1:
                            flow = makeNewFlow(user);
                            user.addFlow(sys, chatbotID, flow);
                            break;

                        case 2:
                            do {
                                System.out.println("\n\n### Sistema de Chatbots - Modificar un Flujo - Eleccion de Flujo ###");
                                System.out.println("Flujos disponibles para ser modificados: ");
                                sys.printChatbotFlowNames(chatbotID);
                                System.out.print("\nINGRESE EL NUMERO IDENTIFICADOR DEL FLUJO: ");
                                flowID = input.nextInt();
                                if (sys.flowExistByFlowID(chatbotID, flowID)) {
                                    option = makeNewOption(user);
                                    user.addOption(sys, chatbotID, flowID, option);
                                }
                            } while(!sys.flowExistByFlowID(chatbotID, flowID));
                            break;

                    }
                    System.out.println("Ingrese una opcion valida.");
                } while (tipoModificacionChatbot != 1 && tipoModificacionChatbot != 2);
            }
        } while (!sys.chatbotExistByID(chatbotID));

    }
}
