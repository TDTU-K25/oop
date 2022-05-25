public class Program {
    public static void main(String[] args) {
        VegetableFactory vegetableFactory = new VegetableFactory();

        Vegetable vegetable1 = vegetableFactory.getVegetable("Carrot");
        System.out.println(vegetable1.getInfo());

        Vegetable vegetable2 = vegetableFactory.getVegetable("Cabbage");
        System.out.println(vegetable2.getInfo());

        Vegetable vegetable3 = vegetableFactory.getVegetable("Pumpkin");
        System.out.println(vegetable3.getInfo());
    }
}
