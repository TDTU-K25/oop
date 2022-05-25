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
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        Fraction result = new Fraction();
        if (this.denominator < f.denominator)
        {
            for (int i = 1; i <= f.denominator; i++) {
                if (this.denominator * i == f.denominator) {
                    result.denominator = f.denominator;
                    result.numerator = this.numerator * i + f.numerator;
                }
            }
        }
        else 
        {
            for (int i = 1; i <= this.denominator; i++) {
                if (f.denominator * i == this.denominator) {
                    result.denominator = this.denominator;
                    result.numerator = f.numerator * i + this.numerator;
                }
            }
        }
    
        // Cách 2 (quy đồng trước để ra công thức tổng quát)
        // result.numerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        // result.denominator = this.denominator * f.denominator;
            
        return result;
    }

    public Fraction sub(Fraction f) {
        Fraction result = new Fraction();
        if (this.denominator < f.denominator) {
            for (int i = 1; i <= f.denominator; i++) {
                if (this.denominator * i == f.denominator) {
                    result.denominator = f.denominator;
                    result.numerator = this.numerator * i - f.numerator;
                }
            }
        }
        else {
            for (int i = 1; i <= this.denominator; i++) {
                if (f.denominator * i == this.denominator) {
                    result.denominator = this.denominator;
                    result.numerator = this.numerator - f.numerator * i;
                }
            }
        }

        // Cách 2 (quy đồng trước để ra công thức tổng quát)
        // result.numerator = (this.numerator * f.denominator) - (f.numerator * this.denominator);
        // result.denominator = this.denominator * f.denominator;

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
        do {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        } while(a != b);
        return a;
    }

    public void reducer() {
        int GCD = this.findGCD(this.numerator, this.denominator); // tìm UCLN của tử số và mẫu số
        this.numerator /= GCD;
        this.denominator /= GCD;
    }

    public String toString() {
        return "Fraction[num = " + this.numerator + ", den = " + this.denominator + "]";
    }
}
