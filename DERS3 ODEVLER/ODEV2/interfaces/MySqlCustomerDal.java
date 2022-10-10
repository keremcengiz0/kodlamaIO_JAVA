package dayThirdHomework.part6.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {	
		System.out.println("MySql eklendi");
	}

}
