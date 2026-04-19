package ejercicio8.ToDoItem;

import java.time.Duration;

public class Finished extends Estado{
	
	public Finished (ToDoItem item) {
		super(item);
	}

	@Override
	public void start() {
	}

	@Override
	public void tooglePause() {
		throw new RuntimeException ("No es posible cambiar de Finalizado a Pausa.");
	}

	@Override
	public void finish() {
		
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.item.inicio, this.item.fin);
	}

}
