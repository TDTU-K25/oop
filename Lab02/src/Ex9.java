public class Ex9 {

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
        int[] divisibleNumbersArray = divisibleNumbers(new int[] {1,2,3,4,5,6,7}, 2);
        printArray(divisibleNumbersArray);
    }
}
