
public class If_Project_taking_user_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Some useful conditions:
        System.out.println(5 == 5);
        System.out.println(10 != 11);
        System.out.println(3 < 6);
        System.out.println(10 > 100);
        
        // Using loops with "break": 
        int loop = 0;
        
        while(true) {
            System.out.println("Looping: " + loop);
            
            if(loop == 5) { // this will break out of the loop once it gets to 5. 
                break; // great example to understand how loops works, also use the debuger and
            }			// use the step over method
            
            loop++;
        
            System.out.println("Running");
        }

	}

}
