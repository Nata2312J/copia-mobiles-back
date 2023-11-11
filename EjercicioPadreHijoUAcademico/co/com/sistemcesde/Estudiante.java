package co.com.sistemcesde;

public class Estudiante extends UAcademico{
    private String programa ;

    // constructor

    public Estudiante(String escuela){
        this.escuela=escuela;
    }
    //Getter and setter
    public String getPrograma(){
        return programa;
    }
    public void setPrograma(String programa){
        this.programa=programa;
    }
    //Metodos
    public void verNotas(){
    }

}
