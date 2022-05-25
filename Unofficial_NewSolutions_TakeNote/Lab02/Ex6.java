import java.util.Scanner;

public class Ex6 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static int find(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        enterValueOfElements(arr);
        
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if(find(arr, k) != -1)
            System.out.println("Index of an element " + k + " is " + find(arr,k));
        else
            System.err.println("Can't find element " + k + " in an array");

        sc.close();
    }
}
