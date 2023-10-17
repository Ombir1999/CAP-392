/*equals(),replace(),contain(),length(),chancatination()*/

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!";
        int length1 = str1.length();
        int length2 = str2.length();
        String combined = str1 + " " + str2;
        System.out.println("Length of str1: " + length1);
        System.out.println("Length of str2: " + length2);
        System.out.println("Combined: " + combined);
    }
}