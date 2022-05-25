public class Pumpkin implements Vegetable {
    private double weight = 5;

    @Override
    public String getInfo() {
        return String.format("%f", this.weight);
    }
}
