public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);

        Shape s = shapes[0];
        for (Shape element : shapes) {
            if (element.getArea() > s.getArea()) {
                s = element;
            }
        }
        System.out.println(s);
    }
}
