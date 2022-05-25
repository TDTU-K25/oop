public class Ex1 {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum value of array: " + findMax(new int[] {1,4,-2,5,9,7,6,3,0}));
    }    
}
