package layeredArchitecture.entities;

public class Instructor {
	private int id;
	private String name;
	private String imageUrl;
	
	public Instructor(int id, String name, String imageUrl) {
		this.id = id;
		this.imageUrl = imageUrl;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
