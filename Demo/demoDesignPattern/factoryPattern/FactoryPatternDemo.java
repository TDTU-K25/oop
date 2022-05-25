public class FactoryPatternDemo {

    public static void main(String[] args) {
       ShapeFactory shapeFactory = new ShapeFactory();
 
       //get an object of Circle and call its draw method.
       Shape shape1 = shapeFactory.getShape("Circle");
 
       //call draw method of Circle
       shape1.draw();
 
       //get an object of Rectangle and call its draw method.
       Shape shape2 = shapeFactory.getShape("Rectangle");
 
       //call draw method of Rectangle
       shape2.draw();
 
       //get an object of Square and call its draw method.
       Shape shape3 = shapeFactory.getShape("Square");
 
       //call draw method of square
       shape3.draw();
    }
 }