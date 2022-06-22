
public class StarbucsCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _iCustomerCheckService;//initialize etmek
	
	public StarbucsCustomerManager(ICustomerCheckService iCustomerCheckService) {
		this._iCustomerCheckService = iCustomerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
			
		if(_iCustomerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Kiþi doðrulanamadý !!!");
		}
	}
	
}
