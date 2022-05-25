public class TestFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(8, 4);
        Fraction f3 = new Fraction(f2);

        System.out.println(f1.toString()); // System.out.println(f1);

        System.out.println();

        System.out.println(f2.toString()); // System.out.println(f2);
        
        System.out.println();

        System.out.println(f3.toString()); // System.out.println(f3);

        System.out.println();

        Fraction addResult = f1.add(f2);
        System.out.println(addResult.toString());

        System.out.println();

        Fraction subResult = f1.sub(f2);
        System.out.println(subResult.toString());

        System.out.println();

        Fraction mulResult = f1.mul(f2);
        System.out.println(mulResult.toString());

        System.out.println();

        Fraction divResult = f1.div(f2);
        System.out.println(divResult.toString());

        System.out.println();

        f1.reducer();
        f2.reducer();

        System.out.println(f1.toString());

        System.out.println();

        System.out.println(f2.toString());
    }
}
