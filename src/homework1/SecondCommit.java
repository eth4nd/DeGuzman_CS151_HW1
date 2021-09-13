package homework1;

/**
 * A class for making a main method that will create an object 
 * from the FirstCommit class and print the value of instance variable 
 * of the object.
 * @author ethan
 *
 */
public class SecondCommit extends FirstCommit
{

	/**
	 * Constructor that accesses the name variable of the FirstCommit parent class.
	 * @param name name of the person
	 */
	public SecondCommit(String name)
	{
		super(name);
	}
	
	/**
	 * Creates an object of the FirstCommit class and prints its name.
	 * @param args
	 */
	public static void main(String[] args)
	{
		FirstCommit object = new FirstCommit("Ethan");
		System.out.println(object);
	}
	
}
