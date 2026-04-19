package ejercicio8.ToDoItem;

import java.time.Duration;
import java.time.LocalTime;

public class Pending extends Estado {

	public Pending (ToDoItem item) {
		super(item);
	}

	@Override
	public void start() {
		this.item.estado = new InProgress(item);
		this.item.inicio = LocalTime.now();
	}

	@Override
	public void tooglePause() {
		throw new RuntimeException ("No es posible cambiar de Pendiente a Pausa.");
	}

	@Override
	public void finish() {
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException ("La tarea nunca fue iniciada.");
	}

}
