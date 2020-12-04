import java.text.NumberFormat;
import java.util.Locale; 

public class CurrencyFormatting {

	public static void main(String[] args) {
		
		Double number = 1500D; 
		
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US); 
		String currency = format.format(number); 
		System.out.println(" Currency in US : " + currency);
		
		
	     format = NumberFormat.getCurrencyInstance(Locale.GERMANY); 
		currency = format.format(number); 
		System.out.println(" Currency in Germany : " + currency);
		
		// TODO Auto-generated method stub

	}

}
