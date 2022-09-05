public class Exercise {

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public int sumEvenNums(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }

    public int countSpecificElementInArray(int[] arr, int k) {
        int count = 0;
        for (int element : arr) {
            if (k == element)
                count++;
        }
        return count;
    }

    public boolean isPrimeNum(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public int countPrimeNumInArray(int[] arr) {
        int count = 0;
        for (int element : arr) {
            if(isPrimeNum(element)) {
                count++;
            }
        }
        return count;
    }

    public void ascendInterchangeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
	
	// Exercise 10
	public static int nLargest(int[] arr, int n) {
        int max = arr[0], index = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (n == 1) {
            return max;
        } else {
            arr[index] = min;
            return nLargest(arr, n - 1);
        }
    }
}
