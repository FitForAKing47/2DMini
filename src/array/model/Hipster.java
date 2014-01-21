package array.model;
/**
 * Creates the Hipster object.
 * @author computer.class
 *@version 1.2 20/11/13 Added getters/setters, overloaded constructor for additional Hipsters, documentation comments.
 */
public class Hipster
{
	/**
	 * The variable name.
	 */
private String name;
/**
 * The name of the Hipster
 */
private String hipsterType;
/**
 * The variable hipsterPhrase
 */
private String hipsterPhrase;
/**
 * The variable hipsterBooks.
 */
private String [] hipsterBooks;
/**
 * Establishes each variable.
 */
public Hipster()
{
	hipsterBooks = new String[5];
	name = "Nathan";
	hipsterType= "Student hipster";
	hipsterPhrase = "Snappy";
	fillTheBooks();
}
/**
 * A helper method to fill the variable books.
 */
private void fillTheBooks()
{
	hipsterBooks[0] = "Physics";
	hipsterBooks[1] = "Nate The Great";
	hipsterBooks[2] = "Magic school bus";
	hipsterBooks[3] = "Elmo";
	hipsterBooks[4] = "";
}
/**
 * Creates a hipster object with the specific parameters to fill in the component data members.
 * @param name
 * @param hipsterType
 * @param hipsterPhrase
 * @param hipsterBooks
 */
public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
{
	this.name = name;
	this.hipsterBooks = hipsterBooks;
	this.hipsterPhrase = hipsterPhrase;
	this.hipsterType = hipsterType;
}
/**
 * Not sure.
 * @return
 */
public Hipster getSelfHipster()
{
	return null;
	
}
/**
 * Getter method to get the name.
 * @return The name of the Hipster.
 * @return
 */
public String getName()
{
	return name;
}
/**
 * Setter method to change the name of the Hipster.
 * @param name The new name value for the Hipster.
 */
public void setName(String name)
{
	this.name = name;
}
/**
 * Getter method for the type for Hipster.
 * @return
 */
public String getHipsterType()
{
	return hipsterType;
}
/**
 * Setter method to change the type of the Hipster.
 * @param hipsterType The new type of the Hipster.
 */
public void setHipsterType(String hipsterType)
{
	this.hipsterType = hipsterType;
}
/**
 * Gettter method for the Hipster phrase.
 * @return
 */
public String getHipsterPhrase()
{
	return hipsterPhrase;
}
/**
 * Setter method to change the type of the Hipster.
 * @param hipsterPhrase The new phrase for the Hipster.
 */
public void setHipsterPhrase(String hipsterPhrase)
{
	this.hipsterPhrase = hipsterPhrase;
}
/**
 * Getter method for the array Hipster books.
 * @return Hipsterbooks.
 */
public String[] getHipsterBooks()
{
	return hipsterBooks;
}
/**
 * Setter method for the array Hipster books
 * @param hipsterBooks The new books for Hipster.
 */
public void setHipsterBooks(String[] hipsterBooks)
{
	this.hipsterBooks = hipsterBooks;
}

}
