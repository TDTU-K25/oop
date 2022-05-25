public class House {
    // Attributes
    private String houseCode;
    private int numOfBedRooms;
    private boolean hasSwimmingPool;
    private double area;
    private double costPerSquareMeter;

    // Constructors
    public House() {
        this.houseCode = "A01";
        this.numOfBedRooms = 2;
        this.hasSwimmingPool = false;
        this.area = 0;
        this.costPerSquareMeter = 0;
    }

    public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    // Getters
    public String getHouseCode() {
        return this.houseCode;
    }

    public int getNumOfBedRooms() {
        return this.numOfBedRooms;
    }

    public boolean getHasSwimmingPool() {
        return this.hasSwimmingPool;
    }

    public double getArea() {
        return this.area;
    }

    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter;
    }

    // Setters
    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCostPerSquareMeter(double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public double calculateSellingPrice() {
        double subTotal = this.area * this.costPerSquareMeter;
        if(this.hasSwimmingPool) {
            subTotal *= 1.1;
        }
        double sellingPrice = subTotal + 0.15 * subTotal; // 15% tax
        return sellingPrice;
    }

    public String toString() {
        return String.format("House[%s, %d, %b, %f]", this.houseCode, this.numOfBedRooms, this.hasSwimmingPool, this.calculateSellingPrice());
    }
}
