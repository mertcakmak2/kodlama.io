import java.rmi.RemoteException;
import java.sql.Date;

import Abstract.IEntity;
import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws Exception {		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("mert");
		customer.setLastName("Çakmak");
		customer.setDateOfBirth(1998);
		customer.setNationalityId(0000000L);
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		//BaseCustomerManager baseCustomerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.Save(customer);
	}

}
