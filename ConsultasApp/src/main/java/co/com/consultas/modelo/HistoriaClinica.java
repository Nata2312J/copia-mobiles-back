package co.com.consultas.modelo;
import java.util.Scanner;
public class HistoriaClinica {
    Scanner sc=new Scanner(System.in);

    private int idHistoria;
    Paciente paciente;
    Medico medico;
    private String diagnostico;

    public HistoriaClinica(){

    }

    public HistoriaClinica(int idHistoria, String diagnostico) {
        this.idHistoria = idHistoria;
        this.diagnostico = diagnostico;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }


    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }



}
