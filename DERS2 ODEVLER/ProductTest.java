package ders1_homework;

public class ProductTest {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,3,"Siyah","L1");
		/*Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("Beyaz");*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
