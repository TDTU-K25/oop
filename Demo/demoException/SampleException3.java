public class SampleException3 {
	public static double factorial(int n) throws MathException {
		if (n < 0) {
			throw new MathException(n + " is invalid");
		} 
		else {
			double output = 1;
			for (int i = 2; i <= n; i++) {
				output *= i;
			}
			return output;
		}
	}

	public static void main(String[] args) throws MathException	{
		System.out.println("n = 5 --> " + factorial(5));
		//System.out.println("n = -1 --> " + factorial(-1));
		
		try {
			System.out.println("n = -1 --> " + factorial(-1)); // MathException: -1 is invalid 
		} catch (MathException err) { // catch (new MathException(-1 + " is invalid."))
			System.out.println(err); // -1 is invalid
		}
		
		System.out.println("n = 6 --> " + factorial(6));
	}
}