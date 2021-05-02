package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerService;
	
	public NeroCustomerManager(ICustomerCheckService customerService) {
		this.customerService = customerService;
	}
	@Override
	public void Save(Customer customer) throws Exception {
		if(customerService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db nero: "+customer.getFirstName());
		} else {
			throw new Exception("Not valid person");
		}
	}
 
}
