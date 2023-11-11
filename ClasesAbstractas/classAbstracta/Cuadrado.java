package classAbstracta;

public class Cuadrado extends Figura{

    private double lado;
    //Constructor
    public Cuadrado() {
    }
    public Cuadrado(double lado; double x, double y){
        super(x,y);
        this.lado=lado;
    }
    //getter and setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
//Metodo
    @Override //Sobre escritura
    public double calcularArea() {
        double result=lado*lado;
        return result;
    }
}
