package lab6;

/**
 * <p> Title: Lab Assignment #6 Writing the PhoneBookEntry Class </p>
 * 
 * <p> Description: This program helps to practice programmer-defined classes  </p>
 * 
 * <p> Due 13 June 18 10:05 am </p>
 * 
 * @author Hamin Choi Student (N00765091@students.ncc.edu)
 */

public class Lab6App {
	public static void main(String[] args) {
		PhoneBookEntry theBook = new PhoneBookEntry();
		System.out.println("Testing default constructor:" + "\n" + theBook.toString() + "\n");
	
		// testing parameterized constructor: 
		PhoneBookEntry theBook1 = new PhoneBookEntry("Smith", "Mary", "631-123-4567", "03/15/1990", 'F');
		System.out.println("Testing parameterized constructor: " + "\n" + theBook1.toString() + "\n");
	
		// testing accessor methods: 
		System.out.println("Testing accessor methods:" + "\n" + "First name: " + theBook1.getFirstName() + 
		"\n" + "Last name: " + theBook1.getLastName() + "\n" +
		"Phone number: " + theBook1.getPhoneNumber() + "\n" + "Date of birth: " + theBook1.getBirthDate() + 
		"\n" + 	"Relationship: " + theBook1.getRelationship() + "\n");
	
    	// testing mutator methods: 
		PhoneBookEntry theBook2 = new PhoneBookEntry();
		theBook2.setLastName("Doe");
		System.out.println("Testing mutator method for the last name on default object: " + "\n" + 
		theBook2.toString() + "\n");
	
		theBook2.setPhoneNumber("516-123-4567");
		System.out.println("Testing mutator method for the phone number on default object: " + "\n"	+ 
		theBook2.toString() + "\n");
		
		// testing equals method: 
		PhoneBookEntry theBook3 = new PhoneBookEntry("Mary", "Smith", "516-572-7383", "04/10/1985", 'B');
		if (theBook3.equals(theBook1) == true)
			System.out.println("Testing equals method: " + "\n" + theBook1.toString() + "\n" + "IS THE SAME PERSON AS" + "\n" + theBook3.toString() + "\n");
		else 
			System.out.println(theBook1.toString() + "\n" + "IS NOT THE SAME PERSON AS" + "\n" + theBook3.toString() + "\n");
	
		//testing calculateAge method: 
		PhoneBookEntry theBook4 = new PhoneBookEntry("Smith", "John", "516-572-7700", "01/20/1995", 'M');
		if (theBook4.equals(theBook1) == true)
			System.out.println( theBook1.toString() + "\n" + "IS THE SAME PERSON AS" + "\n" + theBook4.toString() + "\n");
		else
			System.out.println(theBook1.toString() + "\n" + "IS NOT THE SAME PERSON AS" + "\n" + theBook4.toString() + "\n");
		System.out.println("Testing calculateAge method:" + "\n" +
		theBook2.calculateAge() + "\n" + theBook1.calculateAge() + "\n"
		+ theBook3.calculateAge() + "\n" + theBook4.calculateAge());
	}
}