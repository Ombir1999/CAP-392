import java.util.*;
import shapesdemo.*;

class ReverseSumDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Enter your choice: ");
        System.out.println("1. Reverse of the number");
        System.out.println("2. Sum of the digits");
        int choice = sc.nextInt();

        if (choice == 1) {
            int[] reversedArray = reverseNumber(num);
            System.out.print("Reversed number: ");
            for (int digit : reversedArray) {
                System.out.print(digit);
            }
            System.out.println();
        } else if (choice == 2) {
            int sum = sumOfDigits(num);
            System.out.println("Sum of the digits: " + sum);
        } else {
            System.out.println("Invalid Input!!");
        }
    }

    public static int[] reverseNumber(int num) {
        int[] digits = new int[String.valueOf(num).length()];
        int index = 0;

        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        return digits;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}