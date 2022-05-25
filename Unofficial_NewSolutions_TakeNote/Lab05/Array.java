import java.util.Scanner;

public class Array {
    public static int findFirstEvenElement(int[] a) {
        for (int element : a) {
            if (element % 2 == 0) {
                return element;
            }
        }
        return -1; // Array doesn't have even numbers
    }

    public static int findFirstOddElement(int[] a) {
        for (int element : a) {
            if (element % 2 != 0) {
                return element;
            }
        }
        return -1; // Array doesn't have odd numbers
    }

    public static int maxEven(int[] a) { 
        if (findFirstEvenElement(a) == -1) {
            return -1;
        }
        int max = findFirstEvenElement(a);
        for (int element : a) {
            if (max < element && element % 2 == 0) {
                max = element;
            }
        }
        return max;
        
    }

    public static int minOdd(int[] a) {
        if (findFirstOddElement(a) == -1) {
            return -1;
        }
        int min = findFirstOddElement(a);
        for (int element : a) {
            if (min > element && element % 2 != 0) {
                min = element;
            }
        }
        return min;
    }

    public static int sumMEMO(int[] a) {
        int max = maxEven(a);
        int min = minOdd(a);
        if (findFirstEvenElement(a) == -1) {
            max = 0;
        } // Array doesn't have even numbers
        if (findFirstOddElement(a) == -1) {
            min = 0;
        } // Array doesn't have odd numbers
        return max + min;
    }

    public static int sumEven(int[] a) {
        if (findFirstEvenElement(a) == 1) {
            return -1;
        } // Array doesn't have even numbers
        int sum = 0;
        for (int element : a) {
            if (element % 2 == 0) {
                sum += element;
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a) {
        if (findFirstOddElement(a) == -1) { 
            return -1; 
        } // Array doesn't have odd numbers
        int product = 1;
        for (int element : a) {
            if (element % 2 != 0) {
                product *= element;
            }
        }
        return product;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1; // Array doesn't have even numbers
    }

    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1; // Array doesn't have odd numbers
    }

    public static int[] input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = input(n);
        System.out.println(maxEven(a));
        System.out.println(minOdd(a));
        System.out.println(sumMEMO(a));
        System.out.println(sumEven(a));
        System.out.println(prodOdd(a));
        System.out.println(idxFirstEven(a));
        System.out.println(idxLastOdd(a));
        sc.close();
    }
}
