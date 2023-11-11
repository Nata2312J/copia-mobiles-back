package co.com.consultas.test;

import co.com.consultas.modelo.Cita;
import co.com.consultas.modelo.Medico;
import co.com.consultas.modelo.Paciente;
import co.com.consultas.modelo.Recepcionista;

public class TestCita {


    public static void main(String[] args) {

        Recepcionista recepcionista = new Recepcionista();

        Medico medico = new Medico();

        Paciente paciente = new Paciente();

        Cita cita = new Cita();

        recepcionista.crearCita(cita);
        recepcionista.verCita(cita);
        medico.verCitaMed(cita);
        paciente.verCitaPac(cita);






    }
}
