package dataTypes;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		/* for(initialization/start point, how far/end point, how will it increase/decrease)
		 * {
		 * code to be executed
		 * 
		 * 
		 * }
		 */

		for(int i = 1; i <= 10; i++) {
			System.out.println("I love you");
		}
		/* Syntax for while loop
		 * initialization;
		 * while(condition){ 
		 * //Statement
		 * increment/decrement
		 * }
		 * 
		 * 
		 * Syntax for do while loop
		 * initialization;
		 * do{
		 *  //Statement
		 *  increment/decrement
		 *  } while(condition)
		 *  
		 * Type I am from + variable 3 times using
		 * for, while and do while loop
		 * use String variable for referring to
		 * your place  
		 */
	
		String city = "Queens";
		
		// using for loop
		for(int i = 0; i < 3; i++) {
			System.out.println("I am from " + city);
		}
		
		// using while loop
		int count = 0;
		while(count < 3) {
			System.out.println("I am from " + city);
			count++;
		}
		
		// using do while loop
		int c = 1;
		do {
			System.out.println("I am from " + city);
			c++;
		}
		while(c <= 3);
	}

}
