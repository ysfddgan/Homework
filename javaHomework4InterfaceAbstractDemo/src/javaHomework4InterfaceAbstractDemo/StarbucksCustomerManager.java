package javaHomework4InterfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public void save(Customer customer) {
		System.out.println("Saved to db"+customer.firstName);
	}
	
}
