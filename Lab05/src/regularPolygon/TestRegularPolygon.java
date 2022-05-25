public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon("p1", 5, 2);
        RegularPolygon rp3 = new RegularPolygon("q1", 4);
        RegularPolygon rp4 = new RegularPolygon(rp2);

        System.out.println("(" + rp1.getName() + ", " + rp1.getEdgeAmount() + ", " + rp1.getEdgeLength() + ", " + rp1.getPolygon() + ", "+ rp1.getPerimeter() + ", " + rp1.getArea() + ")");
        System.out.println("(" + rp2.getName() + ", " + rp2.getEdgeAmount() + ", " + rp2.getEdgeLength() + ", " + rp2.getPolygon() + ", "+ rp2.getPerimeter() + ", " + rp2.getArea() + ")");
        System.out.println("(" + rp3.getName() + ", " + rp3.getEdgeAmount() + ", " + rp3.getEdgeLength() + ", " + rp3.getPolygon() + ", "+ rp3.getPerimeter() + ", " + rp3.getArea() + ")");
        System.out.println("(" + rp4.getName() + ", " + rp4.getEdgeAmount() + ", " + rp4.getEdgeLength() + ", " + rp4.getPolygon() + ", "+ rp4.getPerimeter() + ", " + rp4.getArea() + ")");

        rp1.setName("h1");
        rp1.setEdgeAmount(6);
        rp1.setEdgeLength(4);

        rp4.setName("t1");
        rp4.setEdgeAmount(3);
        rp4.setEdgeLength(3);

        System.out.println();

        System.out.println("(" + rp1.getName() + ", " + rp1.getEdgeAmount() + ", " + rp1.getEdgeLength() + ", " + rp1.getPolygon() + ", "+ rp1.getPerimeter() + ", " + rp1.getArea() + ")");
        System.out.println("(" + rp2.getName() + ", " + rp2.getEdgeAmount() + ", " + rp2.getEdgeLength() + ", " + rp2.getPolygon() + ", "+ rp2.getPerimeter() + ", " + rp2.getArea() + ")");
        System.out.println("(" + rp3.getName() + ", " + rp3.getEdgeAmount() + ", " + rp3.getEdgeLength() + ", " + rp3.getPolygon() + ", "+ rp3.getPerimeter() + ", " + rp3.getArea() + ")");
        System.out.println("(" + rp4.getName() + ", " + rp4.getEdgeAmount() + ", " + rp4.getEdgeLength() + ", " + rp4.getPolygon() + ", "+ rp4.getPerimeter() + ", " + rp4.getArea() + ")");

        System.out.println();

        rp1.setName("Heptagon");
        rp1.setEdgeAmount(7);
        rp1.setEdgeLength(5);

        System.out.println(rp1.toString());
        System.out.println(rp2.toString());
        System.out.println(rp3.toString());
        System.out.println(rp4.toString());
    }
}
