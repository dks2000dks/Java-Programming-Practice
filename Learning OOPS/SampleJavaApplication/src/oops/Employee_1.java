package oops;

public class Employee_1 {
    private int empId;
    private String empName;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
