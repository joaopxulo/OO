package com.mycompany.exercicio02;

import classes.Student;
import classes.Telephone;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(" --- Enter data for Student " + (i + 1) + " --- ");
            Student s = new Student();
            s.fill();

            System.out.println("Enter data for Phone 1:");
            Telephone p1 = new Telephone();
            p1.fill();
            s.addTelephone(p1);

            System.out.println("Enter data for Phone 2:");
            Telephone p2 = new Telephone();
            p2.fill();
            s.addTelephone(p2);

            students.add(s);
        }

        checkSameDDD(students);
        checkSameCarrier(students);
    }

    public static void checkSameDDD(List<Student> students) {
        System.out.println(" === Students with the same DDD === ");
        for (int i = 0; i < students.size(); i++) {
            Student s1 = students.get(i);
            for (int j = i + 1; j < students.size(); j++) {
                Student s2 = students.get(j);
                for (Telephone p1 : s1.getTelephones()) {
                    for (Telephone p2 : s2.getTelephones()) {
                        if (p1.getDDD().equals(p2.getDDD())) {
                            System.out.println(s1.getName() + " and " + s2.getName() + " have phones with DDD " + p1.getDDD());
                        }
                    }
                }
            }
        }
    }

    public static void checkSameCarrier(List<Student> students) {
        System.out.println("\n=== Students with the same Carrier ===");
        for (int i = 0; i < students.size(); i++) {
            Student s1 = students.get(i);
            for (int j = i + 1; j < students.size(); j++) {
                Student s2 = students.get(j);
                for (Telephone p1 : s1.getTelephones()) {
                    for (Telephone p2 : s2.getTelephones()) {
                        if (p1.getCarrier().equalsIgnoreCase(p2.getCarrier())) {
                            System.out.println(s1.getName() + " and " + s2.getName() + " use the same carrier: " + p1.getCarrier());
                        }
                    }
                }
            }
        }
    }
}
