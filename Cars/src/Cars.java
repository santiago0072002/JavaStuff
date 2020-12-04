import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * Use a one-dimensional array to solve the following problem: 
 * A company pays its salespeople on a commission basis. 
 * The salespeople receive $200 per week plus 9% of their 
 * gross sales for that week. 
 * For example, a salesperson who grosses $5,000 in sales in a week 
 * receives $200 plus 9% of $5,000, or a total of $650. 
 * Write an application (using an array of counters) 
 * that determines how many of the salespeople earned 
 * salaries in each of the following ranges 
 * (assume that each salesperson’s 
 * salary is truncated to an integer amount):
 * 
 */
public class Cars {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] total = new int[11]; 
		
		
		   double Salary;

		   System.out.printf("Enter the employee sale Amount ( -1 to end ): ");
		  double sale = input.nextDouble();

		   while ( sale != -1 )
		   { 

			   Salary = sale * 0.09 + 200;
		      System.out.printf( "Employee Commission is $%.2f\n", Salary );
		      
		     
		      if ( Salary >= 200 && Salary < 1000)
		         ++total[ ( int ) Salary / 100 ];
		      else if ( Salary >= 100 )
		         ++total[ 10 ];
		      
		      System.out.printf("Enter the employee sale Amount ( -1 to end ): ");
		      sale = input.nextDouble();
		   }

		   System.out.printf( "\nEmployees in the range:\n" );
		   System.out.printf( "$200-$299 : %d\n", total[ 2 ] );
		   System.out.printf( "$300-$399 : %d\n", total[ 3 ] );
		   System.out.printf( "$400-$499 : %d\n", total[ 4 ] );
		   System.out.printf( "$500-$599 : %d\n", total[ 5 ] );
		   System.out.printf( "$600-$699 : %d\n", total[ 6 ] );
		   System.out.printf( "$700-$799 : %d\n", total[ 7 ] );
		   System.out.printf( "$800-$899 : %d\n", total[ 8 ] );
		   System.out.printf( "$900-$999 : %d\n", total[ 9 ] );
		   System.out.printf( "Over $1000: %d\n", total[ 10 ] );

	
		}
		
	      
	          }
	        