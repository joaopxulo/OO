package SysManager;

import classes.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class EmployeeManager extends Employee {

    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void add(Employee e) {
        this.employees.add(e);
    }

    public Employee search(String cpf) {
        if (employees != null) {
            for (Employee e : employees) {
                if (super.cpf.equalsIgnoreCase(cpf)) {
                    return e;
                }
            }
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.employees);
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
        final EmployeeManager other = (EmployeeManager) obj;
        return Objects.equals(this.employees, other.employees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(employees);
        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(this);
    }

}

