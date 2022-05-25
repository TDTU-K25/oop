public class TestAbstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();

        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();
    }
}
