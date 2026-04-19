package ejercicio8.ToDoItem;

import java.time.Duration;
import java.time.LocalTime;

public class InProgress extends Estado{
	
	public InProgress (ToDoItem item) {
		super(item);
	}

	@Override
	public void start() {
	}

	@Override
	public void tooglePause() {
		this.item.estado = new Paused(item);
	}

	@Override
	public void finish() {
		this.item.estado = new Finished(item);
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.item.inicio, LocalTime.now());
	}

}
