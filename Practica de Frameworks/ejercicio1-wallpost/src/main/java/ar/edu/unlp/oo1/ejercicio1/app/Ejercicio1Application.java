package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		Logger.getLogger("").setLevel(Level.INFO);
		Logger modelLogger = Logger.getLogger("model");
		modelLogger.setLevel(Level.WARNING);
		FileHandler modelHandler = new FileHandler("log.txt");
		modelLogger.addHandler(modelHandler);
		Logger uiLogger = Logger.getLogger("ui");
		uiLogger.setLevel(Level.INFO);
		
		uiLogger.info("App iniciada");
		
		

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
