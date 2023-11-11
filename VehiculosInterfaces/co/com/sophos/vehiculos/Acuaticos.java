package co.com.sophos.vehiculos;

import java.util.Scanner;

public class Acuaticos extends Vehiculos {
    Matricula matricula;
    private int numMotores;

    Vehiculos vehiculos=new Vehiculos() {
        @Override
        public void ingresarVenta() {
            super.ingresarVenta() ;
        }

        @Override
        public void verVenta() {
            super.verVenta()  ;
        }
    };
    Propietario propietario=new Propietario(){
        @Override
        public void crearPropietario(){
            super.crearPropietario();
        }
        @Override
        public void verPropietario(){
            super.verPropietario();
        }
    };



    //Constructor
    public Acuaticos(){
        super();
    }

    public Acuaticos(int numMotores) {
        this.numMotores = numMotores;
    }
//Getter y setter
    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }


    @Override
    public void encender() {
        super.encender() ;
    }

    @Override
    public void apagar() {
        super.apagar();
    }


}
