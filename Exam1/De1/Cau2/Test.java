public class Test {
    public static void main(String[] args) {
        IceCream ic1 = new IceCream();
        IceCream ic2 = new IceCream("Mango", 10000, 10);
        System.out.println(ic1.totalCost(5));
        System.out.println(ic2.totalCost(10));
        System.out.println(ic2.totalCost(20));
    }
}
