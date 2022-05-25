import java.util.Scanner;

public class Ex3 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static int sumEvenNums(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterValueOfElements(arr);

        System.out.println("Sum of even numbers = " + sumEvenNums(arr));
    }
}
