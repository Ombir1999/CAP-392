public class exp {
    public static void main(String args[]) {
        try {
            int a = 100 / 50;
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e);

        }
        System.out.println("rest of the code...");
    }
} 