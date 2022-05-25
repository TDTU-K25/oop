public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Perimeter = " + c.getPerimeter());
        System.out.println("Area = " + c.getArea());

        ResizableCircle rc = new ResizableCircle();
        rc.resize(200);
        System.out.println("Perimeter = " + rc.getPerimeter());
        System.out.println("Area = " + rc.getArea());
    }
}
