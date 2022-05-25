public class Circle {
    // Attributes
    protected double radius;
    protected String color;

    // Constructors
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    } 

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    } 

    // Getters
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    } 
    
    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + ", color=" + this.color + "]";
    }
}
