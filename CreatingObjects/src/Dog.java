
public class Dog {
	
	private String name; 
	private int size; 
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) { // for everything to work the setters and getters have to be set up this way/ 
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	
	void bark()
	{
		
		
		if(size >=10 && size < 20) // to execute this if statements both code blocks got to be true. otherwise the code is not going to work. 
		{
			System.out.println(" Woof! Woof!");
	
		} 
		
		else if(size >=20 && size <30) 
		{
			System.out.println(" GRUUFF! GROoof!"); 
		}
		else {
			System.out.println("Yeep! Yeep!");
		}
	}

	public static void main(String[] args) {
	Dog[] myDogs = new Dog[3];  // This piece of code is creating a new Object called my Dogs, 3 of them. 
	myDogs[0]=new Dog(); // This piece of code is creating a new Object called my Dogs, 1 of the 3 of them. 
	myDogs[0].setName("Dog 1"); // this is setting the name for dog1
	myDogs[0].setSize(12);  // this is setting the size for dog1
	myDogs[0].bark(); // this is telling the dog to bark/ 
	
	
	myDogs[1]=new Dog();
	myDogs[1].setName("Dog 2"); 
	myDogs[1].setSize(27); 
	myDogs[1].bark();
	
	myDogs[2]=new Dog();
	myDogs[2].setName("Dog 3"); 
	myDogs[2].setSize(4); 
	myDogs[2].bark();
	
	System.out.println(myDogs[0].getName()); // this prints the name of dog1
	System.out.println(myDogs[0].getSize());// this prints the size of dog1 

	}

}
