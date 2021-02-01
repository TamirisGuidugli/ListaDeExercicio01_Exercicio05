package ListaDeExercicio01_Exercicio6;
import java.util.ArrayList;
import java.util.List;
public class Aluno {

    //Propriedades

    private String nome;
    private String matricula;
    private List<Double> notas;

    public Aluno(String nome, String matricula, ArrayList<Double> notas){

        this.nome = nome;
        this.matricula = matricula;

        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    

    public String getMatricula() {
        return matricula;
    }

  

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double getMedia(){

        double media =0;
        for (Double nota : this.notas) {
            media = media + nota;
        }
        return media/this.notas.size();
    }

    public  String isAprovado(){

        if ( this.getMedia() >= 7.0){
            return "Apovado";

        }else {
            return "Reprovado";
        }

    }

}
