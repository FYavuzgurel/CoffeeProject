
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucsCustomerManager(new CustomerCheckManager());		//BaseCustomerManager abstract olduðu için newlenemez.Polimorfizm kullandýk
		customerManager.Save(new Customer(0,"Fatih","Gurel","431",1994));
		//customerManager.Save(new Customer());
	}
}
