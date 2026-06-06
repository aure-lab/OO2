package Ejercicio19.FileManager;

import java.util.List;

public class FileManager {
	private List<Componente> files;
	
	public String print() {
        StringBuilder archivos = new StringBuilder();

        this.files.forEach(f ->  archivos.append(f.prettyPrint())
                    .append("\n")
        );

        return archivos.toString();
    }
}