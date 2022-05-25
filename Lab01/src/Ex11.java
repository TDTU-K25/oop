import java.util.Scanner;

public class Ex11 {

    public static int countNumberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println(countNumberOfDigits(num));

        sc.close();
    }
}