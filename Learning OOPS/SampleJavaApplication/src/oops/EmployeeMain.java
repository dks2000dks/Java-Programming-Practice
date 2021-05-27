package oops;


public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("\n");

        // Employee e = new Employee();
        // e.empId = 101;
        // e.empName = "Steven";
        // e.salary = 100000;
        // e.display();

        // Employee_1 e1 = new Employee_1();        
        // e1.display();

        // // Manipulating Data
        // e1.setEmpId(10);
        // e1.setEmpName("Sachin");
        // e1.setSalary(10000);
        // e1.display();

        Employee_2 e21 = new Employee_2();
        e21.display();

        Employee_2 e22 = new Employee_2(10, "Messi");
        e22.display();

        Employee_2 e23 = new Employee_2(7,"Ronaldo", 5500000);
        System.out.println(e23);
        e23.display();
    }
}
