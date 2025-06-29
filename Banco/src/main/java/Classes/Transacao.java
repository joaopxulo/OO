
package Classes;

import java.util.Objects;
import java.util.Scanner;


public class Transacao {
private int id;
private String tipo;
private double valor;
private String data;
private String contaOrigem;
private String contaDestino;
private static Scanner leitor = new Scanner(System.in);

    public Transacao() {
        this.id = 0;
        this.contaDestino = " ";
        this.contaOrigem = " ";
        this.tipo = " ";
        this.data = " ";
        this.valor = 0.0;
    }

    public Transacao(int id, String tipo, double valor, String data, String contaOrigem, String contaDestino) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void preencher(){
        System.out.println("informe o id da conta: ");
        this.id = leitor.nextInt();
        System.out.println("informe o valor de transacao: ");
        this.valor = leitor.nextDouble();
        System.out.println("informe o tipo de transacao: ");
        this.tipo = leitor.next();
        System.out.println("informe a data da transacao: ");
        this.data = leitor.next();
        System.out.println("informe a conta de origem:");
        this.contaOrigem = leitor.next();
        System.out.println("informe a conta de destino: ");
        this.contaDestino = leitor.next();
    }
    
    public void imprimir(){
        System.out.println(this);    
    }
    
    
    
    @Override
    public String toString() {
        return "Transacao{" + "id=" + id + ", tipo=" + tipo + ", valor=" + valor + ", data=" + data + ", contaOrigem=" + contaOrigem + ", contaDestino=" + contaDestino + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.tipo);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.data);
        hash = 41 * hash + Objects.hashCode(this.contaOrigem);
        hash = 41 * hash + Objects.hashCode(this.contaDestino);
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
        final Transacao other = (Transacao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.contaOrigem, other.contaOrigem)) {
            return false;
        }
        return Objects.equals(this.contaDestino, other.contaDestino);
    }
    
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContaOrigem() {
        return this.contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return this.contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }
    
    


}
