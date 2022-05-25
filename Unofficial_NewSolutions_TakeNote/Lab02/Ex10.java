import java.util.Scanner;

public class Ex10 {

    static Scanner sc = new Scanner(System.in);

    public static void enterValueOfElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void ascendInterchangeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int thirdLargestElement(int[] arr) {
        int maxFirst = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxFirst)
                maxFirst = arr[i];
        }

        int maxSecond = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == maxFirst)
                continue;
            if (arr[i] > maxSecond)
                maxSecond = arr[i];
        }

        int maxThird = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == maxFirst || arr[i] == maxSecond)
                continue;
            if (arr[i] > maxThird)
                maxThird = arr[i];
        }

        return maxThird;
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
        
        System.out.print("Array before sort: ");
        printArray(arr);

        System.out.println();

        ascendInterchangeSort(arr);
        System.out.print("Array after sort: ");
        printArray(arr);

        System.out.println();

        System.out.println("The third largest element in array: " + thirdLargestElement(arr));
   } 
}
