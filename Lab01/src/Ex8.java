import java.util.Scanner;

public class Ex8 {

    public static int formulaA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int formulaB(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static int formulaC(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2,i);
        }
        return sum;
    }

    public static double formulaD(int n) {
        double sum = 0;
        for (int i = 2; i <= 2*n; i+= 2) {
            sum += (1.0/i);
        }
        return sum;
    }

    public static int formulaE(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("a) " + formulaA(n));
        System.out.println("b) " + formulaB(n));
        System.out.println("c) " + formulaC(n));
        System.out.println("d) " + formulaD(n));
        System.out.println("e) " + formulaE(n));

        sc.close();
    }
}