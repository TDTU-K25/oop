import java.util.Scanner;

public class Ex9 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static int[] divisibleNumbers(int arr[], int k) {

        // Count how many elements meet the condition to define the size
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0)
                count++;
        }

        // Create a new array with this size to contain the result.
        int[] newArr = new int[count];
        
        // Copy elements that meet the condition into the result array.
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterValueOfElements(arr);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] divisibleNumbersArray = divisibleNumbers(arr, k);
        System.out.print("Array of divisible numbers by " + k + " : ");
        printArray(divisibleNumbersArray);
    }
}
