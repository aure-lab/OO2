package Ejercicio4.SustanciasQuimicas;

public class Atomo implements ElementoQuimico {
	
	private String nombre;
	private String simbolo;
	private int pesoAtomico;
	private int carga;
	private boolean metal;
	
	public Atomo (String nombre, String simbolo, int pesoAtomico,int carga, boolean metal) {
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.pesoAtomico = pesoAtomico;
		this.carga = carga;
		this.metal = metal;
	}

	@Override
	public String formula() {
		return this.simbolo;
	}

	@Override
	public int pesoMolecular() {
		return this.pesoAtomico;
	}

	@Override
	public int carga() {
		return this.carga;
	}

	@Override
	public boolean esValida() {
		return true;
	}
	
	public int metal() {
		return this.metal ? 1 : 0; //no se me ocurre otra opcion, probe usar flatmap pero queda muy feo
	}

}
