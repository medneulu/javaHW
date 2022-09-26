
public class Main {

	public static void main(String[] args) {

		Product product = new Product("Laptop", "11th Gen Asus Laptop", 4500, 23, 1, "black");
		product.setName("Laptop");
		product.setPrice(4500);
		product.setId(1);
		product.setDescription(" 11th Gen Asus laptop ");
		product.setStockAmount(23);
		product.getId();
		product.getCode();
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
		
	}
}
