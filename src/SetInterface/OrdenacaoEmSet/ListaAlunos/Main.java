package SetInterface.OrdenacaoEmSet.ListaAlunos;

public class Main {
    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();
        listaAlunos.addAluno("Matheus", 1, 10);
        listaAlunos.addAluno("Samuel", 2, 9.5f);
        listaAlunos.addAluno("Juan", 3, 8.5f);
        listaAlunos.addAluno("Julia", 3, 7.7f);

        System.out.println("Sem ordem");
        listaAlunos.exibirAlunos();
        System.out.println("Ordenado por nome");
        listaAlunos.exibirAlunosPorNome();
        System.out.println("Ordenado por nota");
        listaAlunos.exibirAlunosPorNota();
        System.out.println("**********");
        listaAlunos.removerAluno(3);
        listaAlunos.exibirAlunosPorNota();
    }
}
