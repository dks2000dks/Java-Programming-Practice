package oops;

public class Employee_2 {// With Constructors
    private int empId;
    private String empName;
    private double salary;

    // Performing Overloading

    public Employee_2() {
        System.out.println("Zero Argument Constructor");
        empId = -1;
        empName = "Dummy";
        salary = -1;
    }

    public Employee_2(int empId, String empName) {
        // Avoiding Showdowing
        System.out.println("Two Argument Constructor");
        this.empId = empId;
        this.empName = empName;
    }

    public Employee_2(int empId, String empName, double salary) {
        // Avoiding Showdowing
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

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
