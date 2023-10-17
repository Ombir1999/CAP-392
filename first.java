class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    Rectangle(int x) {
        length = x;
        breadth = x;     }

    void setData(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String args[]) {
        Rectangle firstRect = new Rectangle(5, 6);
        int result1 = firstRect.area();
        System.out.println("Area of firstRect=" + result1);

        Rectangle secondRect = new Rectangle(6);
        int result2 = secondRect.area();
        System.out.println("Area of secondRect=" + result2);
    }
}
