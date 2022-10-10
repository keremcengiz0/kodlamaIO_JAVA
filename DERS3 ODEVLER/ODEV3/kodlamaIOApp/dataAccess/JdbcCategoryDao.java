package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanina eklendi");
	}

}
