package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		String[] myArray = {"Java", "Eclipse"};
		for(int i = 0; i < myArray.length; i++) {
			
			System.out.println(myArray[i]);
		}

		//example of enhanced for loop
		for(String v: myArray) {
			System.out.println(v);
		}
		
	}

}
