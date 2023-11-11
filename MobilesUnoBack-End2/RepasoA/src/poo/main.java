package poo;

public class main {
    public static void main(String[] args) {
        Usuario estudiante= new Usuario();
        Usuario profesor=new Usuario();

        estudiante.nombre="Pepito";
        profesor.nombre="Kevin";

        System.out.println(estudiante.nombre);
        System.out.println(profesor.nombre);

        estudiante.registrarUsuario();
        profesor.registrarUsuario();
        estudiante.imprimirRegistro();
        profesor.imprimirRegistro();

    }
}
