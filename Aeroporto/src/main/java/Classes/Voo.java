package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Voo {

    private String numDoVoo;
    private String destino;
    private int capacidadeMaxPassageiro;
    private List<Passageiro> lista_passageiros = new ArrayList<>();
    private List<String> lista_escalas = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);
    private String estadoDeVoo;

    public Voo() {
        this.numDoVoo = " ";
        this.destino = " ";
        this.capacidadeMaxPassageiro = 0;
        this.lista_passageiros = new ArrayList<>();
        this.lista_escalas = new ArrayList<>();
        this.estadoDeVoo = " ";
    }

    public Voo(String numDoVoo, String destino, int capacidadeMaxPassageiro, String estadoDeVoo) {
        this.numDoVoo = numDoVoo;
        this.destino = destino;
        this.capacidadeMaxPassageiro = capacidadeMaxPassageiro;
        this.estadoDeVoo = estadoDeVoo;
    }

    public void preencher() {
        System.out.println("informe o numero de voo: ");
        this.numDoVoo = leitor.next();
        System.out.println("informe o destino de voo: ");
        this.destino = leitor.next();
        System.out.println("informe a capacidade maxima de passageiros: ");
        this.capacidadeMaxPassageiro = leitor.nextInt();
        System.out.println("informe o estado do voo: ");
        this.estadoDeVoo = leitor.next();
    }

    public void imprimir() {
        System.out.println(this);
    }

    public void copiar(Voo outro) {
        this.numDoVoo = outro.getNumDoVoo();
        this.destino = outro.getDestino();
        this.capacidadeMaxPassageiro = outro.getCapacidadeMaxPassageiro();
        this.estadoDeVoo = outro.getEstadoDeVoo();
    }

    public void alterarEstadoDeVoo(String estadoDeVoo) {
        this.setEstadoDeVoo(estadoDeVoo);
    }

    public boolean verificaCapacidadeMinima() {
        if (lista_passageiros.size() > 5) {
            System.out.println("esse voo nao tomou prejuizo");
            return true;
        } else {
            System.out.println("esse voo tomou prejuizo.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Voo{" + "numDoVoo=" + numDoVoo + ", destino=" + destino + ", capacidadeMaxPassageiro=" + capacidadeMaxPassageiro + ", lista_passageiros=" + lista_passageiros + ", lista_escalas=" + lista_escalas + ", estadoDeVoo=" + estadoDeVoo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.numDoVoo);
        hash = 67 * hash + Objects.hashCode(this.destino);
        hash = 67 * hash + this.capacidadeMaxPassageiro;
        hash = 67 * hash + Objects.hashCode(this.lista_passageiros);
        hash = 67 * hash + Objects.hashCode(this.lista_escalas);
        hash = 67 * hash + Objects.hashCode(this.estadoDeVoo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voo other = (Voo) obj;
        if (this.capacidadeMaxPassageiro != other.capacidadeMaxPassageiro) {
            return false;
        }
        if (!Objects.equals(this.numDoVoo, other.numDoVoo)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.estadoDeVoo, other.estadoDeVoo)) {
            return false;
        }
        if (!Objects.equals(this.lista_passageiros, other.lista_passageiros)) {
            return false;
        }
        return Objects.equals(this.lista_escalas, other.lista_escalas);
    }

    public void adicionarPassageiros(Passageiro passageiro) {
        this.lista_passageiros.add(passageiro);
    }

    public void removerPassageiros(Passageiro passageiro) {
        this.lista_passageiros.remove(passageiro);
    }

    public void adicionarEscalas(String escala) {
        this.lista_escalas.add(escala);
    }

    public void removerEscalas(String escala) {
        this.lista_escalas.remove(escala);
    }

    public String getNumDoVoo() {
        return this.numDoVoo;
    }

    public void setNumDoVoo(String numDoVoo) {
        this.numDoVoo = numDoVoo;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadeMaxPassageiro() {
        return this.capacidadeMaxPassageiro;
    }

    public void setCapacidadeMaxPassageiro(int capacidadeMaxPassageiro) {
        this.capacidadeMaxPassageiro = capacidadeMaxPassageiro;
    }

    public List<Passageiro> getLista_passageiros() {
        return this.lista_passageiros;
    }

    public void setLista_passageiros(List<Passageiro> lista_passageiros) {
        this.lista_passageiros = lista_passageiros;
    }

    public List<String> getLista_escalas() {
        return this.lista_escalas;
    }

    public void setLista_escalas(List<String> lista_escalas) {
        this.lista_escalas = lista_escalas;
    }

    public static Scanner getLeitor() {
        return leitor;
    }

    public static void setLeitor(Scanner leitor) {
        Voo.leitor = leitor;
    }

    public String getEstadoDeVoo() {
        return this.estadoDeVoo;
    }

    public void setEstadoDeVoo(String estadoDeVoo) {
        this.estadoDeVoo = estadoDeVoo;
    }

    public boolean temPrejuizo() {
        return lista_passageiros.size() <= 5;
    }
}
