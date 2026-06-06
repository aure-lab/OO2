package Ejercicio19.FileManager;

public abstract class FileDecorator implements Componente{
	protected Componente file;
	
	public FileDecorator (Componente file) {
		this.file = file;
	}
	
	public String getFechaDeModificacion() {
		return this.file.getFechaDeModificacion();
	}
	public String getExtension() {
		return this.file.getExtension();
	}
	public String getPermisos() {
		return this.file.getExtension();
	}
	public String getTamaño() {
		return this.file.getTamaño();
	}
	public String getFechaDeCreacion() {
		return this.file.getFechaDeCreacion();
	}
	
}
