public class Ex4 {

    public static int countSpecificElementInArray(int[] arr, int k) {
        int count = 0;
        for (int element : arr) {
            if (k == element)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
       System.out.println(countSpecificElementInArray(new int[] {4,2,5,1,9,5,3,6,2,4,3,6,5,3,2,6,4}, 6));    
    }
}
