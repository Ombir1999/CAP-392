public class OuterClass {
    private int outerVar = 10;

    // Inner class
    public class InnerClass {
        private int innerVar = 20;

        public void display() {
            System.out.println("Outer variable: " + outerVar);
            System.out.println("Inner variable: " + innerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}