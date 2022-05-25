public class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(3, 4);  
        System.out.println(s); 
        System.out.println("Area = " + s.getArea()); 
        
        // System.out.println("Perimeter = " + s.getPerimeter()); // Compile error because Shape class doesn't have getPerimeter() method

        // Want to use getPerimeter() method => Type casting
        Rectangle r = (Rectangle) s;
        System.out.println("Perimeter = " + r.getPerimeter());

        s = new Triangle(4, 5);
        System.out.println(s); 
        System.out.println("Area = " + s.getArea()); 
    }
}