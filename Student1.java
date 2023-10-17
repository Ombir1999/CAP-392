import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
	do {
            System.out.println("Menu:");
            System.out.println("1. integer value = ");
            System.out.println("2. float value = ");
            System.out.println("3. double value = ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice = ");
			
			choice = scanner.nextInt();
			
			if (choice == 1) {
                System.out.println("Performing integer value = 5.0");
            }
			else if (choice == 2) 
			{
                System.out.println("Performing float value = 2.0");
            } 
			else if (choice == 3) 
			{
                System.out.println("Performing double value = 55");
            } 
			else if (choice == 4) 
			{
                System.out.println("Exiting the program.");
            } else 
			{
                System.out.println("Invalid choice. Please enter a valid option.");
            }
			 
			} while (choice != 4);

        scanner.close();
    }
}