package parser_class;


/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 17:03
 */

class Address {
	String streetAddress;
	String city;
	String state;
	String postalCode;
	
	@Override
	public String toString(){
		return streetAddress + " - " + city + " - " + state + " - " + postalCode ;
	}
}

class PhoneNumber {
	String type;
	String number;
	
	@Override
	public String toString(){
		return type + " - " + number;
	}
}

public class JSONData {

	String firstName;
	String lastName;
	String age;
	// streetAddress; city; state; postalCode
	Address address;
	// type; number
	PhoneNumber[] phoneNumbers;
	
	@Override
	public String toString(){
		return firstName + " - " + lastName + " - " + age;
	}
}
