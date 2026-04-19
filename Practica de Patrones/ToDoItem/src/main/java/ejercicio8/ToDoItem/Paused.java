package ejercicio8.ToDoItem;

import java.time.Duration;
import java.time.LocalTime;

public class Paused extends Estado{
	
	public Paused (ToDoItem item) {
		super(item);
	}

	@Override
	public void start() {
	}

	@Override
	public void tooglePause() {
		this.item.estado = new InProgress(this.item);
	}

	@Override
	public void finish() {
		this.item.estado = new Finished (this.item);
		this.item.fin = LocalTime.now();
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.item.inicio, LocalTime.now());
	}

}
