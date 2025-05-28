Employee.java
public class Employee {
    // Attributes
    int empID;
    String empName;
    String empDesignation;

    // Constructor to initialize attributes
    public Employee(int id, String name, String designation) {
        this.empID = id;
        this.empName = name;
        this.empDesignation = designation;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + empDesignation);
        System.out.println("---------------------------");
    }

    // Main method to create and display employee objects
    public static void main(String[] args) {
        // Create three employee objects
        Employee emp1 = new Employee(101, "Alice Johnson", "Software Engineer");
        Employee emp2 = new Employee(102, "Bob Smith", "Project Manager");
        Employee emp3 = new Employee(103, "Charlie Brown", "QA Analyst");

        // Display details of each employee
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
