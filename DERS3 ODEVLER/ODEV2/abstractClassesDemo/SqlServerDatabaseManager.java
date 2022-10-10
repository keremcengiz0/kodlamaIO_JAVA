package dayThirdHomework.part5.abstractClassesDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager {

	@Override
	public void getData() {
		System.out.println("Veri getirildi : Sql Server");
	}

}
