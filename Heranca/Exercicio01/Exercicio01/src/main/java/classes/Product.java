package classes;

import java.util.Objects;
import java.util.Scanner;

public class Product {

    protected String code;
    protected String name;
    protected double cost;
    protected double price;

    public Product ( String code, String name, Double cost, Double price ) {
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.price = price;
    }
    
    public Product() {
        this.code = "";
        this.name = "";
        this.cost = 0.0;
        this.price = 0.0;
    }

    protected void fill() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o codigo do produto: ");
        this.code = input.nextLine();

        System.out.print("Informe o nome do produto: ");
        this.name = input.nextLine();

        System.out.print("Informe o custo total do produto: ");
        this.cost = input.nextDouble();

        System.out.print("Informe o preco de venda do produto: ");
        this.price = input.nextDouble();

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.code);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name=" + name + ", cost=" + cost + ", price=" + price + '}';
    }
       
    public void print (){
        System.out.print(this);
    }
}
