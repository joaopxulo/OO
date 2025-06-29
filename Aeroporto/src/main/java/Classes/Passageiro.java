package Classes;

import java.util.Objects;
import java.util.Scanner;

public class Passageiro {

    private String nome;
    private String CPF;
    private SistemaDePontosFidelidade sistemaFidelidade;
    private static Scanner leitor = new Scanner(System.in);

    public Passageiro() {
        this.nome = " ";
        this.CPF = " ";
        this.sistemaFidelidade = new SistemaDePontosFidelidade();
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
        this.sistemaFidelidade = new SistemaDePontosFidelidade();
    }

    @Override
    public String toString() {
        return " Passageiro{"
                + " Nome: " + nome + " "
                + " CPF: " + CPF + " "
                + "}";

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.CPF);
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
        final Passageiro other = (Passageiro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.CPF, other.CPF);
    }

    public void copy(Passageiro outro) {
        this.nome = outro.getNome();
        this.CPF = outro.getCPF();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public SistemaDePontosFidelidade getSistemaFidelidade() {
        return this.sistemaFidelidade;
    }

    public void setSistemaFidelidade(SistemaDePontosFidelidade sistemaFidelidade) {
        this.sistemaFidelidade = sistemaFidelidade;
    }
}
