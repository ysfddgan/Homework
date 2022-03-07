package javaHomework4InterfaceAbstractDemo;

public class Customer implements Entity {
	int id;
	String firstName;
	String lastName;
	int dateOfBirth;
	String nationalityId;
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
}
