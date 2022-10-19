package layeredArchitecture.business;

import java.util.List;
import layeredArchitecture.entities.Category;
import layeredArchitecture.dataAccess.CategoryDao;
import layeredArchitecture.logging.BaseLogger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger[] loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		categories = categoryDao.fetchCategories(); 
	}
	
	public void add(Category category) throws Exception {
		if(categories.stream().anyMatch(c -> c.getName().equalsIgnoreCase(category.getName()))) {
			throw new Exception("Category name can't be same.");
		}
		
		categoryDao.add(category);
		
		for(BaseLogger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
