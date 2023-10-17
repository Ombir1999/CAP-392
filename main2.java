// Base class
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass 1
class Worker extends Employee {
    private String specialization;

    public Worker(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Subclass 2
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Subclass 3
class Clerk extends Employee {
    private String office;

    public Clerk(String name, double salary, String office) {
        super(name, salary);
        this.office = office;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Office: " + office);
    }
}

public class main2 {
    public static void main(String[] args) {
        // Create instances of base class and subclasses
        Worker worker = new Worker("John Doe", 50000, "Programming");
        Manager manager = new Manager("Jane Smith", 60000, "IT");
        Clerk clerk = new Clerk("Bob Johnson", 40000, "Front Desk");

        // Display details
        System.out.println("Worker Details:");
        worker.displayDetails();

        System.out.println("\nManager Details:");
        manager.displayDetails();

        System.out.println("\nClerk Details:");
        clerk.displayDetails();
    }
}