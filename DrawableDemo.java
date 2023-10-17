interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    class Circle implements Drawable {
        public void draw() {
            System.out.println("Drawing circle");
        }
    }
}

public class DrawableDemo {
    public static void main(String args[]) {

        Drawable circle = new Rectangle().new Circle();
        circle.draw();
        
        Drawable rectangle = new Rectangle();
        rectangle.draw();
    }
}
