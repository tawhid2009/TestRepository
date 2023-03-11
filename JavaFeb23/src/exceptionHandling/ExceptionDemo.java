package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("Let us figure out an exception");
			String[] name = {"ProSmart", "Java", "Selenium", "Eclipse"};
			
			System.out.println(name[4]);
		}
		catch(Exception e) {
			
			System.out.println("Exception occured!" + e.getMessage());
			System.out.println("Exception occured!" + e.getStackTrace());
			System.out.println("Exception occured!" + e.getCause());
			
			System.out.println("O my God!! I could handle one");
		}
//Here we can write another line using "finally", it works like "default" in Switch statement or "else" 
		//in if else statement.

	}

}
