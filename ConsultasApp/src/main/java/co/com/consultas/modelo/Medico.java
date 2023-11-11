package co.com.consultas.modelo;

public class Medico extends  Usuario{

    protected int idMedico;
    protected String especialidad;

    Paciente paciente;


    Recepcionista recepcionista;




    public Medico(){
        super();
    }

    public Medico(int idUsuario, String nombre, String apellido, String correo,
                  String telefono, String direccion, int idMedico, String especialidad) {
        super(idUsuario, nombre, apellido, correo, telefono, direccion);
        this.idMedico = idMedico;
        this.especialidad = especialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //metodos Propios


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

    public void verCitaMed(Cita cita){



        System.out.println("ID Cita: " + cita.getIdCita());
        System.out.println("Especialidad: " + cita.getEspecialidad());
        System.out.println("Nombre Paciente: " + paciente.getNombre());
        System.out.println("Nombre Medico: " + getNombre());
        System.out.println("ID Cita: " + cita.getIdCita());

    }

    public void crearHistoriaClinica(HistoriaClinica historia){

        System.out.println("Ingrese el id de la historia:");
        int id = sc.nextInt();
        sc.skip("\n");
        historia.setIdHistoria(id);
        /*
        System.out.println("Ingrese el nombre del paciente");
        String nombre = sc.nextLine();
        historia.setPaciente(nombre);
        System.out.println("Ingrese el nombre del medico: ");
        String nombreMed = sc.nextLine();
        historia.setMedico(nombreMed);
        */

        System.out.println("Escriba el diagnostico del paciente:");
        String diagnostico = sc.nextLine();
        historia.setDiagnostico(diagnostico);
    }

    public void verHistoriaClinica(HistoriaClinica historia){
        System.out.println("Id Historia: " + historia.getIdHistoria());
        System.out.println("Nombre Paciente: " + historia.getPaciente());
        System.out.println("Nombre Medico: " + historia.getMedico());
        System.out.println("Diagnostico: " + historia.getDiagnostico());
    }


}
