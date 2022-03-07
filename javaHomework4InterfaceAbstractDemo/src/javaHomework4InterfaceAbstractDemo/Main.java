package javaHomework4InterfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Yusuf","Doðan",1993,"15"));

	}

}
