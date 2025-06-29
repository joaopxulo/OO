package classes;

import java.util.Scanner;

public class Secretary extends Employee {
    
    private int organization;
    private int proactiveness;
    
    public Secretary () {
        super ();
        this.organization = 0;
        this.proactiveness = 0;
    }
    
    public Secretary ( String name, int age, String cpf, double wage, int organization, int proactiveness ) {
        super( name,age,cpf,wage );
        this.organization = organization;
        this.proactiveness = proactiveness;
    }
    
    public void fill () {
        System.out.print (" De 0 a 10 qual nota voce da para a organizacao do secretario ?");
        this.organization = input.nextInt();
        System.out.print (" De 0 a 10 qual nota voce da para a proatividade do secretario ? ");
        this.proactiveness = input.nextInt();
    }

    public int getOrganization() {
        return organization;
    }

    public void setOrganization(int organization) {
        this.organization = organization;
    }

    public int getProactiveness() {
        return proactiveness;
    }

    public void setProactiveness(int proactiveness) {
        this.proactiveness = proactiveness;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.organization;
        hash = 83 * hash + this.proactiveness;
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
        final Secretary other = (Secretary) obj;
        if (this.organization != other.organization) {
            return false;
        }
        return this.proactiveness == other.proactiveness;
    }

    @Override
    public String toString() {
        return "Secretary{" + "organization=" + organization + ", proactiveness=" + proactiveness + '}';
    }
    
    public void print () {
        System.out.print (this);
    }
}
