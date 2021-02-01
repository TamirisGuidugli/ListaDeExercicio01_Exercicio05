package ListaDeExercicio01_Exercicio6;

import java.util.ArrayList;

public class Curso {


    private Professor professor;
    private ArrayList<Aluno> alunoArrayList;
    private String horario;
    private String nome;

    public Curso(String nome, String horario) {

        this.nome = nome;
        this.horario = horario;
        this.alunoArrayList = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getHorario() {
        return horario;
    }

    public String getNome() {
        return nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getListaAlunos() {

        StringBuilder alunos = new StringBuilder();
        for (Aluno aluno : this.alunoArrayList) {
            alunos.append(aluno.getNome() + " | Média : "+ aluno.getMedia() + " | " + aluno.isAprovado()).append("\n");
        }

        return alunos.toString();
    }

    public ArrayList<Aluno> getAlunosList() {

        return this.alunoArrayList;
    }

    public void setAlunoArrayList(ArrayList<Aluno> alunoArrayList) {
        this.alunoArrayList = alunoArrayList;
    }

    public double mediaTurma() {

        if (this.alunoArrayList.size() == 0) return 0.0;

        double mediaTurma = 0.0;
        for (Aluno aluno : this.alunoArrayList) {
            mediaTurma += aluno.getMedia();
        }

        return mediaTurma / this.alunoArrayList.size();
    }

}