package exs1;

public class Main {
    /*
      static: The 'static' keyword means the member (method or attribute)
      belongs to the CLASS, not to any individual OBJECT (instance).

      For a static METHOD:
      - It can be called using the class name: ClassName.methodName().
      - It cannot use non-static members of the class (like 'this' or instance attributes),
        because it doesn't operate on a specific object.

      For a static ATTRIBUTE:
      - There is only ONE copy of this variable shared among ALL objects of the class.
     */
    public static void main(String[] args) {
        // create 2 Rectangles obj
        Rectangle r1 = new Rectangle(4.0, 6.0);
        Rectangle r2 = new Rectangle(6.0, 2.0);

        // to print 2 rectangles
        printTwoRectangles(r1, r2);
    }

    // to print 1 Rectangle
    public static void printRectangle(Rectangle r) {
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.calcArea());
        System.out.println("Perimeter: " + r.calcPerimeter());
    }

    // to print 2 Rectangles and their sum
    public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
        System.out.println("--- Rectangle 1 ---");
        printRectangle(r1);
        System.out.println(); // empty ln for space

        System.out.println("--- Rectangle 2 ---");
        printRectangle(r2);
        System.out.println(); // empty ln for space

        double sumArea = r1.calcArea() + r2.calcArea();
        double sumPerimeter = r2.calcPerimeter() + r2.calcPerimeter();

        System.out.println("--- Total ---");
        System.out.println("Sum of Areas: " + sumArea);
        System.out.println("Sum of Perimeters: " + sumPerimeter);
    }
}