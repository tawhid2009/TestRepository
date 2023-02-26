package dataTypes;

public class Switch_Demo {

	public static void main(String[] args) {
		
		/*Switch Statement Syntax:
		 * 
		 * Switch(expression){
		 * case value1:
		 *  //code to be executed
		 *  break;
		 * case value2:
		 *  // code to be executed
		 *  break;
		 *  case value3:
		 *   // code to be executed
		 *   break;
		 *   
		 *   default
		 *    // code to be executed
		 *    }
		 */

		int dayNumber = 3;
		switch (dayNumber) {
		case 1:
		System.out.println("It is Monday today!");
		break;
		
		case 2:
			System.out.println("It is Tuesday today!");
			break;
		case 3:
			System.out.println("It is Wednesday today!");
			break;
		case 4:
			System.out.println("It is Thursday today!");
			break;
		case 5:
			System.out.println("It is Friday today!");
			break;
		case 6:
			System.out.println("It is Saturday today!");
			break;
		case 7:
			System.out.println("It is Sunday today!");
			break;
			
			default:
				System.out.println("Sorry it is not a day");
		
		}
	}

}
