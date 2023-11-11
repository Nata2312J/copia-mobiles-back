package co.com.sistemcesde;

public class EmpEscuela extends UAcademico {
   protected String rol;
   protected String area;
//Constructor
    public EmpEscuela (String escuela){
        this.escuela=escuela;
    }
    //Getter and setter
    public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol=rol;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area=area;
    }


    //Metodo

    public void consultarEst(){
         login();
    }
}
