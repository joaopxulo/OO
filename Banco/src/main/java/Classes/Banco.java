package Classes;

import java.util.List;
import java.util.ArrayList;
import Classes.Conta;
import Classes.Transacao;
import java.util.Objects;
import java.util.Scanner;

public class Banco {
private String nomeDoBanco;
private List<Conta> lista_contas;
private List<Transacao> lista_transacoes;
private static Scanner leitor = new Scanner(System.in);


public Banco(){
    this.nomeDoBanco = " ";
    this.lista_contas = new ArrayList<>();
    this.lista_transacoes = new ArrayList<>();
}

    public Banco(String nomeDoBanco, List<Conta> lista_contas, List<Transacao> lista_transacoes) {
        this.nomeDoBanco = nomeDoBanco;
        this.lista_contas = lista_contas;
        this.lista_transacoes = lista_transacoes;
    }
    
    public void preencher(){
        System.out.println("informe o nome do banco: ");
        this.nomeDoBanco = leitor.next();
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void adicionarContas(Conta lista_contas){
        this.lista_contas.add(lista_contas);
    }
    
    public void removeContas(Conta contas){
        this.lista_contas.remove(contas);
    }
    
    public void adicionarTransacao(Transacao lista_transacoes){
    this.lista_transacoes.add(lista_transacoes);
    }
    
    public void removeTransacao(Transacao transacao){
        this.lista_transacoes.remove(transacao);
    }
    
    public void listarContasBanco(){
        System.out.println("as contas no banco " + nomeDoBanco + ":");
        for(Conta conta: lista_contas){
            System.out.println(conta);   
        }
    
    }
    
    public void listarTransacoes(){
        System.out.println("Transações no banco " + nomeDoBanco + ":");
        for(Transacao transacao : lista_transacoes){
            System.out.println(transacao);
        }
    }
    
    public void contaComMaiorSaldo(Conta contas){
    double maiorSaldoDaConta = 0.0;
    for(Conta c: lista_contas){
        if(c.getSaldoDaConta() > maiorSaldoDaConta){
            maiorSaldoDaConta = c.getSaldoDaConta();
        }
    }
        System.out.println("a conta com maior saldo e: " + maiorSaldoDaConta);
    }
    
    public void contaComMenorSaldo(Conta contas){
    double menorSaldoDaConta = 0.0;
    for(Conta c: lista_contas){
        if(c.getSaldoDaConta() < menorSaldoDaConta){
            menorSaldoDaConta = c.getSaldoDaConta();
        }
    }
        System.out.println("a conta com menor saldo e: " + menorSaldoDaConta);
    }
    
    

    public void quantidadeDeClientesQueDevemAoBanco(Conta contas){
    double quantidadeDeClientesDevedores = 0.0;
    quantidadeDeClientesDevedores++;
    for(Conta c: lista_contas){
        if(c.getSaldoDaConta() < 0){
            quantidadeDeClientesDevedores = c.getSaldoDaConta();
            System.out.println("a quantidade de devedores é: " + quantidadeDeClientesDevedores);
        }else{
            System.out.println("nao existe nenhum devedor no banco.");
        }
    }
    }
    
    public void somatorioDoSaldoNegativoDosClientes(Conta contas){
    double quantidadeDeSaldosNegativos = 0.0;
    for(Conta c: lista_contas){
        if(c.getSaldoDaConta() < 0){
            quantidadeDeSaldosNegativos += c.getSaldoDaConta();
        }
    }
        System.out.println("soma dos salarios de saldos negativos: " + quantidadeDeSaldosNegativos);
    }
    
    public void quantidadeDeClientesQueNaoDevemAoBanco(Conta contas){
    double quantidadeDeClienteCredores = 0.0;
    quantidadeDeClienteCredores++;
    for(Conta c: lista_contas){
        if(c.getSaldoDaConta() > 0){
            quantidadeDeClienteCredores = c.getSaldoDaConta();
            System.out.println("a quantidade de credores é: " + quantidadeDeClienteCredores);
        }else{
            System.out.println("nao existe nenhum credor no banco.");
        }
    }
    }
    
     public void somatorioDoSaldosPositivoDosClientes(Conta contas){
    double quantidadeDeSaldosPositivos = 0.0;
    for(Conta c: lista_contas){
        if(c.getSaldoDaConta() > 0){
            quantidadeDeSaldosPositivos += c.getSaldoDaConta();
        }
    }
        System.out.println("soma dos salarios de saldos positivos: " + quantidadeDeSaldosPositivos);
    }
    
    @Override
    public String toString() {
        return "Banco{" + "nomeDoBanco=" + nomeDoBanco + ", lista_contas=" + lista_contas + ", lista_transacoes=" + lista_transacoes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nomeDoBanco);
        hash = 97 * hash + Objects.hashCode(this.lista_contas);
        hash = 97 * hash + Objects.hashCode(this.lista_transacoes);
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
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.nomeDoBanco, other.nomeDoBanco)) {
            return false;
        }
        if (!Objects.equals(this.lista_contas, other.lista_contas)) {
            return false;
        }
        return Objects.equals(this.lista_transacoes, other.lista_transacoes);
    }

    public String getNomeDoBanco() {
        return this.nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public List<Conta> getLista_contas() {
        return this.lista_contas;
    }

    public void setLista_contas(List<Conta> lista_contas) {
        this.lista_contas = lista_contas;
    }

    public List<Transacao> getLista_transacoes() {
        return this.lista_transacoes;
    }

    public void setLista_transacoes(List<Transacao> lista_transacoes) {
        this.lista_transacoes = lista_transacoes;
    }

}
