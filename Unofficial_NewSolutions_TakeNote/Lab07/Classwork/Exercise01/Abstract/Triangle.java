public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
        this.base = 0;
        this.height = 0;
    }

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public String toString() {
        return String.format("Triangle[color = %s, base = %f, height = %f]", this.color, this.base, this.height);
    }
}