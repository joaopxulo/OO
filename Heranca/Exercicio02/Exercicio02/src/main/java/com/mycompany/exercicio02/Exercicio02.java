package com.mycompany.exercicio02;

import classes.Director;
import classes.Employee;
import classes.Engineer;
import classes.Manager;
import classes.Secretary;
import SysManager.EmployeeManager;

public class Exercicio02 {

    public static void main(String[] args) {
       EmployeeManager managerE = new EmployeeManager();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Director director = new Director();
        Secretary secretary = new Secretary();
        
        employee1.fill();
        managerE.add(employee1);
        employee1.print();
        
        employee2.fill();
        managerE.add(employee2);
        employee2.print();
        
        Manager manager = new Manager(managerE.getEmployees());
        manager.fill();
        manager.print();
       
        director.fill();
        director.print();
        
        secretary.fill();
        secretary.print();
    }
}
