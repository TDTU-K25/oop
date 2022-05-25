public class RegularPolygon {
    // Attributes
    private String name;
    private int edgeAmount;
    private double edgeLength;
    
    // Constructors
    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
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

    // Getters
    public String getName() {
        return this.name;
    }

    public int getEdgeAmount() {
        return this.edgeAmount;
    }


    public double getEdgeLength() {
        return this.edgeLength;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int num) {
        this.edgeAmount = num;
    }

    public void setEdgeLength(double length) {
        this.edgeLength = length;
    }

    public String getPolygon() {
        String polygonType = "";
        if (this.edgeAmount == 3) {
            polygonType = "Triangle";
        }
        else if (this.edgeAmount == 4) {
            polygonType = "Quadrangle";
        }
        else if (this.edgeAmount == 5) {
            polygonType = "Pentagon";
        }
        else if (this.edgeAmount == 6) {
            polygonType = "Hexagon";
        }
        else if (this.edgeAmount > 6) {
            polygonType = "Polygon has the number of edges greater than 6";
        }
        return polygonType;
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
