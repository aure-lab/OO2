package Ejercicio19.FileManager;

public class FechaDeCreacion extends FileDecorator{

	public FechaDeCreacion(Componente file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + " - " + this.getFechaDeCreacion();
	}
	

}
