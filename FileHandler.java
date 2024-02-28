public class FileHandler extends Handler {
    @Override
    public void displayLog(Log log) {
        if (log.getLogType().equals("File")) {
            if (log.getLogLevel().equals("INFO")) {
                
            } else if (log.getLogLevel().equals("DEBUG")) {
                System.out.println("File::Logger: This is a debug information.");
            } else if (log.getLogLevel().equals("ERROR")) {
                System.out.println("File::Logger: This is an error information.");
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
