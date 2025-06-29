package classes;

import java.util.Objects;
import java.util.Scanner;

public class Perishable extends Product {
    
    private double weight;
    private String validity;
    
    public Perishable() {
        super();
        this.weight = 0.0;
        this.validity = "";
    }
    
    public Perishable(String code, String name, Double cost, Double price, Double weight, String validity) {
        super(code, name, cost, price);
        this.weight = weight;
        this.validity = validity;
    }
    
    public void fill() {
        super.fill();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o peso do produto :");
        this.weight = input.nextDouble();
        System.out.print(" Informe a validade do produto :");
        this.validity = input.nextLine();
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getValidity() {
        return validity;
    }
    
    public void setValidity(String validity) {
        this.validity = validity;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.validity);
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
        final Perishable other = (Perishable) obj;
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        return Objects.equals(this.validity, other.validity);
    }
    
    @Override
    public String toString() {
        return "Perishable{" + "weight=" + weight + ", validity=" + validity + '}';
    }
    
    public void print() {
        System.out.print(this);
    }
}
