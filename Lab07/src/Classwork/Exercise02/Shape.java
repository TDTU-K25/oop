public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean equals(Shape s);

    @Override
    public String toString() {
        return String.format("Shape[color = %s, filled = %b]", this.color, this.filled);
    }
}
