package kodlamaIOApp;

import kodlamaIOApp.business.CategoryManager;
import kodlamaIOApp.business.CourseManager;
import kodlamaIOApp.core.logging.DatabaseLogger;
import kodlamaIOApp.core.logging.FileLogger;
import kodlamaIOApp.core.logging.Logger;
import kodlamaIOApp.dataAccess.HibernateCategoryDao;
import kodlamaIOApp.dataAccess.HibernateCourseDao;
import kodlamaIOApp.dataAccess.JdbcCourseDao;
import kodlamaIOApp.entities.Category;
import kodlamaIOApp.entities.Course;
import kodlamaIOApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		//Course course1 = new Course(1,"Yazilim gelistirme kampi (java)",100);
		//Course course2 = new Course(2,"Yazilim gelistirme kampi (.Net)",50);
		//Course course2 = new Course(2,"Yazilim gelistirme kampi (.Net)",-50);
		//Course course3 = new Course(3,"Yazilim gelistirme kampi (C#)",0);

		Category category1 = new Category(1,"Backend");
		Category category2 = new Category(2,"Frontend");
		
		Category[] categories = new Category[] {new Category(3, "Otomasyon")};
		//Course[] courses = new Course[] {new Course(3,"Yazilim gelistirme kampi (C#)",20)};
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		//CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		//CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
		//CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(), loggers);

		//courseManager.add(course1, courses);
		//courseManager.add(course2, courses);
		//courseManager1.add(course1, courses);
		//courseManager1.add(course2, courses);
		//courseManager2.add(course3, courses);
		//System.out.println(course3.getPrice());
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1, categories);
	}

}
