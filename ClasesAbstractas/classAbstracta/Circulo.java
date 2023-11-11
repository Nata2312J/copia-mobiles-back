package classAbstracta;

public class Circulo extends Figura{

    private double radio;
   //Constructor
    public Circulo() {
    }
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }
  //Getter and setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


//Metodo abstracto heredado
    @Override
    public double calcularArea() {
        double pi=3.14;
         double result=pi*radio*radio;
         return result;
    }
}
