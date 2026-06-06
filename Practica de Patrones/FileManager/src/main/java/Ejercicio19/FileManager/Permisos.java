package Ejercicio19.FileManager;

public class Permisos extends FileDecorator {

	public Permisos(Componente file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + " - " + this.getPermisos();
	}
	
	
	

}
