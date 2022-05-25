public class Cabbage implements Vegetable {
    private String type = "Cabbage";
    private double weight = 1.0;

    @Override
    public String getInfo() {
        return String.format("%s, %f", this.type, this.weight);
    }
}
