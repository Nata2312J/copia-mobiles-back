package co.com.consultas.modelo;

import java.util.Scanner;

public abstract class Usuario implements GestionUsuario, Login {

    Scanner sc = new Scanner(System.in);

    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;


    // Constructor

    public Usuario(){

    }

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String telefono, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    // Getters and Setters




    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    //Metodos Propios

    public void crearUsuario(){

        System.out.println("Ingrese el ID del Usuario:");
        idUsuario = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del usuario");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del usuario:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el correo del usuario: ");
        correo = sc.nextLine();
        System.out.println("Ingrese el telefono del usuario: ");
        telefono = sc.nextLine();
        System.out.println("INgrese la direccion del usuario: ");
        direccion = sc.nextLine();

    }

    public void crearUsuario(Paciente paciente){

        System.out.println("Ingrese el ID del Usuario:");
        idUsuario = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del usuario");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del usuario:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el correo del usuario: ");
        correo = sc.nextLine();
        System.out.println("Ingrese el telefono del usuario: ");
        telefono = sc.nextLine();
        System.out.println("INgrese la direccion del usuario: ");
        direccion = sc.nextLine();

    }


    public void verUsuario(){

        System.out.println("id: " + idUsuario + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Correo" + correo + "\n" +
                "Telefono:" + telefono + "\n" +
                "Direccion: " + direccion + "\n");
    }

    public void verUsuario(Paciente paciente){

        System.out.println("id: " + idUsuario + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Correo" + correo + "\n" +
                "Telefono:" + telefono + "\n" +
                "Direccion: " + direccion + "\n");
    }

    public void verUsuario(Medico medico){

        System.out.println("id: " + idUsuario + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Correo" + correo + "\n" +
                "Telefono:" + telefono + "\n" +
                "Direccion: " + direccion + "\n");
    }

    public void crearUsuario(Medico medico){

        System.out.println("Ingrese el ID del Usuario:");
        idUsuario = sc.nextInt();
        setIdUsuario(idUsuario);
        sc.skip("\n");
        System.out.println("Ingrese el nombre del usuario");
        nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del usuario:");
        apellido = sc.nextLine();

        System.out.println("Ingrese el correo del usuario: ");
        correo = sc.nextLine();
        setCorreo(correo);
        System.out.println("Ingrese el telefono del usuario: ");
        telefono = sc.nextLine();
        setTelefono(telefono);
        System.out.println("INgrese la direccion del usuario: ");
        direccion = sc.nextLine();
        setDireccion(direccion);

    }
    @Override
    public void iniciarSesion(){

    }
}
