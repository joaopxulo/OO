package classes;

import SysManager.EmployeeManager;
import java.util.List;
import java.util.Scanner;

public class Manager extends Employee {
    
    private EmployeeManager manager;
    private int strategic;
    private int decision;
    
    public Manager () {
        super ();
        this.strategic = 0;
        this.decision = 0;
    }
    public Manager(List<Employee> employees) {
        super();
        this.manager = new EmployeeManager();
        this.manager.setEmployees(employees);
    }
    public Manager ( String name, int age, String cpf, double wage, int strategic, int decision ) {
        super ( name,age,cpf,wage );
        this.strategic = strategic;
        this.decision = decision;
    }
    
    public void fill () {
        System.out.print(" De 0 a 10 qual a nota voce da para a visao estrategica do gerente ?");
        this.strategic = input.nextInt();
        System.out.print(" De 0 a 10 qual a nota voce da para a tomada de decisao do gerente ?");
        this.decision = input.nextInt();
    }

    public int getStrategic() {
        return strategic;
    }

    public void setStrategic(int strategic) {
        this.strategic = strategic;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.strategic;
        hash = 59 * hash + this.decision;
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
        final Manager other = (Manager) obj;
        if (this.strategic != other.strategic) {
            return false;
        }
        return this.decision == other.decision;
    }

    @Override
    public String toString() {
        return "Manager{" + "strategic=" + strategic + ", decision=" + decision + '}';
    }
    
    public void print () {
        System.out.print(this);
    }
}
