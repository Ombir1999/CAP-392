public class OuterClass1 {
    private int x = 10;
    private static int y = 20;

    class InnerClass {
        public void m1() {
            System.out.println("Instance variable..." + x + ", static variable.." + y);
        }
    }

    public static void main(String[] args) {
        OuterClass1 o = new OuterClass1();
        OuterClass1.InnerClass in = o.new InnerClass();
        in.m1();
    }
}// search about the nested class n