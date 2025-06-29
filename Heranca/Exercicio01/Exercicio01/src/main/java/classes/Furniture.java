package classes;

import java.util.Objects;
import java.util.Scanner;

public class Furniture extends Product {

    private String color;
    private String material;

    public Furniture() {
        super();
        this.color = "";
        this.material = "";
    }

    public Furniture(String code, String name, Double cost, Double price, String color, String material) {
        super(code, name, cost, price);
        this.color = color;
        this.material = material;
    }

    public void fill() {
        super.fill();

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a cor do movel:");
        this.color = input.nextLine();
        System.out.print(" Informe o material do seu movel : ");
        this.material = input.nextLine();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.material);
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
        final Furniture other = (Furniture) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.material, other.material);
    }

    @Override
    public String toString() {
        return "Furniture{" + "color=" + color + ", material=" + material + '}';
    }

    public void print() {
        System.out.print(this);
    }

}
