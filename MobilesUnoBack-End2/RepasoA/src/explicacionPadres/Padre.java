package explicacionPadres;
import java.util.Scanner;

public class Padre {
    Scanner sc=new Scanner(System.in);
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }
   public String getnombre(){
        return this.nombre;
   }


   public void setApellido(String apellido){
        this.apellido=apellido;
   }
   public String getApellido(){
        return this.apellido;
   }

   public void setEdad(int edad){
        this.edad=edad;
   }
   public int getEdad(){
        return this.edad;
   }

   public void setOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
   }
   public String getOcupacion(){
        return ocupacion=ocupacion;
   }

   //CONSTRUCTOR
    public Padre(){//Instructor vacio

    }

    public Padre(int id, String nombre, String apellido, int edad, String ocupacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    //Comportamientos o metodos
    public void crearPadre(){
        System.out.println("Escriba el id del padre: ");
       id=sc.nextInt();
       sc.skip("\n");
        System.out.println("escriba el nombre del padre: ");
        nombre=sc.nextLine();
        System.out.println("Escriba el apellido del padre: ");
        apellido=sc.nextLine();
        System.out.println("Escriba la edad del padre: ");
        edad=sc.nextInt();
        sc.skip("\n");
        System.out.println("Escriba la ocupacion del padre: ");
        ocupacion=sc.nextLine();
    }
    public void verPadre(){
        System.out.println("id: " + id + "\n"+
                " Nombre: " + nombre + "\n"+
                " Apellido: " + apellido + "\n" +
                " Edad: " + edad + "\n" +
                " Ocupacion: " + ocupacion + "\n"
                );
    }

}
