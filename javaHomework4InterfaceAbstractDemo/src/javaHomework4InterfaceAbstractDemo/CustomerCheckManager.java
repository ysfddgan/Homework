package javaHomework4InterfaceAbstractDemo;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}