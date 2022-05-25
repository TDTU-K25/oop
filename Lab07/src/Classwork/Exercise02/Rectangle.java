public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override 
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public boolean equals(Shape s) {
        if (s instanceof Rectangle) {
            Rectangle temp = (Rectangle) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }

    @Override 
    public String toString() {
        return String.format("Rectangle[color = %s, filled = %b, width = %f, length = %f]", this.color, this.filled, this.width, this.length);
    }
}
