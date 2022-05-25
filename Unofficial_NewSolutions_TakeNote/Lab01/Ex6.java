import java.util.Scanner;

public class Ex6 {
    public static double minBetweenThreeNums(double num1, double num2, double num3) {
        // Cách 1
        // double min = num1;
        // if(num2 < min)
        //     min = num2;
        // else if(num3 < min)
        //     min = num3;

        // Cách 2
        double min;
        if (num1 < num2)
            min = num1;
        else   
            min = num2;
        if (min > num3)
            min = num3;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter the third number: ");
		double num3 = sc.nextDouble();

        System.out.print("The minimum between three numbers: " + minBetweenThreeNums(num1,num2,num3));

        sc.close();
    }
}