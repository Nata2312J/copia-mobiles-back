package MiEjercicio;
import java.util.Scanner;

public class EjercicioBiblioteca {
    Scanner sc=new Scanner(System.in);
    private String nombreLibro;
    private String categoria;
    private String añoCreacion;
    private String autor;

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
   public String getNombreLibro(){
        return this.nombreLibro;
    }
    public void setCategoria(String categoria){

        this.categoria=categoria;
    }
    public String getCategoria(){

        return this.categoria;
    }
    public void setAñoCreacion(String añoCreacion){

        this.añoCreacion=añoCreacion;
    }
    public String getAñoCreacion(){

        return this.categoria;
    }
    public void setAutor(String autor){

        this.autor=autor;
    }
    public String getAutor(){

        return this.autor;
    }
    public EjercicioBiblioteca(){

    }
    public EjercicioBiblioteca (String nombreLibro, String categoria, String autor, String añoCreacion){
      this.nombreLibro=nombreLibro;
      this.categoria=categoria;
      this.autor=autor;
      this.añoCreacion=añoCreacion;
    }
    public void crearEjercicioBiblioteca(){
        System.out.println("ingrese el nombre del libro: ");
        nombreLibro=sc.nextLine();
        System.out.println("Ingrese el autor de su libro");
        autor=sc.nextLine();
        System.out.println("Ingrese la categoria de su libro. ");
        categoria=sc.nextLine();
        System.out.println("Ingrese el año de creacion del libro: ");
        añoCreacion=sc.nextLine();
    }



}
