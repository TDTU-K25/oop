public class VegetableFactory {
    public Vegetable getVegetable(String type) {
        switch (type) {
            case "Carrot":
                return new Carrot();
            case "Cabbage":
                return new Cabbage();
            case "Pumpkin":
                return new Pumpkin();
            default: 
                throw new IllegalArgumentException("This vegetable type is unsupported");
        }
    }
}
