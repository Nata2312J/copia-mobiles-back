package co.com.sophos.vehiculos;

import java.util.Scanner;

public class Matricula {
    Scanner sc=new Scanner(System.in);

    //ATRIBUTOS

    protected String clasificacion;
    protected int idVehiculo;
    protected String modeloVehiculo;
    protected String anoCreacion;
    protected double precioVehiculo;
    protected String placa;




    //CONSTRUCTOR


    public Matricula() {
        this.sc = sc;
        this.clasificacion = clasificacion;
        this.idVehiculo = idVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.anoCreacion = anoCreacion;
        this.precioVehiculo = precioVehiculo;
        this.placa=placa;
    }
    public void Matricula(){

    }

    //GETTERS AND SETTERS

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(String anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public double getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }



}
