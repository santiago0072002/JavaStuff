// source is here. https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435764#questions

public class Main {
	public static void main(String[] args) {
		int[] intArray = new int[]{20,35,-15,7,55,1,-22, 34, 19}; // declared array 
		for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {// this code is how you start the bubble sort, var=array.lenght-1,var is >0 , var-- to go down in the outer loop.   
			for(int i = 0; i < lastUnsortedIndex; i++) {
				if(intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i +1); 
				
				}
			}
		}
	for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		} 
	}
	
	public static void swap(int[] array, int i, int j) {
		if (i == j) { // there is nothing else to do. 
			return; 
		}
		int temp = array[i]; // if I != to J then we are going to create a temp variable and temp will now contain the variable of array i; 
		array[i]= array[j]; // then we are going to assing the value of array[j] to array[i]
		array[j] = temp; // then we are going to assign them to array J. 
	}
}
