public class Rectangle {
    // Attributes
    private float width;
    private float length;

    // Constructor
    public Rectangle() {
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(float width, float length) {
        if (width > 0) {
            this.width = width;
        }

        if (length > 0) {
            this.length = length;
        }
    }

    // Getters
    public float getWidth() {
        return this.width;
    }

    public float getLength() {
        return this.length;
    }

    public float getArea() {
        return this.width * this.length;
    }

    public float getPerimeter() {
        return (this.width + this.length) * 2;
    }

    // Setters
    public void setWidth(float width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setLength(float length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public String toString() {
        return "Rectangle[" + this.width + ", " + this.length + "]"; 
    }
}
