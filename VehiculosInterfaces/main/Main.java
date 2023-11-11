package main;

import co.com.sophos.vehiculos.*;

public class Main {


    public static void main(String[] args) {

        Matricula matricula =new Matricula();
        Propietario propietario=new Propietario();
        Aereos aereos=new Aereos();
        Terrestres terrestres=new Terrestres();
        MetodosVehiculos metodosVehiculos=new MetodosVehiculos() {
            @Override
            public void encender() {

            }

            @Override
            public void apagar() {

            }
        };

        Acuaticos yate=new Acuaticos();

        yate.matricula=matricula;
        yate.propietario=propietario;
        yate.generarVenta();
        yate.facturaventa();



    }
}
