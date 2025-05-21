package classes;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String registration;
    private String email;
    private String course;
    private List<Telephone> telephones;

    public Student() {
        this.name = "";
        this.registration = "";
        this.email = "";
        this.course = "";
        this.telephones = new ArrayList<>();
    }

    public Student(String name, String registration, String email, String course) {
        this.name = name;
        this.registration = registration;
        this.email = email;
        this.course = course;
        this.telephones = new ArrayList<>();
    }

    public void addTelephone(Telephone t) {
        telephones.add(t);
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return " Student {"
                + " Name : " + name + " "
                + " Registration : " + registration + " "
                + " Email : " + email + " "
                + " Course : " + course + " "
                + " Telephone : " + telephones + " "
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registration, email, course, telephones);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return Objects.equals(name, other.name)
                && Objects.equals(registration, other.registration)
                && Objects.equals(email, other.email)
                && Objects.equals(course, other.course)
                && Objects.equals(telephones, other.telephones);
    }

    public void fill() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter name: ");
        this.name = input.nextLine();
        System.out.print("Please enter registration: ");
        this.registration = input.nextLine();
        System.out.print("Please enter email: ");
        this.email = input.nextLine();
        System.out.print("Please enter course: ");
        this.course = input.nextLine();
        System.out.println(this.toString());
        System.out.println("Telephones:");
        for (Telephone t : telephones) {
            t.fill();
        }
    }

    public void copy(Student other) {
        this.name = other.getName();
        this.registration = other.getRegistration();
        this.email = other.getEmail();
        this.course = other.getCourse();
        this.telephones = new ArrayList<>();
        for (Telephone t : other.getTelephones()) {
            Telephone copyTel = new Telephone();
            copyTel.copy(t);
            this.telephones.add(copyTel);
        }
    }

    public void print() {
        System.out.println(this.toString());
    }
}
