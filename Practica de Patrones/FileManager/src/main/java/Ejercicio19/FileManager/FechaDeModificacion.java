package Ejercicio19.FileManager;

public class FechaDeModificacion extends FileDecorator{

	public FechaDeModificacion(Componente file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + this.getFechaDeModificacion();
	}
	
	

}
