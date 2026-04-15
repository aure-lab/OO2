package Ejercicio4.SustanciasQuimicas;

import java.util.LinkedList;
import java.util.List;

public class Union implements ElementoQuimico {
	private List<ElementoQuimico> componentes = new LinkedList<>();

	@Override
	public String formula() {
		StringBuilder form = new StringBuilder();
		this.componentes.stream().forEach(a -> form.append(a.formula()));;
		return form.toString();
	}

	@Override
	public int pesoMolecular() {
		return this.componentes.stream().mapToInt(a -> a.pesoMolecular()).sum();
	}

	@Override
	public int carga() {
		return this.componentes.stream().mapToInt(a -> a.carga()).sum();
	}

	@Override
	public boolean esValida() {
		return this.metal() < 2;
	}
	
	public void añadirElemento (ElementoQuimico elem) {
		this.componentes.add(elem);
	}
	
	public void removerElemento (ElementoQuimico elem) {
		this.componentes.remove(elem);
	}
	
	public int metal() {
		return this.componentes.stream().mapToInt(a -> a.metal()).sum();
	}
	
	
	

}
