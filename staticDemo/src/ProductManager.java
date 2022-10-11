
public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if (validator.isValid(product)) {
			System.out.println("Added");
		}else {
			System.out.println("Product information is invalid");
		}
	}
}
