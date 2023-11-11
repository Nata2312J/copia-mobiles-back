package co.com.consultas.modelo;

import co.com.consultas.modelo.Medico;
import co.com.consultas.modelo.Paciente;
import co.com.consultas.modelo.Recepcionista;

import java.util.Random;

public class TestRecepcionista {


    public static void main(String[] args) {



        Recepcionista recepcionista = new Recepcionista();

        Paciente paciente = new Paciente();

        Medico medico = new Medico();

        System.out.println(medico);


        recepcionista.crearUsuario(paciente);
        recepcionista.verUsuario(paciente);
        medico.verUsuario(paciente);
        paciente.verUsuario(paciente);




    }

}
