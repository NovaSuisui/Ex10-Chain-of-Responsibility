public class ConsoleHandler extends Handler {
	@Override
    public void displayLog(Log log) {
        if (log.getLogType().equals("Console")) {
            if (log.getLogLevel().equals("INFO")) {
                System.out.println("Standard Console::Logger: This is an information.");
            } else if (log.getLogLevel().equals("DEBUG")) {
                System.out.println("Standard Console::Logger: This is a debug information.");
            } else if (log.getLogLevel().equals("ERROR")) {
                System.out.println("Standard Console::Logger: This is an error information.");
            } else {
                System.out.println("Level not supported");
            }
        } else if (next != null) {
            next.displayLog(log);
        } else {
            System.out.println("Type not supported");
		}
	}
}
