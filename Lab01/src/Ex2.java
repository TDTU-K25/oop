import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        double area = 0.5 * height * base;
        System.out.println("Area = " + area);

        sc.close();
    }
}