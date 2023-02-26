package dataTypes;

public class Elseif_Demo {

	public static void main(String[] args) {
		
		/*Else if syntax:
		 * if (condition)
		 * {code to be executed
		 * }else if ()condition
		 * {
		 * code to be executed
		 * }else
		 * {
		 * code to be executed
		 * }
		 * 
		 */
		
		int age = 16;
		
		if(age >= 18 && age <= 80) {
			System.out.println("It is right time to get married");
		}
		else if(age > 80 && age <= 129) {
			System.out.println("Pray to God that you are in good health");
		}
		else {
			System.out.println("You are too young!! \nWait for a while");//This one will print.('\n' will break the line).
		}

	}

}
