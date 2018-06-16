package lab6;

/**
 * <p> Title: The PhoneBookEntry Class</p>
 *
 * <p> Description: This class will represent a single math problem
 * that can be addition or subtraction. Operands will be also randomly
 * generated within given range. It also provides the answer of the problem
 * </p>
 *
 * @author Hamin Choi Student (N00765091@students.ncc.edu)
 */

public class PhoneBookEntry {
	//instance variables
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String birthDate;
	private char relationship;
	
    /**
     * PhomeBookEntry method -- default constructor. it instantiates 
     * all of the instance variables as default. 
     */
	
	public PhoneBookEntry() {
		firstName = "None";
		lastName = "None";
		phoneNumber = "516-555-5555";
		birthDate = "01/01/2013";
		relationship = 'X';
	}
	
    /**
     * PhomeBookEntry method -- parameterized constructor. it accepts values  
     * for each of the instance variables.
     * @param nameLast = lastName
     * @param nameFirst = firstName
     * @param number = phoneNumber
     * @param dob = birthDate
     * @param relations = relationship
     */
	
	public PhoneBookEntry(String nameLast, String nameFirst, String number, String dob, char relations) {
		firstName = nameFirst;
		lastName = nameLast;
		phoneNumber = number;
		birthDate = dob;
		relationship = relations;
	}
	
    /**
     * toString method -- this method returns the state of the PhoneBookEntry object
     * relationship will be determined in this method.
     * @return a reference to a String object that contains the value of 
     * firstName, lastName, phoneNumber, birthDate, relationship.
     */
	
	public String toString() {
		String relations = "Not Specified";	// variable instantiation
		if (relationship == 'F')	// F = Friend
			relations = "Friend";
		else if (relationship == 'M')	// M = Family Member
			relations = "Family Member";
		else if (relationship == 'B')	// B = Business Associate
			relations = "Business Associate";
		else relations = "Not Specified";
		return new String(lastName + ", " + firstName + "\n" + phoneNumber + "\n" + birthDate +
				"\n" + relations);
	}
		
    /**
     * getFirstname method -- this method returns the state of the 
     * instance variable "firstName."
     * @return value of firstName.
     */
	
	public String getFirstName() {
		return new String("" + firstName);
	}
	
    /**
     * getLastname method -- this method returns the state of the 
     * instance variable "lastName."
     * @return value of lastName.
     */
	
	public String getLastName() {
		return new String("" + lastName);
	}	
	
    /**
     * getPhonenumber method -- this method returns the state of the 
     * instance variable "phoneNumber."
     * @return value of phoneNumber.
     */
	
	public String getPhoneNumber() {
		return new String("" + phoneNumber);
	}
	
    /**
     * getBirthdate method -- this method returns the state of the 
     * instance variable "birthDate."
     * @return value of birthDate.
     */
	
	public String getBirthDate() {
		return new String("" + birthDate);
	}
	
   /**
     * getRelationship method -- this method returns the state of the 
     * instance variable "relationship."
     * @return value of relationship.
     */
		

	public char getRelationship() {
		return relationship;
	}
	
    /**
     * setLastname method -- this mutator method changes the state of  
     * instance variable lastName with parameter from user input.
     * @param newName a string that replaces the value of lastName.
     */
		

	public void setLastName(String newName) {
		lastName = newName;
	}
	
    /**
     * setPhonenumber method -- this mutator method changes the state of  
     * instance variable phoneNumber with parameter from user input.
     * @param newPhone a string that replaces the value of phoneNumber.
     */
		
	public void setPhoneNumber(String newPhone) {
		phoneNumber = newPhone;
	}
	
	/** 
	 * equals - this parameterized method will determine  
	 * that the person from otherBook is same person with method caller.
	 * @param whichbook that decides which person will be determined.
	 * @return a string indicates same person or not the same person.
	 */
	
	public Boolean equals(PhoneBookEntry whichbook) {
		boolean returnMe = false;
		if ((firstName == whichbook.firstName) && (lastName == whichbook.lastName))	
			returnMe = true;
		else returnMe = false;
		return returnMe;
	}
	
	/** 
	 * calculateAge - this method will calculate how old the person will turn on his or
	 * her birthday in the year 2025. 
	 * @return a string indicates the age of the person will be on 2025.
	 */
			
	public String calculateAge() {
		String from = birthDate.substring(6, 10);	// extract year of birth from string birthDate
		int operand = Integer.parseInt(from);	// parses string as integer to calculate
		int standard = 2025;
		int age = 0;
		age = standard - operand;
		return new String(firstName + " " + lastName + " will be " + age + " years old in 2025.");
	}
	
}
