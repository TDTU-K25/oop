// Client Class (exist main method)
public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("999999999", "Nguyen Van A", "Vietnam", 3000.75);
        
        // Before
        st1.printInfo();
        System.out.println();
        st2.printInfo();

        st1.depositWallet(500);
        st2.payForLiving(1000);

        System.out.println();

        // After
        st1.printInfo();
        System.out.println();
        st2.printInfo();

    }
}
