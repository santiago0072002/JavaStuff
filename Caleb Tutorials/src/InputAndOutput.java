import java.util.Scanner; 
public class InputAndOutput {
/* public static class Test2{
	private static void NumExp() {
		System.out.println("testNUMEXP");
		
	} */ 



	public static void main(String[] args) {
		new User(); 
		User user = new User(); 
		user.firstName = " Hector"; 
		user.lastName = " Santiago"; 
		System.out.println(user.getFullName());
		
		new Test2();                  // to read from another file i have to tell the file where to read too, i am telling it to read from the file Test2
		Test2.NumExp();  // by telling it that there is a new class called Test2(); inside the class there is a method called NumExp. 
		               // to read from another file i have to tell the file where to read too, i am telling it to read from the file Test2
		
		// when I use new Test2(); I am declaring a new class in the file, the compiler looks for it and go there. 
		
		
		new NumExpresions();   // this again is how you open the class NumExpressions which not here but it is in the same package. 
		NumExpresions.NumExp(); // this is calling the Method NumExp() and then the method NumExp do whatever it does. 

		// type identifier = new type()
	// type name then new type (then a constructor to give us an instance of this class) 
		
		new StringsPractice(); // calling another class, remember if you fucked up one letter is not going to work, you have to write down everything the same exact way to the teeth. 
		StringsPractice.check(); 

		Scanner scanner = new Scanner(System.in); // this is how you declare your own class scanner
		
		
		
		System.out.println("What is your name? ");
// 		String name = scanner.nextLine(); 				// this is how you get a line of String using the scanner class with the nextline method. 
		
// 		System.out.println("Hello " + name);			// this is how you print a line 
		
		
		
		String string = new String("This is a String"); // different ways to declare and initialize a string 
		
		String easier = " Wow that was easy " + string; // different ways to declare and initialize a string 
			
		System.out.println(string + " :-) " + easier); // output the variable string + literal :-) + the value of string easier. 
// 		scanner.close(); 
		
		int x = 5; // primitive
		Integer y =5; // Object (5 is autoboxed) 
		
		x = 10; // reassinign the value. 
		
		boolean isPizzaDelicious = true; 
		byte b = 127; 
		char c = 'Z'; 
		short s = 32767; // it is used for short numbers 
		int i = 5; 
		long er = 12343L; // store a big number
		float f = 12.4f; 
		double d = 20.6; 
		
		
		// bigdecimal is better to use when it comes to dealing with money. 
	 final double X = 3.14159; // this is a constant it does not change. 
		
		// constant - uses the keyword final
		
		// variable creation 
		// 1. declare
		// 2. initialize
		
		// primitive types bolean, byte, char, long, float,double, int 
		// Object - instance of a class (class meaning the data type) so for example String is the data type, string is the instance of class String
		
		
		// typecasting - forcing the data to do something else. 
		// data type = the type of the data. How the computer interpret the data. 
		// statically - variables are given data types upfront 
		// dynamically type - variables without the types
		// literal - the value
		
		// variable - stores some value
		// expression - evaluates the value
		// class - constains everything - has members
		// methods - do something- we passs arguments 
		// arguments is what you pass to a method/ part of the calling (WHen we call a method we give it arguments) 
	
		// parameter - store the variable of the arguements, when we define a method we give it parameters (part of of definition of a method) 
		// statement - telling the computer something 
		// properties - store something
		
		// access modifier (public) who can use it
		// static - No instance class is needed 
		// object - instance of a class. 
	 // concatening strings means combining two strings together.
	   // String.format basically does the samething as printf but using the println source = tutorial 14, caleb curry. 
     // the .lenght(); method return how many charachters are in a string for example if I saay String name = "hector" 
     // if i say name.lenght(); the number i should get back should be 5. 
	 
	 // the index of method tells  you where it was found in the string. caleb tutorial 15. 
	 // .lastIndexOf(); tells you the last occurrence. 
	}


}


