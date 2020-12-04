/*
 * 
 * https://unicode-table.com/en/#basic-latin
 * using Unicode charracters in Java.source
 *  https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/15428818#overview
 */
public class CharBoolean {

	public static void main(String[] args) {
		 char myChar = 'D';
	        char myUnicodeChar = '\u0044'; // using unicode meaning the table. 
	        System.out.println(myChar);
	        System.out.println(myUnicodeChar);
	        char myCopyrightChar = '\u00A9';
	        System.out.println(" myCopyrightChar" + myCopyrightChar );
	        boolean myTrueBooleanValue = true;
	        boolean myFalseBooleanValue = false;

	        boolean isCustomerOverTwentyOne = true;
	        
	        boolean isAlien = false;
	        if (isAlien == false) {
	            System.out.println("It is not an alien!");
	            System.out.println("And I am scared of aliens");

	}

}
}