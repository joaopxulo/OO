package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aeroport {

    private String nome;
    private String localizacao;
    private List<Voo> voos = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public Aeroport() {
        this.nome = "";
        this.localizacao = "";
        this.voos = new ArrayList<>();
    }

    public Aeroport(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = new ArrayList<>();
    }

    public void imprimir() {
        System.out.println(this);
    }

    public void copiar(Aeroport outro) {
        this.nome = outro.getNome();
        this.localizacao = outro.getLocalizacao();
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
        System.out.println("Voo adicionado com sucesso!");
    }

    public boolean removerVoo(Voo voo) {
        return voos.remove(voo);
    }

    public void listarVoos() {
        if (voos.isEmpty()) {
            System.out.println("Nenhum voo cadastrado.");
        } else {
            for (Voo v : voos) {
                System.out.println(v);
            }
        }
    }

    public List<Voo> calcularVoosComPrejuizo() {
        List<Voo> comPrejuizo = new ArrayList<>();
        for (Voo v : voos) {
            if (v.temPrejuizo()) {
                comPrejuizo.add(v);
            }
        }
        return comPrejuizo;
    }

    public void iniciarVoo(String numero) {
        for (Voo v : voos) {
            if (v.getNumDoVoo().equals(numero)) {
                v.setEstadoDeVoo("Em andamento");
                System.out.println("Voo " + numero + " iniciado com sucesso.");
                return;
            }
        }
        System.out.println("Voo não encontrado.");
    }

    @Override
    public String toString() {
        return "Aeroport{" + "nome=" + nome + ", localizacao=" + localizacao + ", lista_voos=" + voos + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
}
