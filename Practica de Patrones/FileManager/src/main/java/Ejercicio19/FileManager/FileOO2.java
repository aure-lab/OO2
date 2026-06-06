package Ejercicio19.FileManager;

import java.time.LocalDate;

public class FileOO2 implements Componente{
	private String nombre;
	private LocalDate fechaDeCreacion;
	private LocalDate fechaDeModificacion;
	private String extension;
	private String permisos;
	private String tamaño;

	public FileOO2(String nombre, LocalDate fechaDeCreacion, LocalDate fechaDeModificacion, String permisos, String tamaño, String extension) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
		this.fechaDeModificacion = fechaDeModificacion;
		this.extension = extension;
		this.permisos = permisos;
		this.tamaño = tamaño;
	}
	protected String getNombre() {
		return nombre;
	}
	
	public String getFechaDeCreacion() {
		return fechaDeCreacion.toString();
	}
	public String getFechaDeModificacion() {
		return fechaDeModificacion.toString();
	}
	public String getExtension() {
		return extension;
	}
	public String getPermisos() {
		return permisos;
	}
	public String getTamaño() {
		return tamaño;
	}
	@Override
	public String prettyPrint() {
		return this.getNombre();
	}
	
	

}
