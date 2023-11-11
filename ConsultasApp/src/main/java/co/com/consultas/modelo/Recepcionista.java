package co.com.consultas.modelo;

import java.util.Scanner;

public class Recepcionista extends Usuario {

    Scanner sc = new Scanner(System.in);


    private String cargo;
    Paciente paciente;

    Medico medico;




    public Recepcionista(){

        super();
    }


    public Recepcionista(int idUsuario, String nombre, String apellido, String correo, String telefono, String direccion, String cargo) {
        super(idUsuario, nombre, apellido, correo, telefono, direccion);
        this.cargo = cargo;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }




    //---------------------------------metodos-----------------------------------------






    @Override
    public void crearUsuario(Paciente paciente) {

        System.out.println("Ingrese el ID del Usuario:");
        int idUsuario = sc.nextInt();
        paciente.setIdUsuario(idUsuario);
        sc.skip("\n");
        System.out.println("Ingrese el nombre del usuario");
        String nombre = sc.nextLine();
        paciente.setNombre(nombre);
        System.out.println("Ingrese el apellido del usuario:");
        String apellido = sc.nextLine();
        paciente.setApellido(apellido);
        System.out.println("Ingrese el correo del usuario: ");
        String correo = sc.nextLine();
        paciente.setCorreo(correo);
        System.out.println("Ingrese el telefono del usuario: ");
        String telefono = sc.nextLine();
        paciente.setTelefono(telefono);
        System.out.println("INgrese la direccion del usuario: ");
        String direccion = sc.nextLine();
        paciente.setDireccion(direccion);
        System.out.println("Ingrese la eps del paciente: ");
        String eps = sc.nextLine();
        paciente.setEps(eps);
    }

    @Override
    public void verUsuario(Paciente paciente) {

        System.out.println("id: " + paciente.getIdUsuario() + "\n" +
                "Nombre: " + paciente.getNombre() + "\n" +
                "Apellido: " + paciente.getApellido() + "\n" +
                "Correo" + paciente.getCorreo() + "\n" +
                "Telefono:" + paciente.getTelefono() + "\n" +
                "Direccion: " + paciente.getDireccion() + "\n" +
                "Eps: " + paciente.getEps());
    }



    @Override
    public void crearUsuario(Medico medico) {

        System.out.println("Ingrese el ID del Usuario:");
        int idUsuario = sc.nextInt();
        medico.setIdUsuario(idUsuario);
        sc.skip("\n");
        System.out.println("Ingrese el nombre del usuario");
        String nombre = sc.nextLine();
        medico.setNombre(nombre);
        System.out.println("Ingrese el apellido del usuario:");
        String apellido = sc.nextLine();
        medico.setApellido(apellido);
        System.out.println("Ingrese el correo del usuario: ");
        String correo = sc.nextLine();
        medico.setCorreo(correo);
        System.out.println("Ingrese el telefono del usuario: ");
        String telefono = sc.nextLine();
        medico.setTelefono(telefono);
        System.out.println("INgrese la direccion del usuario: ");
        String direccion = sc.nextLine();
        medico.setDireccion(direccion);
        System.out.println( "Ingrese la espacialidad");
        String especialidad = sc.nextLine();
        medico.setEspecialidad(especialidad);


    }

    @Override
    public void verUsuario(Medico medico) {
        System.out.println("id: " + medico.getIdMedico() + "\n" +
                "Nombre: " + medico.getNombre() + "\n" +
                "Apellido: " + medico.getApellido() + "\n" +
                "Correo" + medico.getCorreo() + "\n" +
                "Telefono:" + medico.getTelefono() + "\n" +
                "Direccion: " + medico.getDireccion() + "\n");
        System.out.println("Especialidad" + medico.getEspecialidad());
    }


    public void crearCita(Cita cita){

        System.out.println("Ingrese el id de la cita:");
        int idCita = sc.nextInt();
        sc.skip("\n");
        cita.setIdCita(idCita);
        System.out.println("Ingrese la especialidad que requiere");
        String especialidad = sc.nextLine();
        cita.setEspecialidad(especialidad);
        System.out.println("Numero de consultorio");
        String consultorio = sc.nextLine();
        cita.setConsultorio(consultorio);
        System.out.println("Ingrese la fecha: ");
        String fecha = sc.nextLine();
        cita.setDia(fecha);
        System.out.println("Ingrese la hora: ");
        String hora = sc.nextLine();
        cita.setHora(hora);
    }

    public void verCita(Cita cita){
        //Esto es la composicion de clases
        cita.nombrePaciente = paciente;
        cita.nombreMedico = medico;
        //---------------------------

        System.out.println(cita.nombreMedico);
        System.out.println(cita.nombrePaciente);



        System.out.println("ID Cita: " + cita.getIdCita());
        System.out.println("Especialidad: " + cita.getEspecialidad());
        System.out.println("Nombre Paciente: " + paciente.getNombre());
        System.out.println("Apellido Paciente: " + paciente.getApellido());
        System.out.println("Nombre Medico" + medico.getNombre());
        System.out.println("Apellido Medico " + medico.getApellido());
        System.out.println("Consultorio " + cita.getConsultorio());
        System.out.println("Fecha: " + cita.getDia());
        System.out.println("Hora " + cita.getHora());

    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}



