
public class Array_Explained {

	public static void main(String[] args) {
	/* 	

https://introcs.cs.princeton.edu/java/14array/
Arrays in Java. Making an array in a Java program involves three distinct steps:
			Declare the array name.
			Create the array.
			Initialize the array values. */ 
		
	// 	printing 2D arrays: https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF
		

		double[] a;                    // declare the array
		a = new double[10];             // create the array
		for (int i = 0; i < a.length; i++) {    // elements are indexed from 0 to n-1
			for (int j = 0; j < a.length; j++) {
				a[j]++;
			} // initialize all elements to 0.0
	 
		System.out.println(a[i]);}
		
		
        
        int[] values= new int[6]; 
        
        System.out.println(values[0]);
        
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        
        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        
        int[] numbers = {5, 6, 7};
        
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

	}

}
