package kodlamaIOApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data + " Logged to file");
	}

}
