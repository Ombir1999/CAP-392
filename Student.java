public class Student {
    private String name;
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;

    public Student(String name, double subject1Marks, double subject2Marks, double subject3Marks) {
        this.name = name;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public double calculateAverage() {
        return (subject1Marks + subject2Marks + subject3Marks) / 3;
    }

    public String getName() {
        return name;
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 85.5, 90.0, 78.5);
        student.displayResult();
    }
}
