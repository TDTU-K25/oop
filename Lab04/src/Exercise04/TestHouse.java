public class TestHouse {
    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House("B03", 4, true, 100, 2500000);

        System.out.println(h1.getHouseCode());
        System.out.println(h1.getNumOfBedRooms());
        System.out.println(h1.getHasSwimmingPool());
        System.out.println(h1.getArea());
        System.out.println(h1.getCostPerSquareMeter());

        h1.setHouseCode("C04");
        h1.setNumOfBedRooms(5);
        h1.setHasSwimmingPool(false);
        h1.setArea(50);
        h1.setCostPerSquareMeter(2000000);
        
        System.out.println(h1);
        System.out.println(h2);
    }
}
