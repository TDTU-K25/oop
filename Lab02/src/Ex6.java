public class Ex6 {

    public static int find(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {2,4,1,6,3,8,9,5}, 3));
    }
}
