public class Ex5 {

    public static boolean isPrimeNum(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static int countPrimeNumInArray(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(isPrimeNum(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("There are " + countPrimeNumInArray(new int[] {4,5,2,6,9,7,11}) + " prime numbers in an array");
    }
}
