package poo;
import java.util.Scanner;
public class Usuario {
   Scanner sc=new Scanner(System.in);
        //ATRIBUTOS

        int id;
        String nombre;
        String apellido;
        int documento;
        String correo;
        String telefono;
        String rol;





        //Metodos
        public void registrarUsuario(){
            System.out.println("Ingrese el id: ");
           id=sc.nextInt();
           sc.skip("\n");
            System.out.println("Ingrese su nombre: ");
            nombre=sc.nextLine();
            System.out.println("Ingrese su apellido : ");
            apellido=sc.nextLine();
            System.out.println("Ingrese su documento: ");
            documento=sc.nextInt();
            System.out.println("Ingrese su correo: ");
            correo=sc.nextLine();
            sc.skip("\n");
            System.out.println("Ingrese su telefono: ");
            telefono=sc.nextLine();
            System.out.println("Ingrese su rol: ");
            rol=sc.nextLine();

        }
        public void imprimirRegistro(){
            System.out.println("id: " + id + "\n"+
                    "nombre: " + nombre + "\n"+
                    "apellido: " + apellido + "\n"+
                    "documento: " + documento + "\n"+
                    "correo: " + correo + "\n"+
                    "telefono: " + telefono + "\n"+
                    "rol: " + rol + "\n"
                    );
        }



}
