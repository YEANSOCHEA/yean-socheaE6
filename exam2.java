class Rectangle {
    // Data members
    protected double length;
    protected double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Methods
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    // Constructor
    public Square(double side) {
        // Call the superclass (Rectangle) constructor with the same side for length and width
        super(side, side);
    }
}