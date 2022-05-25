public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(3.0f, 4.0f);

        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
    }
}
