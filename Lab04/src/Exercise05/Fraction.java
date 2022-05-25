public class Fraction {
    // Attributes
    private int numerator; 
    private int denominator; 

    // Constructors
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int num, int den) {
        if (den == 0) {
            den = 1;
        }
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        Fraction result = new Fraction();
        result.numerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        result.denominator = this.denominator * f.denominator;
        return result;

        // int num = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        // int den = this.denominator * f.denominator;
        // return new Fraction(num, den);
    }

    public Fraction sub(Fraction f) {
        Fraction result = new Fraction();
        result.numerator = (this.numerator * f.denominator) - (f.numerator * this.denominator);
        result.denominator = this.denominator * f.denominator;
        return result;
    }

    public Fraction mul(Fraction f) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }

    public Fraction div(Fraction f) {
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator;
        result.denominator = this.denominator * f.numerator;
        return result;
    }

    private int findGCD (int a, int b) { // find the greatest common divisor (UCLN)
        while(a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        return a;
    }

    public void reducer() {
        int GCD = this.findGCD(this.numerator, this.denominator); // find the greatest common divisor of numerator and denominator
        this.numerator /= GCD;
        this.denominator /= GCD;
    }

    public String toString() {
        return String.format("Fraction[num=%d, den=%d]", this.numerator, this.denominator);
    }
}
