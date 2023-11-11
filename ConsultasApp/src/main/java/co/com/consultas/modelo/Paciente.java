package co.com.consultas.modelo;

public class Paciente extends  Usuario{


    //static Paciente paciente = new Paciente();


    protected String eps;

    Medico medico;
    Paciente paciente;

    public Paciente(){

        super( );
    }


    public Paciente(int idUsuario, String nombre, String apellido, String correo, String telefono, String direccion, String eps) {
        super(idUsuario, nombre, apellido, correo, telefono, direccion);
        this.eps = eps;
    }


    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }



    public void verCitaPac(Cita cita){

        cita.nombrePaciente = paciente;
        cita.nombreMedico = medico;


        System.out.println("ID Cita: " + cita.getIdCita());
        System.out.println("Especialidad: " + cita.getEspecialidad());
        System.out.println("Nombre Paciente: " + paciente.getNombre());
        System.out.println("Nombre Medico: " + medico.getNombre());
        System.out.println("ID Cita: " + cita.getIdCita());

    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
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
}
