package homework1;

/**
 * A class for creating an instance variable and initializing in a constructor.
 * @author ethan
 *
 */
public class FirstCommit 
{
	private String name; 
	
	/**
	 * Constructs a FirstCommit object with a name parameter
	 * @param name the name of the person
	 */
	public FirstCommit(String name)
	{
		this.name = name;
	}
	
	/**
	 * To give a string representation of the FirstCommit object created
	 */
	@Override 
	public String toString()
	{
		return this.name;
	}
}
