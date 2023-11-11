package co.com.sophos.vehiculos;
import java.util.Scanner;
public class Propietario {
    Scanner sc=new Scanner(System.in);
    //Atributos
    protected String idPropietario;
    protected String nombre;
    protected String telefono;
    protected String direccion;
    protected int edad;
    //Constructor
    public Propietario(Scanner sc, String idPropietario, String nombre, String telefono, String direccion, int edad) {
        this.sc = sc;
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public Propietario() {
        super();
    }
    //Getters and setters

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    public void crearPropietario(){
        System.out.println("Ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese su identificacion: ");
        idPropietario=sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad=sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese su telefono: ");
        telefono=sc.nextLine();
    }
    public void verPropietario(){
        System.out.println("Nombre del propietario: " + nombre + "\nIdentificacion del propietario: " + idPropietario + "\nEdad del propietario: " + edad + "\nTelefono propietario: " + telefono );
    }

}
