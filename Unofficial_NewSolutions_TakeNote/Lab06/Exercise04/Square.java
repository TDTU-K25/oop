public class Square extends Rectangle {
    // Constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        this.length = this.width;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        this.width = this.length;
    }

    @Override
    public String toString() {
        return String.format("Square[color=%s, filled=%b, side=%f]", this.color, this.filled, this.width);
    }
}
