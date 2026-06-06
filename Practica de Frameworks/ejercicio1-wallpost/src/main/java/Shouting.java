import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class Shouting extends SimpleFormatter {
	
	public String format (LogRecord record) {
		return super.format(record).toUpperCase();
	}
}
