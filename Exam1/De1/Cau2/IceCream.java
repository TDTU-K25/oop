public class IceCream {
    // Attributes
    private String flavor;
    private double costPerScoop;
    private int numberOfRemaining;

    // Constructors
    public IceCream() {
        this.flavor = "Vanilla";
        this.costPerScoop = 1000;
        this.numberOfRemaining = 10;
    }

    public IceCream(String flavor, double costPerScoop, int numberOfRemaining) {
        String[] flavors = {"Vanilla", "Chocolate", "Mango", "Strawberry"};
        for (String element : flavors) {
            if (flavor.compareTo(element) == 0) {
                this.flavor = element; 
                break;
            }
            else {
                this.flavor = "Chocolate";
                break;
            }
        }
        this.costPerScoop = costPerScoop;
        this.numberOfRemaining = numberOfRemaining;
    }

    public double totalCost(int scoop) {
        if (this.numberOfRemaining >= scoop) {
            this.numberOfRemaining -= scoop;
            double total = scoop * this.costPerScoop;
            if (this.flavor.compareTo("Mango") == 0) {
                total *= 0.95;
            }
            return total;
        }
        return 0;
    }
}