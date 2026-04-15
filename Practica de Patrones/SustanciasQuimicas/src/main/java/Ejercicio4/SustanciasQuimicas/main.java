package Ejercicio4.SustanciasQuimicas;

public class main {

	public static void main(String[] args) {
		Atomo a = new Atomo("Oxigeno", "O",2, 2, false);
		Atomo a2 = new Atomo("Hidrogeno", "H",2, 2, true);
		
		Union u = new Union();
		u.añadirElemento(a);
		u.añadirElemento(a2);
		
		Union u2 = new Union();
		u2.añadirElemento(u);
		u2.añadirElemento(a2);
		
		System.out.println(u2.esValida());
	}

}
