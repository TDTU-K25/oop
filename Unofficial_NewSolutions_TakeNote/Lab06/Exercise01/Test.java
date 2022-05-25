public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        Cylinder cy = new Cylinder(5.0, 10.0, "green");
        
        System.out.println(c.getRadius());
        System.out.println(c.getColor());
        System.out.println(c.getArea());
        System.out.println(c);

        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.getColor());
        System.out.println(cy.getArea());
        System.out.println(cy.getVolume());
        System.out.println(cy);
    }
}
