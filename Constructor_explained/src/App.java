class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);// calling third constructor

		System.out.println("Constructor running!"); // this is going to print after calling the third constructor inside the default constructor. 
	}

	public Machine(String name) {
		this(name, 0);

		System.out.println("Second constructor running");
		// No longer need following line, since we're using the other constructor above.
		// this.name = name;
	}

	public Machine(String name, int code) {

		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class App {
	public static void main(String[] args) {
		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Bertie");

		Machine machine3 = new Machine("Chalky", 7);
	}

}

