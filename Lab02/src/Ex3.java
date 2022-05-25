public class Ex3 {

    public static int sumEvenNums(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of even numbers = " + sumEvenNums(new int[] {1,3,4,5,7,6,9}));
    }
}
