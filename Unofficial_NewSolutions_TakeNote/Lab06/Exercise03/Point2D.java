public class Point2D {
    // Attributes
    protected float x;
    protected float y;

    // Constructors 
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }
    
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {this.x, this.y};
    }
    
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override 
    public String toString() {
        return String.format("Point2D[x=%f, y=%f]", this.x, this.y);
    }
}
