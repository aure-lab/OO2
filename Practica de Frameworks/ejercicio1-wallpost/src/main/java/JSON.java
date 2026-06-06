import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSON extends Formatter{

	@Override
	public String format(LogRecord record) {
		return "{ message: " + record.getMessage() + "level: "  + record.getLevel() + "}";
	}
}
