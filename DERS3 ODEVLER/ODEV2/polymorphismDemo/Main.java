package dayThirdHomework.hw1.part2.polymorphismDemo;


public class Main {

	public static void main(String[] args) {

		//EmailLogger logger = new EmailLogger();
		// logger.log("Log mesaji");

		//DatabaseLogger dblogger = new DatabaseLogger();
		// dblogger.log("Log mesaji");

		//FileLogger flogger = new FileLogger();
		// flogger.log("Log mesaji");

		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),
		 * new DatabaseLogger(),new ConsoleLogger()};
		 * 
		 * for(BaseLogger logger : loggers) { loggerlLog("Log mesaji"); }
		 */
		
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}
}
