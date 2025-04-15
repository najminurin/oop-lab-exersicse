public class Employee extends Person {
    private double salary;
    public Employee(String name, int age, double salary) {
        super(name, age); //superclass
        this.salary = salary;
    }

    // constructor (Task 4)
    public Employee(String name, int age) {
        super(name, age); // superclass
        System.out.println("Employee constructor with default salary called.");
        this.salary = 1500.00;
    }

    // Display method

    public void displayEmployeeInfo() {
        displayPersonInfo(); // superclass
        System.out.println("Salary: RM " + salary);
    }
}
