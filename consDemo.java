class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 5;
        breadth = 10;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    Rectangle(Rectangle obj) {
        System.out.println("Copy constructor invoked");
        length = obj.length;
        breadth = obj.breadth;
    }

    int area() {
        return length * breadth;
    }
}

class ConsDemo {
    public static void main(String args[]) {
        Rectangle firstRect = new Rectangle(5, 6);
        System.out.println("Area of firstRect: " + firstRect.area());

        Rectangle secondRect = new Rectangle();
        System.out.println("Area of secondRect (default values): " + secondRect.area());

        Rectangle thirdRect = new Rectangle(firstRect);
        System.out.println("Area of thirdRect (copied from firstRect): " + thirdRect.area());
    }
}
