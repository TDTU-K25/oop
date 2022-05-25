public class Ex2 {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Minimum value of array: " + findMin(new int[] {3,2,5,-3,0,4}));
    }
}
