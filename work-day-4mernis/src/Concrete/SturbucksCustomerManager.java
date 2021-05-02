package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerService;
	
	public SturbucksCustomerManager(ICustomerCheckService customerService) {
		this.customerService = customerService;
	}

	@Override
	public void Save(Customer customer) throws Exception {
		if(customerService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db starbucks: "+customer.getFirstName());
		} else {
			throw new Exception("Not valid person");
		}
	}

}
