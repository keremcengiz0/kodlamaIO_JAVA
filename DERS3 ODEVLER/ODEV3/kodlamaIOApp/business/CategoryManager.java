package kodlamaIOApp.business;

import kodlamaIOApp.core.logging.Logger;
import kodlamaIOApp.dataAccess.CategoryDao;
import kodlamaIOApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category, Category[] categories) throws Exception {
		for(Category category1 : categories) {
			if(category1.getName() == category.getName()) {
				throw new Exception("Ayni isimde baska bir kategori bulunamaz!");
			}
		}
		
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
			
}
