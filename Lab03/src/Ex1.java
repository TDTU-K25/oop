public class Ex1 {
    public static void deleteElementInArray(int[] arr, int position) {
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
    }

    public static boolean removeSpecificElementInArray(int[] arr, int num) {
        if (arr.length == 0)
            return false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                deleteElementInArray(arr, i);
                return true;
            }
        }
        return false;
    }

    public static void moveElementInArrayToTheRight(int[] arr, int position) {
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static void insertElementWithSpecificPosition(int[] arr, int position, int num) {
        moveElementInArrayToTheRight(arr, position);
        arr[position] = num;
    }

    public static int[] arrayOfDuplicateValues(int[] arr) {
        // create a temp array to store duplicate values
        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = Integer.MAX_VALUE;
        }

        int countDuplicateValues = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // check if the value under consideration is already in the temp array
            boolean found = false; // suppose that the value under consideration doesn't exist in the temp array
            for (int j = 0; ; j++) {
                if (temp[j] == Integer.MAX_VALUE) break;
                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }

            // Skip the value under consideration when finding out that it already exists inside the temp array
            if (found) {
                continue;
            }

            // if the value under consideration isn't in the temp array 
            // => assign it to the temp array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[countDuplicateValues] = arr[i];
                    countDuplicateValues++;
                    break;
                }
            }
        }

        // remove all the Integer.MAX_VALUE in temp array
        int[] result = new int[countDuplicateValues];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static int[] arrayAfterRemoveDuplicateValues(int[] arr){
        int[] temp = new int[arr.length]; // array to mark duplicate values except the first appearance of each value
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[j] = -1;
                }
            }
        }

        // the length of array after remove duplicate values
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(temp[i] != -1) {
                count++;
            }
        }

        int[] result = new int[count];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != -1) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,3};

        System.out.println("Array before:");
        printArray(arr);

        // System.out.println("\n");

        // System.out.println(removeSpecificElementInArray(arr, 2)); 
        // System.out.println("Array after:");
        // printArray(arr);

        // System.out.println("\n");

        // insertElementWithSpecificPosition(arr, 2, 5);
        // System.out.println("Array after:");
        // printArray(arr);

        // System.out.println("\n");

        // System.out.println("Array of duplicate values:");
        // printArray(arrayOfDuplicateValues(arr));

        // System.out.println("\n");

        // System.out.println("Array after:");
        // printArray(arrayAfterRemoveDuplicateValues(arr));
    }
}