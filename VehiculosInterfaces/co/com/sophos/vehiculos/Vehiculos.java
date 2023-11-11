package co.com.sophos.vehiculos;
import java.util.Scanner;

public abstract class Vehiculos implements MetodosVehiculos{
    Scanner sc=new Scanner(System.in);
    Matricula matricula=new Matricula();

    //METODOS SOBREESCRITOS
    @Override
    public void encender() {
        System.out.println("Seguro que desea encender?: \n(Si)(No)");
        String opc=sc.nextLine();
        if(opc.equalsIgnoreCase("Si")){
            System.out.println("Encendiendo....");
        }else{
            System.out.println("Vehiculo no encendido..");
        }

    }
    @Override
    public void apagar() {
        System.out.println("Seguro que desea apagar?: \n(Si)(No)");
        String opcion=sc.nextLine();
        if(opcion.equalsIgnoreCase("Si")){
            System.out.println("Apagando....");
        }else{
            System.out.println("Vehiculo no apagado...");
        }
    }
    public void ingresarVenta(){
        System.out.println("Ingrese la clasificacion del vehiculo:  ");
        matricula.clasificacion=sc.nextLine();
        System.out.println("Ingrese el id del vehiculo: ");
        matricula.idVehiculo=sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el modelo del vehiculo: ");
        matricula.modeloVehiculo=sc.nextLine();
        System.out.println("Ingrese el año de creacion del vehiculo:  ");
        matricula.anoCreacion=sc.nextLine();
        System.out.println("Ingrese el precio del vehiculo: ");
        matricula.precioVehiculo=sc.nextDouble();
        sc.skip("\n");
        System.out.println("Ingrese la placa del vehiculo. ");
        matricula.placa=sc.nextLine();
    }
    public void verVenta(){
        System.out.println("Clasificacion vehiculo: " + matricula.clasificacion + "\nId vehiculo " + matricula.idVehiculo + "\nModelo vehiculo: " + matricula.modeloVehiculo + "\nAño creacion: " + matricula.anoCreacion + "\nPrecio de vehiculo: " + matricula.precioVehiculo + "\nPlaca vehiculo: " + matricula.placa);
    }
    public void facturaventa(){
        System.out.println("id: " + matricula.idVehiculo);
    }



}
