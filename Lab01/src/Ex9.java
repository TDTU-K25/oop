import java.util.Scanner;

public class Ex9 {

    public static void hailstoneSequence(int n) {
        while (n != 1) {
            if (n % 2 == 0)
            {
               System.out.println(n + " is even, so we take n/2: " + (n/2)); 
               n /= 2;
            }
            else
            {
               System.out.println(n + " is odd, so we take 3*n+1: " + (3*n+1)); 
               n = 3*n+1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter n: ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Error, please try again");
        } while(n <= 0);
        
        hailstoneSequence(n);

        sc.close();
    }
}