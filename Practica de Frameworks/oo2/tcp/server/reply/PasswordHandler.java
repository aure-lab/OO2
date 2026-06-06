package tcp.server.reply;

import java.io.PrintWriter;
import java.util.Random;

public class PasswordHandler implements IMessageHandler{

	@Override
	public void handleMessage(String message, PrintWriter out) {
	    String[] args = message.split(",");
	    
	    String letters = args[0];
	    String numbers = args[1];
	    String specials = args[2];
	    
	    String password = generatePassword(letters, numbers, specials);
	    out.println(password);
	}
	
	private String generatePassword(String letters, String numbers, String specials) {
	    Random random = new Random();
	    char[] password = new char[8];

	    // Garantizamos las reglas: al menos 1 número y exactamente 1 especial
	    password[0] = numbers.charAt(random.nextInt(numbers.length()));
	    password[1] = specials.charAt(random.nextInt(specials.length()));

	    // Resto con letras
	    for (int i = 2; i < 8; i++) {
	        password[i] = letters.charAt(random.nextInt(letters.length()));
	    }

	    // Shuffleamos para que no siempre estén en la misma posición
	    for (int i = password.length - 1; i > 0; i--) {
	        int j = random.nextInt(i + 1);
	        char temp = password[i];
	        password[i] = password[j];
	        password[j] = temp;
	    }
	    
	    //no se muy bien que hace, se lo pedi a claude

	    return new String(password);
	}

}

