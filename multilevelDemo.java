class Base
 {
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

class MultilevelDerived extends Derived {
    int num3;

    void sum() {
        System.out.println("Sum = " + (num1 + num2 + num3));
    }
}

public class multilevelDemo {
    public static void main(String[] args) {
        MultilevelDerived md = new MultilevelDerived();
        md.num1 = 5;
        md.num2 = 10;
        md.num3 = 15;

        md.baseShow();
        md.product();
        md.driveShow();
        md.sum();
    }
}
