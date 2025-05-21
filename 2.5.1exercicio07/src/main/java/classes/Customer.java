package classes;

import java.util.Objects;
import java.util.Scanner;

public class Customer {
  
    private String name = " ";

    public Customer(String name){
        this.name = name;
    }

    public Customer() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void fill(Scanner inputScanner) {
        System.out.print("Enter customer name: ");
        name = inputScanner.nextLine();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Customer other = (Customer) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + '}';
    }  
}
