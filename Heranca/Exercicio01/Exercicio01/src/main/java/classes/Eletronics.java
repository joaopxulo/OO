package classes;

import java.util.Objects;
import java.util.Scanner;

public class Eletronics extends Product {

    private String voltage;
    private int pwrHours;

    public Eletronics() {
        super();
        this.voltage = "";
        this.pwrHours = 0;

    }

    public Eletronics(String code, String name, Double cost, Double price, String voltage, int pwrHours) {
        super(code, name, cost, price);
        this.voltage = voltage;
        this.pwrHours = pwrHours;
    }

    public void fill() {
        super.fill();

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a voltagem:");
        this.voltage = input.nextLine();
        System.out.print("Informe quantas horas em media dura a bateria do produto : ");
        this.pwrHours = input.nextInt();
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public int getPwrHours() {
        return pwrHours;
    }

    public void setPwrHours(int pwrHours) {
        this.pwrHours = pwrHours;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.voltage);
        hash = 61 * hash + this.pwrHours;
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
        final Eletronics other = (Eletronics) obj;
        if (this.pwrHours != other.pwrHours) {
            return false;
        }
        return Objects.equals(this.voltage, other.voltage);
    }

    @Override
    public String toString() {
        return "Eletronics{" + "voltage=" + voltage + ", pwrHours=" + pwrHours + '}';
    }

    public void print() {
        System.out.print(this);
    }
}
