
public class Shirt {

	public static char getSize() {
		return size;
	}

	public static String getColor() {
		return color;
	}
	public static char size; 
	public static String color; 
	
	Shirt(){
		
	}
	
	Shirt(String Newcolor, char Newsize){
		color = Newcolor; 
		size = Newsize; 
	}
	
	// Shirt(){
	//	System.out.println("Inside the Constructor");
// 	}
	
	public static void putOn() {
		System.out.println("Shirt on!");
	}
	
	public static void takeOff() {
		System.out.println("shirt off");
	}
	public static void setColor(String newColor) {
		color = newColor; 
	}
	public static void setSize(char newSize) {
		size = newSize; 
	}
}
