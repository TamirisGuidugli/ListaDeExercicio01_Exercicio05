package ListaDeExercicio01_Exercicio6;


import java.util.ArrayList;


public class TestaExercicio6 {

    public static void main(String[] args) {

    	ArrayList<Double> marianotas = new ArrayList<Double>();
        marianotas.add(10.0);
        marianotas.add(8.0);
        marianotas.add(10.0);
        marianotas.add(9.0);

        ArrayList<Double> ananotas = new ArrayList<Double>();
        ananotas.add(7.0);
        ananotas.add(7.0);
        ananotas.add(7.0);
        ananotas.add(7.0);

        ArrayList<Double> bianotas = new ArrayList<Double>();
        bianotas.add(6.0);
        bianotas.add(6.0);
        bianotas.add(3.0);
        bianotas.add(3.0);

        ArrayList<Double> carolnotas = new ArrayList<Double>();
        carolnotas.add(1.0);
        carolnotas.add(1.0);
        carolnotas.add(1.0);
        carolnotas.add(1.0);
        
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("maria", "001", marianotas);
        alunos.add(aluno1);

        Aluno aluno2 = new Aluno("ana", "002", ananotas);
        alunos.add(aluno2);

        Aluno aluno3 = new Aluno("bia", "003", bianotas);
        alunos.add(aluno3);

        Aluno aluno4 = new Aluno("carol", "004", carolnotas);
        alunos.add(aluno4);

        Professor professor = new Professor("Girafales", "Astrofísica", "girafales@sbt.com.br");
        Curso curso = new Curso("Astrofisica", "08:00");

        curso.setProfessor(professor);
        curso.setAlunoArrayList(alunos);

        System.out.println("Nome do curso: " + curso.getNome());
        System.out.println("Horário do curso: " + curso.getHorario());
        System.out.println("Nome do Professor: " + curso.getProfessor().getNome());
        System.out.println("Lista Alunos : ");
        System.out.println(curso.getListaAlunos());
        System.out.println("Média da turma : " + curso.mediaTurma());

    }
}