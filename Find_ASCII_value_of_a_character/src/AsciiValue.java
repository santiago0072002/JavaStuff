import java.util.Scanner; 

public class AsciiValue {

    public static void main(String[] args) {
    	
    	  System.out.println("   J    a   v     v  a ");
          System.out.println("   J   a a   v   v  a a");
          System.out.println("J  J  aaaaa   V V  aaaaa");
          System.out.println(" JJ  a     a   V  a     a");
    	
    	System.out.println("Enter a Character and I will tell you the ASCII representation of it. ");
    	
    	Scanner sc = new Scanner(System.in); 
    	char ch = sc.next().charAt(0);
    	
    	
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}