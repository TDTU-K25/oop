public class ShapeFactory {

    // use getShape method to get object of type shape
    public Shape getShape(String shapeType){
       switch(shapeType) {
           case "Circle": return new Circle();
           case "Rectangle": return new Rectangle();
           case "Square": return new Square();
           default: throw new IllegalArgumentException("This shape type isn't supported");
        }
    }
}