import java.util.Scanner;

public class Ex7 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }
    
    public static void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
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

        System.out.print("Array before square all elements: ");
        printArray(arr);

        System.out.println();

        square(arr);
        System.out.print("Array after square all elements: ");
        printArray(arr);
    }
}
