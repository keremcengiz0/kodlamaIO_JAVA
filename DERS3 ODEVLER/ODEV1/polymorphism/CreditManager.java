package dayThirdHomework.hw1.part1.polymorphism;

public class CreditManager {

	public void Hesapla() {
		System.out.println("Hesaplandi");
	}

	public void Save() {
		System.out.println("Kredi verildi");
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

		public CustomerManager(Customer customer) {
			this.customer = customer;
		}

		public void Save() {
			System.out.println("Musteri kaydedildi");
		}

		public void Delete() {
			System.out.println("Musteri silindi");
		}
	}

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		// creditManager.Hesapla();
		// creditManager.Save();

		Customer customer = new CreditManager().new Customer();

		customer.Id = 1;
		//customer.firstName = "Kerem";
		//customer.lastName = "Cengiz";
		//customer.tcNo = "123456";
		customer.city = "Kocaeli";

		CustomerManager customerManager = new CreditManager().new CustomerManager(customer);
		// customerManager.Save(1, "Kerem", "Cengiz", "123456");
		customerManager.Save();
		customerManager.Save();
		customerManager.Save();
		customerManager.Delete();

		Company company = new CreditManager().new Company();
		company.taxNumber = "123321";
		company.companyName = "Arcelik";
		company.Id = 100;
		
		CustomerManager customerManager2 = new CreditManager().new CustomerManager(new CreditManager().new Person());
		
		Person person = new CreditManager().new Person();
		person.tcNo = "123456";
		
		Customer customer1 = new CreditManager().new Customer();
		Customer customer2 = new CreditManager().new Person();
		Customer customer3 = new CreditManager().new Company();

	}

}