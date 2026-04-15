package Ejercicio4.SubteWay;

public class main {

	public static void main(String[] args) {
		ClasicoBuilder cs = new ClasicoBuilder();
		SandwichDirector d = new SandwichDirector(cs);
		Sandwich s = d.construct();
		System.out.println(s.getTotal());
		//ni ganas de hacer los tests
	}

}
