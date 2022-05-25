import java.util.Scanner;

public class Ex12 {

    public static int countNumberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int reverseNumber(int num) {
        // Cách 1
        // int weight = countNumberOfDigits(num) - 1;
        // int reverseNum = 0;
        // while (num > 0) {
        //     int lastDigit = num % 10;
        //     reverseNum += (lastDigit * Math.pow(10,weight));
        //     weight--;
        //     num /= 10;
        // }
        int reverseNum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10 + lastDigit);
            num /= 10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println(reverseNumber(num));

        sc.close();
    }
}