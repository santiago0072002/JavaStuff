import java.util.Scanner; 
public class StringsPractice {
	public static void check() {
		String x = " THis is my String \n"; 
				System.out.println(x.charAt(x.length()-5));// this is going to print the t it grab the letters backwards one at a time. 
				
				System.out.println(x.charAt(0));
				System.out.println(x.charAt(1));
				System.out.println(x.charAt(2));
				System.out.println(x.charAt(3));
				System.out.println(x.charAt(4));
				System.out.println(x.charAt(5));
				System.out.println(x.charAt(6));
				System.out.println(x.charAt(7));
				System.out.println(x.charAt(8));  // the charAt() method grab any letter from whatver i tell it too. 
				
				// if i want to make the letters all upper case type the method .toUpperCase(); see example below. 
				
				System.out.println(x.toUpperCase());
				
				// to make everything to lower case just use .toLowerCase(); 
				System.out.println(x.toLowerCase());
				
				// to erase white space use the .strip method, you can use the .stripLeading() method to remove white space at the begining or stripTrailing() at the end to remove white space at the end. 
				System.out.println(x.strip());
				// to grab part of a string you got to use the substring() method, you got to give it index values of characters arguements. 
				// so if i want to grab the word "my"  from " This is my string " i would have to type x.substring(8, 11) see below example. 
				System.out.println(x.substring(8, 11));
				// if i want to grab a string and repeat it use the .repeat() method. just give it a number of how many times you want to repeat it. 
				System.out.println(x.repeat(15));
				// the .equals() method will compare strings and it would return a true or false if the values of the strings are the same. example 
				System.out.println(x.equals("yes")); // this would return false becuase x is not equal " Yes. 
				System.out.println(x.equals(" THis is my String \n")); // this line would return true becuause everything is typed exactly that way that the it is inputed, change one letter and it would be a different thing. 
				// the equals can eb used for passwords caleb explain a password guess game here is the code. 
				
				String password ="password"; 						// set the password for variable password/ 
			
				Scanner scanner = new Scanner (System.in); 
				
				System.out.println("Please enter the password");
				String guess = scanner.nextLine(); 
				System.out.println(password.equals(guess));// this is just going to show true or false based on what the user entered. 
				if(guess.equals(password)){
					System.out.println("print this code");
				}
				else {
					System.out.println("print from this line which is the else means false. ");
				}
				
				// there is info on Strings comparison here in Stack overflow. https://stackoverflow.com/questions/968347/can-a-java-file-have-more-than-one-class
				}
}
