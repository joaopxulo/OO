package classes;

import java.util.Objects;
import java.util.Scanner;

public class People {
    protected String name;
    protected int age;
    protected String cpf;

    public People() {
        this.name = "";
        this.age = 0;
        this.cpf = "";
    }

    public People (String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public void fill() {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o seu nome:");
        this.name = input.next();
        System.out.print("Informe a sua idade:");
        this.age = input.nextInt();
        System.out.print("Informe o seu cpf:");
        this.cpf =input.next();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.age;
        hash = 29 * hash + Objects.hashCode(this.cpf);
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
        final People other = (People) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", cpf=" + cpf + '}';
    }

    public void print () {
        System.out.print (this);
    }
}
