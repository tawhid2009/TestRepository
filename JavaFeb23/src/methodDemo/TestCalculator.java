package methodDemo;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("Addition of a and b is: " + calc.doAdd(25, 12));
		
		System.out.println("value of a - b is: " + calc.doSub (83, 12));

		System.out.println(calc.concatStr("hellow", "I m learning Java and it's fun!!"));
		
		TestCalculator obj = new TestCalculator();//if we don't create object, it will not work because
		                   //it's non static method in same class, called in static method(main method).
		System.out.println(obj.doMu1(54, 95));
		
		System.out.println(doDiv(34, 7));//here we don't have to create object because a static method called another static method.
	
		obj.sound();
		obj.dogSound();
		
		Calculator.do3Mu1(4, 722, 67);
	}
	
	public int doMu1(int a, int b) {//public int doNu1(int a, int b)
		                            //int c = a * b;
		                          //syso("I am doing action in do3Modul class"); //printing is just for u.
		                            //return c;
		
		int c = a+b;
		return c;
	}
	
	public static double doDiv(int a, int b) {
		double c = a/b;
		return c;
	}
	
	public void sound() {//void method can also have argument. like, public void sound(String a, String b)
		      //syso(a + b);  we don't return anything. parameter and return type don't have any relation.
		System.out.println("This is a generic sound");
	}
	
	public void dogSound() {
		sound();//within the same class, in a non static method, u can called another non static method.
		System.out.println("I also make dog sound");
	}
}
