package MiEjercicio;

public class main {
    public static void main(String[] args) {
       EjercicioBiblioteca resplandor=new EjercicioBiblioteca();
       resplandor.setNombreLibro("El resplandor");
       resplandor.setCategoria("Terror");
       resplandor.setAutor("Stephen King");
       resplandor.setAñoCreacion("1980");
       System.out.println("El nombre del libro es: " + resplandor.getNombreLibro() + " Su categoria es: " + resplandor.getCategoria() + " Su autor es: " + resplandor.getAutor() + " Su fecha de lanzamiento fue en: " + resplandor.getAñoCreacion());

       EjercicioBiblioteca conspiracion= new EjercicioBiblioteca();
       conspiracion.setNombreLibro("La conspiracion");
       conspiracion.setCategoria("misterio");
       conspiracion.setAutor("Dan brown");
       conspiracion.setAñoCreacion("2001");

       System.out.println("El nombre del libro es: " + conspiracion.getNombreLibro() + " Su categoria es: " + conspiracion.getCategoria() + " Su autor es: " + conspiracion.getAutor() + " Su fecha de lanzamiento fue en: " + conspiracion.getAñoCreacion());

       EjercicioBiblioteca correr=new EjercicioBiblioteca();
       correr.setNombreLibro("correr o morir");
       correr.setCategoria("Aventura");
       correr.setAutor("james dasher");
       correr.setAñoCreacion("2009");
       System.out.println("El nombre del libro es: " + correr.getNombreLibro() + " Su categoria es: " + correr.getCategoria() + " Su autor es: " + correr.getAutor() + " Su fecha de lanzamiento fue en: " + correr.getAñoCreacion());
    }
}
