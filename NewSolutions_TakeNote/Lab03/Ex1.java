public class Ex1 {
    /* Correct
    public static void deleteElementInArray(int[] arr, int position) {
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
    }

    public static boolean removeSpecificElementInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                deleteElementInArray(arr, i);
                return true;
            }
        }
        return false;
    }
    */

    // Mảng ban đầu int[] a = {2, 4, 3, 1}
    // Có 2 cách 
    // 1) Xóa element trên mảng ban đầu ví dụ xóa số 4 => int[] a = {2, 3, 1, 1}
    // 2) Tạo ra mảng với new size => int[] b = {2, 3, 1}

    public static boolean remove(int[] arr, int k) {
        if (arr.length == 0)
            return false;
        int pos = -1; // -1 không nằm trong index của mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                pos = i;
                break; // remove the first specific element
            }
        }
        if (pos == -1)
            return false;
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        return true;
    }

    /* Correct
    public static void addElementInArray(int[] arr, int position) {
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static int[] insertElementInSpecificPosition(int[] arr, int position, int num) {
        addElementInArray(arr, position);
        arr[position] = num;
        return arr;
    }
    */

    public static int[] duplicateValuesOfArray(int[] arr) {
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

    /* Wrong
    public static int[] removeDuplicateArray(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        int[] temp = new int[arr.length]; // array to mark duplicate values
        int lengthArrAfterRemoveDuplicateValues = arr.length - count;
        int[] arrAfterRemoveDuplicateValues = new int[lengthArrAfterRemoveDuplicateValues];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[j] = -1;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != -1) {
                arrAfterRemoveDuplicateValues[k] = arr[i];
                k++;
            }
        }
        return arrAfterRemoveDuplicateValues;
    }
    */

    /* Wrong
    public static int[] arrayOfDuplicateValues(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        
        int[] result = new int[count];

        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result[k] = arr[j];
                    k++;
                }
            }
        }
        return result;
    }
    */

    /* Wrong
    public static int[] removeDuplicateValues(int[] arr){
        int[] temp = new int[arr.length]; // array to mark duplicate values except the first appearance of each value
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    temp[j] = -1;
                }
            }
        }

        int lengthArrayAfterRemoveDuplicateValues = arr.length - count;
        int[] result = new int[lengthArrayAfterRemoveDuplicateValues];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != -1) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
    */

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,1,3,2,4};

        System.out.println("Array before");
        printArray(arr);

        System.out.println("\n");

        // System.out.println(removeSpecificElementInArray(arr, 3)); 
        // System.out.println("Array after");
        // printArray(insertElementInSpecificPosition(arr, 2, 5));
        // System.out.println("Array of duplicate values: ");
        printArray(duplicateValuesOfArray(arr));
        // System.out.println("Array after");
        // printArray(removeDuplicateArray(arr));
    }
}