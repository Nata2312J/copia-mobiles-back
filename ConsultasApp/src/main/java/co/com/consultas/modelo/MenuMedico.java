package co.com.consultas.modelo;

import java.util.Scanner;

public class MenuMedico {
    Scanner sc=new Scanner(System.in);
    Medico medico=new Medico();
    Paciente paciente=new Paciente();
    HistoriaClinica hc=new HistoriaClinica();
    Cita cita=new Cita();
    public void menuMed(){
        System.out.println("Ingrese 1 para continuar: ");
        int iniMed=sc.nextInt();
        while(iniMed!=0){
            System.out.println("1.Ver citas\n2.Crear historia de paciente\n3.ver historia de paciente\n4.Ver mis datos \n5.Volver");
            int opc= sc.nextInt();
            switch (opc){
                case 1:
                    medico.verCitaMed(cita);
                    break;
                case 2:
                    hc.medico=medico;
                    hc.paciente=paciente;
                    hc.crearHistoriaClinica(hc);
                    break;
                case 3:
                    medico.verHistoriaClinica(hc);
                    break;
                case 4:
                    medico.verUsuario(medico);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }





}
