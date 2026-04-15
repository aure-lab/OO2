package ejercicio3.ej3;

public abstract class Ring<T> {
	private int idx;
	private T [] source; 
	
	public Ring (T [] src) {
		this.idx = 0;
		this.source = src;
	}
	
	public T next () {
		if (this.idx >= this.source.length)
			this.idx = 0;
		return this.source[this.idx++];
	}
	
	
}
