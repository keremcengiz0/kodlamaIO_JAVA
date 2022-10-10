package dayThirdHomework.part8.staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static yapici blok calisti");
	}

	public ProductValidator() {
		System.out.println("Yapici blok calisti");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void bisey() {
	}

	public class BaskaBirClass {
		public static void sil() {

		}
	}
}
