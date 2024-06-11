package ListInterface.OrdenacaoEmList.OrdenacaoPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return
            "Nome: " + nome +
            "\nIdade: " + idade +
            "\nAltura: " + String.format("%.2f", altura).replace(".", ",");
    }
}

class CompararAltura implements Comparator<Pessoa> {
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Float.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}
