package Ejercicio19.FileManager;

public class Extension extends FileDecorator {

	public Extension(Componente file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + " - " + this.getExtension();
		
	}
	

}
