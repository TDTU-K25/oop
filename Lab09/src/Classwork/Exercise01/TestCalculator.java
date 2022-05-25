public class TestCalculator {
    public static void main(String[] args) throws NumberOutOfRangeException {
        System.out.println(new Calculator().divide(1200, 3));

        try {
            System.out.println(new Calculator().divide(3, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println(new Calculator().multiply(999, 4));
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(new Calculator().multiply(-2000, 5));
        } catch(NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

    }
}
