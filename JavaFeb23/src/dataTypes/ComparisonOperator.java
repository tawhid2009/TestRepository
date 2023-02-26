package dataTypes;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		String actual = "Google";
		String expected = "google";
		
		/* ==
		 * !=
		 * >
		 * <
		 * >=
		 * <=
		 */
		int a = 15;
		int b = 16;
		
		System.out.println(actual==expected);//False.
		System.out.println(actual!=expected);//true.
		System.out.println(a>b);//false.
		System.out.println(a<b);//true.

	}

}
