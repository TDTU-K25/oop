import java.util.Scanner;

public class Ex13 {

    public static int countNumberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int reverseNumber(int num) {
        int weight = countNumberOfDigits(num) - 1;
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum += (lastDigit * Math.pow(10,weight));
            weight--;
            num /= 10;
        }
        return reverseNum;
    }

    public static boolean isPalindromeNum(int num) {
        if(num == reverseNumber(num))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(isPalindromeNum(num))
            System.out.println(num + " is palindrome number");
        else    
            System.out.println(num + " isn't palindrome number");

        sc.close();
    }
}