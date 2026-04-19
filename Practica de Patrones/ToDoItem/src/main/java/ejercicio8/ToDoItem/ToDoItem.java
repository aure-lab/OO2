package ejercicio8.ToDoItem;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class ToDoItem {
	protected LocalTime inicio;
	protected LocalTime fin;
	private String nombre;
	private List<String> comentarios;
	protected Estado estado;
	
	public ToDoItem (String nombre) {
		this.nombre = nombre;
		this.comentarios = new LinkedList<>();
		this.estado = new Pending(this);
	}
	
	public void start () {
		this.estado.start();
	}
	
	public void togglePause() {
		this.estado.tooglePause();
	}
	
	public void finish() {
		this.estado.finish();
	}
	
	public Duration workedTime() {
		return this.estado.workedTime();
	}
	
	public void addComment (String comment) {
		this.comentarios.add(comment);
	}
	
	
	
	

}
