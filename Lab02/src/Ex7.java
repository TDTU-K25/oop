public class Ex7 {

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
        int[] arr = {1,2,3,4,5,6,7,8};
        
        System.out.print("Array before square all elements: ");
        printArray(arr);

        System.out.println();

        square(arr);
        System.out.print("Array after square all elements: ");
        printArray(arr);
    }
}
