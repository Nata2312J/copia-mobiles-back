package co.com.consultas.modelo;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    Recepcionista recepcion = new Recepcionista();
    Medico medico = new Medico();
    Paciente paciente = new Paciente();
    Cita cita = new Cita();


    public void menuRecepcion(){

        System.out.println("1. Inicializar");

        int init = sc.nextInt();

        while (init != 0){

            System.out.println("1. Crear Recepcion\n" +
                    "2. Ver Recepcion \n" +
                    "3. Crear Medico \n" +
                    "4. Ver Medico \n" +
                    "5. Crear Paciente \n" +
                    "6. Ver paciente\n" +
                    "7. Agendar Cita\n" +
                    "8. Ver Cita\n" +
                    "9.Salir");


            int opc = sc.nextInt();

            switch (opc){

                case 1:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Crear Recepcion");
                    recepcion.crearUsuario();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Ver Recepcion");
                    recepcion.verUsuario();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Crear Medico");
                    System.out.println(medico);
                    recepcion.crearUsuario(medico);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Ver Medico");
                    recepcion.verUsuario(medico);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Crear Paciente");
                    System.out.println(paciente);
                    recepcion.crearUsuario(paciente);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Ver Paciente");
                    recepcion.verUsuario(paciente);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Crear Cita");
                    recepcion.crearCita(cita);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 8:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Ver Cita");

                    recepcion.medico = medico;
                    recepcion.paciente = paciente;
                    System.out.println(paciente);
                    System.out.println(medico);
                    cita.nombreMedico = medico;
                    cita.nombrePaciente = paciente;
                    System.out.println(cita.nombrePaciente);
                    System.out.println(cita.nombreMedico);

                    recepcion.verCita(cita);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 9:
                    System.out.println("Salir ");
                    init = 0;
                    break;
                case 10:
                    System.out.println(paciente);
                    System.out.println(medico);
                    System.out.println(cita.nombreMedico);
                    System.out.println(cita.nombrePaciente);
                default:
                    System.out.println("Seleccione una opcion valida");


            }



        }



    }




}
