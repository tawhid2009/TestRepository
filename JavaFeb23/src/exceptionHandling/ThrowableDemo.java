package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Exception handling does not make any sense to me!");
		
		Thread.sleep(3000);
		
		try {
			FileInputStream fis = new FileInputStream("");
		}
		catch(FileNotFoundException e) {
			System.out.println("Please check the filepath");
			e.printStackTrace();
		}
		System.out.println("May be it is something, not sure about the use of it");

	}

}
