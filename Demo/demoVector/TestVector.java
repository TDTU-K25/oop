import java.util.Vector;
public class TestVector {
	public static void main(String[] args) {
		Vector<String> courses = new Vector<String>();
		courses.add("501043");
		courses.add(0, "501042");
		courses.add("502043");
		
		System.out.println(courses); // [501042, 501043, 502043]
		System.out.println("At index 0: " + courses.get(0)); // At index 0: 501042
		
		if (courses.contains("501043"))
			System.out.println("501043 is in courses");
		courses.remove("501043");
		
		for (String c: courses) {
			System.out.println(c);
		}
		// 501042
		// 502043
	}
}