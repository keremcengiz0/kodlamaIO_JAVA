package dayThirdHomework.hw1;

public class CreditManager {

	public void Calculate() {
		System.out.println("Hesaplandi");
	}

	public void Save() {
		System.out.println("Kredi verildi");
	}

	interface ICreditManager {
		void Calculate();

		void Save();
	}

	abstract class BaseCreditManager implements ICreditManager {
		
		@Override
		public abstract void Calculate();

		public void Save() {
			System.out.println("Kaydedildi");
		}

	}

	class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

		@Override
		public void Calculate() {
			System.out.println("Ogretmen kredisi hesaplandi");
		}
	}

	class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

		@Override
		public void Calculate() {
			System.out.println("Asker kredisi hesaplandi");
		}
	}

	public class Customer {

		public Customer() {
			System.out.println("Musteri nesnesi baslatildi");
		}

		public int Id;
		public String city;
	}

	class Person extends Customer {
		public String firstName;
		public String lastName;
		public String tcNo;
	}

	public class Company extends Customer {
		public String companyName;
		public String taxNumber;
	}

	public class CustomerManager {
		private Customer customer;
		private ICreditManager creditManager;

		public CustomerManager(Customer customer, ICreditManager creditManager) {
			this.customer = customer;
			this.creditManager = creditManager;
		}

		public void Save() {
			System.out.println("Musteri kaydedildi");
		}

		public void Delete() {
			System.out.println("Musteri silindi");
		}

		public void GiveCredit() {
			creditManager.Calculate();
			System.out.println("Kredi verildi");
			creditManager.Save();

		}
	}

	public static void main(String[] args) {
		// CustomerManager customerManager = new CreditManager().new CustomerManager(
		// new CreditManager().new Customer(), new CreditManager().new
		// MilitaryCreditManager());
		CustomerManager customerManager = new CreditManager().new CustomerManager(new CreditManager().new Customer(),new CreditManager().new TeacherCreditManager());
		customerManager.GiveCredit();
	}

}