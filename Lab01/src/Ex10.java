import java.util.Scanner;

public class Ex10 {

    public static int lastDigit(int num) {
        return num % 10;
    }

    public static int firstDigit(int num) {
        while (num > 10) {
            num /= 10;
        }
        return num;
    }

    public static int sumOfFirstAndLastDigit(int num) {
        return firstDigit(num) + lastDigit(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        System.out.println(sumOfFirstAndLastDigit(num));

        sc.close();
    }
}