// Java program to illustrate enhanced for loop source: https://www.geeksforgeeks.org/loops-in-java/
public class enhancedforloop 
{ 
    public static void main(String args[]) 
    { 
        String array[] = {"Ron", "Harry", "Hermoine"}; 
  
        //enhanced for loop 
        for (String x:array) 
        { 
            System.out.println(x); 
        } 
  
       //  for loop for same function 
        for (int i = 0; i < array.length; i++) 
        { 
            System.out.println(array[i]); 
        } 
        
    } 
} 