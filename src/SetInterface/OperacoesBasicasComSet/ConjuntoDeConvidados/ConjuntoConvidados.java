package SetInterface.OperacoesBasicasComSet.ConjuntoDeConvidados;

import java.util.*;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;
    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite ) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
        Convidado convidadoARemover = null;

        for (Convidado convidado : convidados) {
            if (convidado.getCodigoConvite() == codigoConvite){
                convidadoARemover = convidado;
                break;
            }
        }
        convidados.remove(convidadoARemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void imprimirConvidados() {
        for (Convidado convidado : convidados) {
            System.out.println(convidado);
        }
    }
}
