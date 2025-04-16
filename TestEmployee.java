abstract class Employee {
    protected String name;
    protected String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    private double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    void calculateSalary() {
        System.out.println(name + "'s Salary: INR " + fixedSalary);
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: INR " + fixedSalary);
    }
}

class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println(name + "'s Salary: INR " + salary);
    }

    void displayDetails() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: INR " + salary);
    }
}

// Optional testing class
public class TestEmployee {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 80000);
        Developer d1 = new Developer("Bob", 500, 160);

        m1.displayDetails();
        m1.calculateSalary();

        d1.displayDetails();
        d1.calculateSalary();
    }
}
