package oops;

public class Employee {
    int empId;
    String empName;
    double salary;

    public void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
        System.out.println("------------------------------");
    }

    @Override
    public String toString() {
        return "Employee [ID = " + empId + ", Name = " + empName + ", Salary = " + salary + "]";
    }
}
