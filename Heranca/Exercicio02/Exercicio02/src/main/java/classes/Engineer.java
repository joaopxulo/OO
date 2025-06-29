package classes;

import java.util.Scanner;

public class Engineer extends Employee {
    
    private int technical;
    private int automation;
    
    public Engineer () {
        super ();
        this.technical = 0;
        this.automation = 0;
    }
    
    public Engineer ( String name, int age, String cpf, double wage, int technical, int automation ) {
        super ( name,age,cpf,wage );
        this.technical = technical;
        this.automation = automation;
    }
    
    public void fill () {
        System.out.print (" De 0 a 10 qual a nota voce da para o conhecimento tecnico do engenheiro ? ");
        this.technical = input.nextInt();
        System.out.print (" De 0 a 10 qual a nota voce da para o conhecimento de automacao do engenheiro ? ");
        this.automation = input.nextInt();
    }

    public int getTechnical() {
        return technical;
    }

    public void setTechnical(int technical) {
        this.technical = technical;
    }

    public int getAutomation() {
        return automation;
    }

    public void setAutomation(int automation) {
        this.automation = automation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.technical;
        hash = 89 * hash + this.automation;
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
        final Engineer other = (Engineer) obj;
        if (this.technical != other.technical) {
            return false;
        }
        return this.automation == other.automation;
    }

    @Override
    public String toString() {
        return "Engineer{" + "technical=" + technical + ", automation=" + automation + '}';
    }
    
    public void print () {
        System.out.print (this);
    }
}
