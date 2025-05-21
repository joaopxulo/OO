package classes;

import java.util.Objects;
import java.util.Scanner;

public class Telephone {

    private String DDD = " ";
    private String number = " ";
    private String description = " ";
    private String carrier = " ";

    public Telephone() {
        this.DDD = " ";
        this.number = " ";
        this.description = " ";
        this.carrier = " ";
    }

    public Telephone(String DDD, String number, String description, String carrier) {
        this.DDD = DDD;
        this.number = number;
        this.description = description;
        this.carrier = carrier;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "Telephone {"
                + " DDD: " + DDD
                + ", Number: " + number
                + ", Description: " + description
                + ", Carrier: " + carrier
                + " }";
    }

    @Override
    public int hashCode() {
        return Objects.hash(DDD, number, description, carrier);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Telephone other = (Telephone) obj;
        return Objects.equals(this.DDD, other.DDD)
                && Objects.equals(this.number, other.number)
                && Objects.equals(this.description, other.description)
                && Objects.equals(this.carrier, other.carrier);
    }

    public void fill() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Please enter DDD: ");
        this.DDD = inputScanner.nextLine();

        System.out.print("Please enter number: ");
        this.number = inputScanner.nextLine();

        System.out.print("Please enter description: ");
        this.description = inputScanner.nextLine();

        System.out.print("Please enter carrier: ");
        this.carrier = inputScanner.nextLine();
    }

    public void copy(Telephone outro) {
        this.DDD = outro.getDDD();
        this.number = outro.getNumber();
        this.description = outro.getDescription();
        this.carrier = outro.getCarrier();
    }

    public void print() {
        System.out.println(this);
    }
}
