public class Cylinder extends Circle {
    // Attribute
    private double height;

    // Constructors
    public Cylinder() {
        super();    
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return this.height;
    }

    // Setter
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + this.radius + ", height=" + this.height + ", color=" + this.color + "]";
    }
}