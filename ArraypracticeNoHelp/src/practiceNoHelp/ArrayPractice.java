package practiceNoHelp;

// example how to this is very good link!! ; https://www.iitk.ac.in/esc101/05Aug/tutorial/java/data/arraybasics.html

public class ArrayPractice {

	public static void main(String[] args) {

int[] n = new int[10]; // declare and create array of 10 elements called n. 
n[2]= 10; // initialize element number 3 to 10 


for (int i=0; i<n.length; i++) {			// print all elements of the array, the only one initialized is element number 3 to 10. so all of them when
	// i print them should print to zero because none are initialize. this is so awesome! 
	System.out.println(n[i]);
}

int y[]; // declare and integer array called y. 
y = new int[10]; // create the array called y of 10 elements. 

// below the next code is going to assign a value to each element of array y. 

for (int i=0; i<y.length; i++) {
	y[i]=i; 								// assign each value of i to each element of array i and then print each element value in the line below. 
	System.out.println(y[i] + " ");
}


	}

}
