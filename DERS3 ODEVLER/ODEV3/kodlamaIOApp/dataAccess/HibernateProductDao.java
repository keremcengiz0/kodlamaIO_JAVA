package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Instructor;

public class HibernateProductDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

}
