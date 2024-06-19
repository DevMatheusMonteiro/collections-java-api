package SetInterface.OrdenacaoEmSet.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    private Set<Aluno> alunos;

    public ListaAlunos() {
        alunos = new HashSet<>();
    }

    public void addAluno(String nome,int matricula, float nota) {
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula) {
        Aluno alunoARemover = new Aluno("", matricula, 0);
        if(!alunos.contains(alunoARemover)){
            System.out.println("Aluno não encontrado!");
            return;
        }
        alunos.remove(alunoARemover);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        for(Aluno aluno : alunosPorNome){
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararNota());
        alunosPorNota.addAll(alunos);
        for(Aluno aluno : alunosPorNota){
            System.out.println(aluno);
        }
    }

    public void exibirAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}
