package javaHomework4InterfaceAbstractDemo;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db"+customer.firstName);
		
	}

}
