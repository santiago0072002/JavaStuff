import java.util.*;
public class ArrayAddition {
	// O(nlog(n)) | O(1) space
	static class Program {
		public static int[] twoNumberSum(int[] array, int targetSum) {
	  // first we sort the array
			Arrays.sort(array); 
			// then declare two variables, the variables are going to be used for the index
			int left = 0; 
			int right = array.length - 1; 
			while (left < right) {
				int currentSum = array[left] + array[right]; // variable declaration in this line
				if (currentSum == targetSum){
					return new int[] {array[left],array[right]};
				} 
				else if(currentSum < targetSum){
					left++; // this means add one to the variable left
				}
				else if ( currentSum > targetSum){
					right--; 
				}
					
				}
			 return new int[0];
			}
	   
	

	public static void main(String[] args) {
	
		int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6}; 
		int myMajicNumber = 10; 
		int[] result=twoNumberSum(array, myMajicNumber); 
		System.out.println(twoNumberSum(array, myMajicNumber)); 
		
		// for some reason this is printing the address of the array and not the actual array. 
		// so even after changing the printline to result on line 34 still prints the address. 		
		

	}

	}
}