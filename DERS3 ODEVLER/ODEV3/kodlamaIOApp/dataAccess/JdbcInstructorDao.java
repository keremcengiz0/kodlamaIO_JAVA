package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanina eklendi");
	}

}
