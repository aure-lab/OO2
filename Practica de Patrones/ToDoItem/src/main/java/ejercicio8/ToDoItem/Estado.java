package ejercicio8.ToDoItem;

import java.time.Duration;

public abstract class Estado {
	protected ToDoItem item;
	
	public Estado (ToDoItem item) {
		this.item = item;
	}
	
	public abstract void start();
	public abstract void tooglePause();
	public abstract void finish();
	public abstract Duration workedTime();

}
