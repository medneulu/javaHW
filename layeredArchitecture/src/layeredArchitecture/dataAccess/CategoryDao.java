package layeredArchitecture.dataAccess;
import java.util.List;

import layeredArchitecture.entities.Category;

public interface CategoryDao {
	public void add(Category category);

	public List<Category> fetchCategories();
}
