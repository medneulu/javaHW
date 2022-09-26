
public class Product {
	
	public Product(String name, String description, double price, int stockAmount, int id, String color){
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmount;
		this._id = id;
		this._color = color;
		
		System.out.println("Constructor block has run");
	}
	
	public Product() {
		
	}

	// Attribute | field
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private int _id;
	private String _color;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		this._color = color;
	}

	public String getCode() {
		return this._name.substring(0, 1) + _id;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

}
