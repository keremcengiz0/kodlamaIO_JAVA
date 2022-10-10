package dayThirdHomework.part8.staticDemo;

public class ProductManager {

	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		// if (validator.isValid(product)) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println(product.name + " Eklendi");
		} else {
			System.out.println("Urun bilgileri gecersiz");
		}
		
		//ProductValidator productValidator = new ProductValidator();
		//productValidator.bisey();
	}
	
}
