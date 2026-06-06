import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Censured extends Handler {
	private Handler handler;
	private List<String> palabras;
	
	public Censured (Handler handler, List<String> palabras) {
		this.handler = handler;
		this.palabras = palabras;
	}

	@Override
	public void publish(LogRecord record) {
	    String msj = palabras.stream()
	                         .reduce(record.getMessage(), (acc, p) -> acc.replace(p, "***"));
	    record.setMessage(msj);
	    this.handler.publish(record);
	}
	@Override
	public void flush() {
		this.handler.flush();
		
	}

	@Override
	public void close() throws SecurityException {
		this.handler.close();
		
	}

}
