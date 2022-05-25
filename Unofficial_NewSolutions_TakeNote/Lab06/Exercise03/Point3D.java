public class Point3D extends Point2D {
    // Attribute
    private float z;

    // Constructors
    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {this.x, this.y, this.z};
    }
    
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("Point3D[x=%f, y=%f, z=%f]", this.x, this.y, this.z);
    }
}
