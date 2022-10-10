package kodlamaIOApp.business;

import kodlamaIOApp.core.logging.Logger;
import kodlamaIOApp.dataAccess.CourseDao;
import kodlamaIOApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course, Course[] courses) throws Exception{
		for (Course course1 : courses) {
			if(course1.getName() == course.getName()) {
				throw new Exception("Ayni isimde farkli bir kurs bulunamaz!");
			}
			if(course.getPrice() < 0) {
				throw new Exception("Kurs fiyati 0'dan kucuk olamaz!");
			}
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
	}
	
}
