import java.util.Scanner;
import java.util.InputMismatchException;
public class SampleException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isError = false;
		do {
			System.out.println("Enter an integer number");
			try {
				int num = sc.nextInt();
				System.out.println("num = " + num);
				isError = false;
			} 
			catch (InputMismatchException e) {
				System.err.println("Incorrect input");
				sc.nextLine(); // skip newline
				isError = true;
			}
		} while (isError);
	}
}