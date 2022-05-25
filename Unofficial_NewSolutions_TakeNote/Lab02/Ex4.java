import java.util.Scanner;

public class Ex4 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }
    
    public static int countSpecificElementInArray(int[] arr, int k) {
        int count = 0;
        for (int element : arr) {
            if (k == element)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterValueOfElements(arr);

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        System.out.println(k + " appears " + countSpecificElementInArray(arr, k) + " times");
    }
}
