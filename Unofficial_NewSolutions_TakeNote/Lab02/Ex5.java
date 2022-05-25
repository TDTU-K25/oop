import java.util.Scanner;

public class Ex5 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static boolean isPrimeNum(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static int countPrimeNumInArray(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(isPrimeNum(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterValueOfElements(arr);

        System.out.println("There are " + countPrimeNumInArray(arr) + " prime numbers in an array");
    }
}
