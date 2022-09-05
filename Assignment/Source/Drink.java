public class Drink {
    private String dName;
    private int price;

    public Drink(String dName, int price) {
        this.dName = dName;
        this.price = price;
    }

    public String getdName() {
        return this.dName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.dName + "_" + this.price;
    }
}
