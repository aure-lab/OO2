import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer{

	@Override
	public void handleMessage(String message, PrintWriter out) {
	    String[] args = message.split(",");

	    try {
	        if ((args[0] != null) && !(args[0].isEmpty())) {
	            int cant = Integer.parseInt(args[1]);
	            if (cant <= 0) {
	                out.print("El segundo argumento debe ser un entero mayor a 0");
	                return;
	            }
	            String delimitador = (args.length > 2 && args[2] != null && !args[2].isEmpty()) 
	                                    ? args[2] 
	                                    : " ";
	            out.print((args[0] + delimitador).repeat(cant));
	        }
	    } catch (NumberFormatException e) {
	        out.print("El segundo argumento debe ser un entero mayor a 0");
	    }
	}
}
