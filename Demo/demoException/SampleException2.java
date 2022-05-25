public class SampleException2 {
	public static double factorial(int n) throws IllegalArgumentException { // this means method factorial() can throw IllegalArgumentException
		if (n < 0) {
			IllegalArgumentException obj = new IllegalArgumentException(n + " is invalid.");
			throw obj;
		} 
		else {
			double output = 1;
			for (int i = 2; i <= n; i++) {
				output *= i;
			}
			return output;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("n = 5 --> " + factorial(5));
		//System.out.println("n = -1 --> " + factorial(-1));
		
		try {
			System.out.println("n = -1 --> " + factorial(-1));
		} catch (IllegalArgumentException err) {
			System.out.println(err);
		}
		
		System.out.println("n = 6 --> " + factorial(6));
	}
}