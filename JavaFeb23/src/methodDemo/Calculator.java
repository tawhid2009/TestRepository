package methodDemo;

public class Calculator {

	//Void method can also have arguments inside the parenthesis.
//- "Death code" is when Compiler can not reach any line of code, that is a "Death code". ex. in value
	//returning method, after return line (ex. return sum), if u write a correct line of code, may be syso,
	//then print something, but it will not print, even though code is correct(syso), because it can not be 
	//reach by the Compiler. That's the "Death code".
//- Global variable are accessible from all parts of a program(Global variables are visible to many classes  
	//who can manipulated the data then), while Local variables accessible within a programming construct such 
	//as loop, function or procedure.
//- Access modifiers are keywords that can be used to control the accessibility/visibility of methods, classes,
	//interfaces, variables, constructors. The four access modifier in Java are "Public" "Protected" "Default" 
	//and "Private". ("Default" access modifier is when we do not declare an access modifier for a method, class,
	//etc, like when we don't use "Public", it's Default and there are some limitation to Default access 
	//modifier, ex. if we don't declare a Class "Public", it can not be access from outside the package).
	
	public int doAdd(int a, int b) {
		
		int c = a + b;
		
		return c; //u can not write anything after this line
	}
	
    public int doSub(int a, int b) {
    	
    	int c = a - b;
    	
    	return c;
    }
    public String concatStr(String a, String b) {
    	
    	String c;//declaring a String type variable
    	c = a +" "+ b;//assigning value to c variable. it's same as "String c = a +" "+ b";
    	return c;
    	
    }
    public static int do3Mu1(int a, int b, int c) {
    	
    	int result = a * b * c;
    	
    	return result;
    }
}
