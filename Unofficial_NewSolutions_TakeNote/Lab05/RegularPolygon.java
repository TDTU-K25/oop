public class RegularPolygon {
    // Attribute
    private String name;
    private int edgeAmount;
    private int edgeLength;
    
    // Constructor
    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, int edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    // Getter (Accessor)
    public String getName() {
        return this.name;
    }

    public int getEdgeAmount() {
        return this.edgeAmount;
    }


    public int getEdgeLength() {
        return this.edgeLength;
    }

    // Setter (Mutator)
    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int edgeAmount) {
        this.edgeAmount = edgeAmount;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public String getPolygon() {
        String polygon = "";
        if (this.edgeAmount == 3) {
            polygon = "Triangle";
        }
        else if (this.edgeAmount == 4) {
            polygon = "Quadrangle";
        }
        else if (this.edgeAmount == 5) {
            polygon = "Pentagon";
        }
        else if (this.edgeAmount == 6) {
            polygon = "Hexagon";
        }
        else if (this.edgeAmount > 6) {
            polygon = "Polygon has the number of edges greater than 6";
        }
        return polygon;
    }

    public double getPerimeter() {
        double perimeter = this.edgeAmount * this.edgeLength;
        return perimeter;
    } 

    public double getArea() {
        double a = 0;
        if (this.edgeAmount == 3) {
            a = 0.433;
        }
        else if (this.edgeAmount == 4) {
            a = 1;
        }
        else if (this.edgeAmount == 5) {
            a = 1.72;
        }
        else if (this.edgeAmount == 6) {
            a = 2.595;
        }
        else if (this.edgeAmount > 6) {
            return -1;
        }
        double area = Math.pow(this.edgeLength, 2) * a;
        return area;
    }

    public String toString() {
        return this.name + " - " + this.getPolygon() + " - " + this.getArea();
    }
}
