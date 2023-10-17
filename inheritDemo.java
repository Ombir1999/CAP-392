class Base {
    int num1;

    void baseShow() {
        System.out.println("num1 = " + num1);
    }
}

class Derived extends Base {
    int num2;

    void product() {
        System.out.println("Product = " + (num1 * num2));
    }

    void driveShow() {
        System.out.println("num2 = " + num2);
    }
}

public class inheritDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.num1 = 5;
        d.num2 = 10;

        d.baseShow();
        d.product();
        d.driveShow();
    }
}
