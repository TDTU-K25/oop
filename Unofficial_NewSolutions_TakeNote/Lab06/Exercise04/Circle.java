public class Circle extends Shape {
    // Attribute
    private double radius;

    // Constructors
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double width) {
        this.radius = width;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[color=%s, filled=%b, radius=%f]", this.color, this.filled, this.radius);
    }
}
