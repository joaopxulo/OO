package Classes;

public class SistemaDePontosFidelidade {

    private int pontosAcumulados;

    public SistemaDePontosFidelidade() {
        this.pontosAcumulados = 0;
    }

    public SistemaDePontosFidelidade(int pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }

    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontosAcumulados += pontos;
        }
    }

    public boolean removerPontos(int pontos) {
        if (pontos > 0 && pontos <= this.pontosAcumulados) {
            this.pontosAcumulados -= pontos;
            return true;
        }
        return false;
    }

    public int retornaPontos() {
        return this.pontosAcumulados;
    }

    public boolean resgatarPontos(int pontosParaResgate) {
        return removerPontos(pontosParaResgate);
    }
}
