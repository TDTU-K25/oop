public class Test {
    public static void main(String[] args) {
        Shape s = new Shape("Blue", false);
        System.out.println(s);

        Circle c = new Circle(3, "orange", false);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle(2, 5, "purple", true);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        Square sq = new Square(5, "pink", false);
        System.out.println(sq.getSide());

        sq.setWidth(3);
        System.out.println(sq.getWidth());
        System.out.println(sq.getLength());

        sq.setLength(9);
        System.out.println(sq.getWidth());
        System.out.println(sq.getLength());
    }
}
