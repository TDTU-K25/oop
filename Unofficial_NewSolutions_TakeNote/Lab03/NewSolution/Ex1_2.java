public class Ex1_2 {

    // Remove the first specific element
    public static boolean rmFirst(int[] arr, int element) {

        if (arr.length == 0) {
            return false;
        }
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return true;
    }

    // Insert an element a specific position
    public static void insert(int arr[], int element, int position) {
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;
    }

    // Print int[] array
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
    }

    // Find the duplicate values
    public static int[] findDuplicate(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int c = 0, count = 0;
        int[] temp = new int[arr.length / 2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c++;
            }
        }
        if (c > 1) {
            temp[0] = 0;
            c = 1;
            count++;
        } else {
            c = 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        temp[c] = arr[i];
                        arr[j] = 0;

                    }
                }
                if (temp[c] != 0) {
                    count++;
                    c++;
                }
            }
        }
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    // remove the duplicate values of an array
    public static int[] rmDuplicate(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int c = 1, count = 0,zero = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c++;
                zero = i;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                count++;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 0;
                    }
                }
            }
        }

        if (c == 2) {
            count ++;
        }
        int[] res = new int[count + 1];
        res[0] = arr[0];
        c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0 || i == zero) {
                res[c++] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 5, 0, 5, 0, 1, 3 };
        int n = arr.length + 1;
        // Remove the first specific element
        System.out.println("Remove the first specific element");
        if (rmFirst(arr, 2)) {
            n--;
        }
        printArr(arr, n);

        // Insert an element a specific position
        System.out.printf("\nInsert an element a specific position:\n");
        insert(arr, 7, 4);
        printArr(arr, n);

        // Find the duplicate values of an array
        System.out.println("Find the duplicate values of an array:");
        printArr(arr, n);
        int dupArr[] = findDuplicate(arr);
        printArr(dupArr, dupArr.length);

        // Find the duplicate values of an array
        System.out.println("Remove the duplicate values of an array:");
        int[] narr = { 5, 2, 7, 5, 5, 0, 4, 1, 3 };
        printArr(narr, n);
        int removeArr[] = rmDuplicate(narr);
        printArr(removeArr, removeArr.length);
    }

}