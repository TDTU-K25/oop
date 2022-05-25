public class Point2D {
    // Attributes
    private float x;
    private float y;
    
    // Constructors
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    } 
    
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
}
