package classes;

import java.util.Scanner;

public class Director extends Employee {
    
    private int communication;
    private int leadership;
    
    public Director () {
        super ();
        this.communication = 0;
        this.leadership = 0;
    }
    
    public Director ( String name, int age, String cpf, double wage, int communication, int leadership ) {
        super ( name, age, cpf, wage );
        this.communication = communication;
        this.leadership = leadership;
    }
    
    public void fill () {
        System.out.print ("De 0 a 10, qual a nota voce daria para comunicacao do diretor ? ");
        this.communication = input.nextInt();
        System.out.print ("De 0 a 10 qual a nota voce daria para a lideranca do diretor ? ");
        this.leadership = input.nextInt();
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.communication;
        hash = 19 * hash + this.leadership;
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
        final Director other = (Director) obj;
        if (this.communication != other.communication) {
            return false;
        }
        return this.leadership == other.leadership;
    }

    @Override
    public String toString() {
        return "Director{" + "communication=" + communication + ", leadership=" + leadership + '}';
    }
    
    public void print () {
        System.out.print(this);
    }
}
