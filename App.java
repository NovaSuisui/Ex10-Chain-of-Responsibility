public class App {

	public static void main(String[] args) {
		Log log = null;
		Handler handler = new Handler();
		Handler consoleHandler = new ConsoleHandler();
		Handler fileHandler = new FileHandler();
		Handler errorHandler = new ErrorHandler();

		fileHandler.setHandler(consoleHandler);
		errorHandler.setHandler(fileHandler);
		handler.setHandler(errorHandler);

		log = new Log("Console", "INFO");
		handler.displayLog(log);
		log = new Log("Console", "DEBUG");
		handler.displayLog(log);
		log = new Log("Console", "ERROR");
		handler.displayLog(log);
		
		log = new Log("File", "INFO");
		handler.displayLog(log);
		log = new Log("File", "DEBUG");
		handler.displayLog(log);
		log = new Log("File", "ERROR");
		handler.displayLog(log);

		log = new Log("Error", "INFO");
		handler.displayLog(log);
		log = new Log("Error", "DEBUG");
		handler.displayLog(log);
		log = new Log("Error", "ERROR");
		handler.displayLog(log);
	}

}
