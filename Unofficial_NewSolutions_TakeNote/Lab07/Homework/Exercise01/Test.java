public class Test {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1, 2, 1, 1);
        MovableCircle mc = new MovableCircle(0, 0, 2, 2, 3);

        System.out.println(mp);
        System.out.println(mc);
        mc.moveUp();
        System.out.println(mc);
        mc.moveLeft();
        System.out.println(mc);
    }
}
