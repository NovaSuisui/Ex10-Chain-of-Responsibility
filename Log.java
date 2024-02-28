public class Log {
    private final String logType;
	private final String logLevel;
	
	public Log(String logType, String logLevel){
		this.logType = logType;
		this.logLevel = logLevel;
	}

	public String getLogType() {
		return logType;
	}

	public String getLogLevel() {
		return logLevel;
	}
}
