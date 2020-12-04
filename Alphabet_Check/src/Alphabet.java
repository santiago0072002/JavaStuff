import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
    	
	    System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

    	
    	System.out.println("Enter any letter or Character and I will tell you if is part of the alphabet or not!");
    	
    	Scanner scanner = new Scanner(System.in);
    	String str = scanner.next(); 
    	char c = str.charAt(0); 

       

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is in the alphabet.");
        else
            System.out.println(c + " is not in the alphabet.");
    }
}