public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    public class Bonus {
        private double bonusPercentage;

        public Bonus(double bonusPercentage) {
            this.bonusPercentage = bonusPercentage;
        }

        public void calculateBonus() {
            double bonusAmount = salary * (bonusPercentage / 100);
            System.out.println("Bonus: " + bonusAmount);
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ombir", 50000);
        employee.displayEmployee();
        Employee.Bonus bonus = employee.new Bonus(10);
        bonus.calculateBonus();
    }
}