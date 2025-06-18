package exs1;

public class Rectangle {
    // Attributes
    // private for encapsulation.
    // only methods in this class have access.
    private double width;
    private double height;

    // Constructor
    // this special method is called when we create a new Rectangle obj.
    // same name as the class and no return.
    // receive height and width.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // methods
    public double calcArea() {
        return height * width;
    }

    public double calcPerimeter() {
        return 2 * (height + width);
    }

    // to get/read the private height and width (getters)
    public double getHeight() {
        return height;
    }

    // to set/edit public the height and width (setters)
    // void because they return nothing
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
