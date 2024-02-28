public class ErrorHandler extends Handler {
    @Override
    public void displayLog(Log log) {
        if (log.getLogType().equals("Error")) {
            if (log.getLogLevel().equals("INFO")) {
                
            } else if (log.getLogLevel().equals("DEBUG")) {
                
            } else if (log.getLogLevel().equals("ERROR")) {
                System.out.println("Error Console::Logger: This is an error information.");
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
