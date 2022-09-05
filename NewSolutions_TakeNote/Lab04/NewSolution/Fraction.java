public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int num, int den) {
        this.numerator = num;
        if (den == 0) {
            this.denominator = 1;
        } else {
            this.denominator = den;
        }
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        int addNumerator;
        int adddenominator;
        if (this.denominator == f.denominator) {
            addNumerator = this.numerator + f.numerator;
            adddenominator = f.denominator;
        } else {
            addNumerator = this.numerator * f.denominator + this.denominator * f.numerator;
            adddenominator = this.denominator * f.denominator;
        }
        Fraction res = new Fraction(addNumerator, adddenominator);
        res.reducer();
        return res;
    }

    public Fraction sub(Fraction f) {
        int subNumerator;
        int subdenominator;
        if (this.denominator == f.denominator) {
            subNumerator = this.numerator - f.numerator;
            subdenominator = f.denominator;
        } else {
            subNumerator = this.numerator * f.denominator - this.denominator * f.numerator;
            subdenominator = this.denominator * f.denominator;
        }
        Fraction res = new Fraction(subNumerator, subdenominator);
        res.reducer();
        return res;
    }

    public Fraction mul(Fraction f) {
        int mulNumerator;
        int muldenominator;
        mulNumerator = this.numerator * f.numerator;
        muldenominator = this.denominator * f.denominator;
        Fraction res = new Fraction(mulNumerator, muldenominator);
        res.reducer();
        return res;
    }

    public Fraction div(Fraction f) {
        int divNumerator;
        int divdenominator;
        divNumerator = this.numerator * f.denominator;
        divdenominator = this.denominator * f.numerator;
        Fraction res = new Fraction(divNumerator, divdenominator);
        res.reducer();
        return res;
    }

    private int gdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gdc(b, a % b);
    }

    public void reducer() {
        int div = gdc(this.numerator, this.denominator);
        this.numerator /= div;
        this.denominator /= div;
    }

    public String toString() {
        return "Fraction[num=" + this.numerator + ",den=" + this.denominator + "]";
    }
}