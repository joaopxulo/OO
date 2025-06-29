package classes;

import java.util.Objects;
import java.util.Scanner;

public class Employee extends People {

    protected Scanner input = new Scanner(System.in);
    private double wage;

    public Employee() {
        super();
        this.wage = 0000;
    }

    public Employee(String name, int age, String cpf, double wage) {
        super(name, age, cpf);
        this.wage = wage;
    }

    public void fill() {
        super.fill();
        System.out.print(" Informe o salario do funcionario : ");
        this.wage = input.nextDouble();
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.input);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.wage) ^ (Double.doubleToLongBits(this.wage) >>> 32));
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
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.wage) != Double.doubleToLongBits(other.wage)) {
            return false;
        }
        return Objects.equals(this.input, other.input);
    }

    @Override
    public String toString() {
        return "Employee{" + "input=" + input + ", wage=" + wage + '}';
    }

    public void print() {
        System.out.print(this);
    }
}
