import java.util.Scanner;
import shapesdemo.*;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int reversedNumber = reverseNumber(number);
        int sumOfDigits = sumOfDigits(number);
        int[] results = { reversedNumber, sumOfDigits };
        System.out.println("Reversed number: " + results[0]);
        System.out.println("Sum of digits: " + results[1]);
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static int ReverseAndSum(int num);

    int sum = 0;while(num!=0)
    {
        int digit = num % 10;
        sum += digit;
        num /= 10;
    }return sum;
}}
