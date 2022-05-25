public abstract class Shape {
    protected String color;

    public Shape() {
        this.color = "";
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
