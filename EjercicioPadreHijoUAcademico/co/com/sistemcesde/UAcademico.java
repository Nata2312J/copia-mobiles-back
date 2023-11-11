package co.com.sistemcesde;
import java.util.Scanner;
public class UAcademico {
    Scanner sc=new Scanner(System.in);
    protected int id;
    protected String password;
    protected String correo;
    protected String nombre;
    protected String escuela;


//Metodo constructor
    public UAcademico(){//Constructor vacio

    }
    public UAcademico(int id, String password, String correo, String nombre, String escuela){
        this.id=id;
        this.password=password;
        this.nombre=nombre;
        this.correo=correo;
        this.escuela=escuela;
    }
    //Getter and setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getCorreo(){
        return correo;
    }
    public void setGmail(String correo){

        this.correo=correo;
    }
    public String getNombre(){

        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getEscuela(){
        return escuela;
    }
    public void setEscuela(String escuela){
        this.escuela=escuela;
    }

    //Metodos
    public void crearUsuario(){
        System.out.println("Para crear nuevo usuario ingrese los siguientes datos: ");
        System.out.println("Ingrese su identificacion: ");
        id=sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese su escuela: ");
        escuela=sc.nextLine();
        System.out.println("Ingrese su correo: ");
        correo=sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        password=sc.nextLine();
    }
    public void verUsuario(){
        System.out.println("Usuario registrado, sus datos son: " + "\n"+
                "Identificacion: " + id + "\n"+
                "Nombre: " + nombre + "\n"+
                "Correo: " + correo + "\n" +
                "Escuela: " + escuela + "\n" +
                "Contraseña: " + password
                           );
    }
    public void login() {
        System.out.println("Inicie sesion: ");
        System.out.println("Ingrese su correo");
        String correoIngre = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String passwordIngre = sc.nextLine();
      if(correoIngre.equals(correo) && passwordIngre.equals(password)){
          System.out.println("Sesion iniciada: ");
      }else{
          System.out.println("Contraseña o correo incorrecto");
      }
    }
}
