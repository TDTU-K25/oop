import java.util.Vector;
import java.util.Scanner;

public class TestVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number elements of vector: ");
        int n = sc.nextInt();
        
        // Create vector with initial capacity n => Vector has no components (doesn't have default value for each component) => size() will return 0
        Vector<Integer> X = new Vector<Integer>(n);
        System.out.println("Enter elements into vector: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            X.add(value);
        }

        Vector<Integer> Y = new Vector<Integer>(X.size());
        for (int i = 0; i < X.size(); i++) {
            Y.add(2 * X.get(i) * X.get(i) + 1);
        }

        System.out.println("Vector X = " + X);
        System.out.println("Vector Y = " + Y);
    }
}
