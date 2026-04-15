package Ejercicio4.Topografias;

import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Topografia> l = new LinkedList<Topografia>();
		l.add(new Agua());
		l.add(new Agua());
		l.add(new Agua());
		l.add(new Tierra());
		Agua a = new Agua();
		
		Topografia t = new Mixta(l);
		System.out.println(t.equals(a));

	}

}
