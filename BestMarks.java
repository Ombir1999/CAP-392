import java.util.Arrays;
import java.util.Scanner;

public class BestMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] marks = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        int[] bestThreeMarks = findBestN(marks, 3);
        System.out.println("Best 3 marks: " + Arrays.toString(bestThreeMarks));
        int[] bestTwoMarks = findBestN(bestThreeMarks, 2);
        System.out.println("Best 2 marks from best 3: " + Arrays.toString(bestTwoMarks));
    }

    public static int[] findBestN(int[] marks, int n) {
        Arrays.sort(marks);
        int[] bestN = new int[n];

        for (int i = 0; i < n; i++) {
            bestN[i] = marks[marks.length - 1 - i];
        }

        return bestN;
    }
}
