import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Number: ");
        int customerNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Enter Number of Units Consumed: ");
        int units = scanner.nextInt();

        double totalBill = calculateBill(units);

        System.out.println("\nElectricity Bill");
        System.out.println("Customer Number: " + customerNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: " + totalBill);
        System.out.println("Dua Date of This Bill is 24/08/2023");

        scanner.close();
    }

    public static double calculateBill(int units) {
        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1.20;
        } else if (units <= 200) {
            billAmount = 100 * 1.20+ (units - 100) * 2;
        } else if (units <= 300) {
            billAmount = 100 * 1.20 + 100 * 3 + (units - 200) * 2;
        } else {
            billAmount = 100 * 1.20 + 100 * 2 + 100 * 2 + (units - 300) * 3;
        }

        return billAmount;
    }
}
