package co.com.consultas.modelo;

public class Cita {

    private  int idCita;
    private String especialidad;

    Paciente nombrePaciente;

    Medico nombreMedico;

    private String consultorio;

    private String dia;
    private String mes;
    private String anio;

    private String hora;



    public Cita(){


    }

    public Cita(int idCita, String especialidad, String consultorio, String dia, String mes, String anio, String hora) {
        this.idCita = idCita;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(Paciente nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Medico getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(Medico nombreMedico) {
        this.nombreMedico = nombreMedico;
    }
}
