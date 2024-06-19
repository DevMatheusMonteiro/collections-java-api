package MapInterface.OrdenaCaoEmMap.AgendaDeEventos;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String atracao, String nome) {
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "atracao='" + atracao + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
