import java.util.HashMap;

public class HashMapping {


		public static void start() {
			
			HashMap<String, String> information = new HashMap<String, String>();
			information.put("1", "1st"); 
			information.put("2", "2nd");
			information.put("3", "3rd");
			information.put("4", "This is the data");
			
			System.out.println(information);
		}
		public static void main(String[] args) {
			
			start(); 
			
}
	}
