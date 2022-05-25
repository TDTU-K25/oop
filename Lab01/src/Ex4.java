import java.util.Scanner;

public class Ex4 {

    public static double fahToCel(double fah) {
        return (fah - 32) * (5.0/9);
    }

    public static double celToFah(double cel) {
        return (cel * (9.0/5)) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fah = sc.nextDouble();
        System.out.println("Fahrenheit to Celcius: " + fahToCel(fah));

        System.out.print("Enter temperature in Celcius: ");
        double cel = sc.nextDouble();
        System.out.println("Celcius to Fahrenheit: " + celToFah(cel));

        sc.close();
    }
}