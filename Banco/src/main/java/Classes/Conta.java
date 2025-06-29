package Classes;

import java.util.Objects;
import java.util.Scanner;

public class Conta {

    private String numeroDaConta;
    private String titularDaConta;
    private double saldoDaConta;
    private static Scanner leitor = new Scanner(System.in);

    public Conta() {
        this.numeroDaConta = " ";
        this.saldoDaConta = 0.0;
        this.titularDaConta = " ";
    }

    public void copia(Conta outro) {
        this.numeroDaConta = outro.getNumeroDaConta();
        this.saldoDaConta = outro.getSaldoDaConta();
        this.titularDaConta = outro.getTitularDaConta();
    }

    public void preencher() {
        System.out.println("informe o numero da sua conta: ");
        this.numeroDaConta = leitor.nextLine();
        System.out.println("informe o titular dessa conta: ");
        this.titularDaConta = leitor.nextLine();
        System.out.println("informe o saldo da conta: ");
        this.saldoDaConta = leitor.nextDouble();
    }

    public void imprimir() {
        System.out.println(this);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoDaConta += valor;
            System.out.println("valor depositado: " + valor + "reais, valor adicionado com sucesso" + this.titularDaConta);
        } else {
            System.out.println("valor invalido.");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldoDaConta){
            this.saldoDaConta -= valor;
            System.out.println("valor sacado: " + valor + "realizado com sucesso" + this.titularDaConta);
        }else{
            System.out.println("nao e possivel realizar o saque, saldo insuficiente.");
        }
    }

    public void atualizarSaldo(double valor) {
        this.saldoDaConta = valor;
        System.out.println("saldo atualizado para: " + valor);
    }

    public void tramferir(Conta Destino, double valor){
    if(valor > 0 && valor <= this.saldoDaConta){
        this.saldoDaConta -= valor;     
        Destino.saldoDaConta += valor;
        System.out.println("tranferencia de: " + valor + "reais." + "realizada com sucesso de: " + this.titularDaConta + "para: " + Destino.titularDaConta + ".");
    }else{
        System.out.println("erro na tranferencia. Valor invalido ou saldo insuficiente.");
    }
    }
     
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.numeroDaConta);
        hash = 89 * hash + Objects.hashCode(this.titularDaConta);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.saldoDaConta) ^ (Double.doubleToLongBits(this.saldoDaConta) >>> 32));
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
        final Conta other = (Conta) obj;
        if (Double.doubleToLongBits(this.saldoDaConta) != Double.doubleToLongBits(other.saldoDaConta)) {
            return false;
        }
        if (!Objects.equals(this.numeroDaConta, other.numeroDaConta)) {
            return false;
        }
        return Objects.equals(this.titularDaConta, other.titularDaConta);
    }

    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitularDaConta() {
        return this.titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldoDaConta() {
        return this.saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

}
