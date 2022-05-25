public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 4);

        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        r2.setWidth(6);
        r2.setLength(5);

        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

        System.out.println(r1);
        System.out.println(r2);
    }
}
