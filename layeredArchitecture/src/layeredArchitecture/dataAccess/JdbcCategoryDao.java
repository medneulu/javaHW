package layeredArchitecture.dataAccess;

import java.util.List;

import layeredArchitecture.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category " + category.getName() + " added to database using Jdbc");		
	}

	@Override
	public List<Category> fetchCategories() {
		return null;
	}

}
