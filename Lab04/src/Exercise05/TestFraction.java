public class TestFraction {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(8, 4);
        Fraction f3 = new Fraction(f2);

        System.out.println(f); 
        System.out.println(f1); 
        System.out.println(f2); 
        System.out.println(f3); 

        System.out.println();

        System.out.println("Add");
        Fraction addResult = f1.add(f2);
        System.out.println(addResult);

        System.out.println();

        System.out.println("Sub");
        Fraction subResult = f1.sub(f2);
        System.out.println(subResult);

        System.out.println();

        System.out.println("Mul");
        Fraction mulResult = f1.mul(f2);
        System.out.println(mulResult);

        System.out.println();

        System.out.println("Div");
        Fraction divResult = f1.div(f2);
        System.out.println(divResult);

        System.out.println();

        f1.reducer();
        f2.reducer();

        System.out.println("Reducer");
        System.out.println(f1);
        System.out.println(f2);
    }
}
