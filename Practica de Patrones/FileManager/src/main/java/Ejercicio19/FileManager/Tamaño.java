package Ejercicio19.FileManager;

public class Tamaño extends FileDecorator{

	public Tamaño(Componente file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + " - " + this.getTamaño();
	}
	
	
	

}
