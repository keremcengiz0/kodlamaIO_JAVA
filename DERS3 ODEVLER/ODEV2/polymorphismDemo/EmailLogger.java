package dayThirdHomework.hw1.part2.polymorphismDemo;

public class EmailLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to email: " + message);
	}
}
