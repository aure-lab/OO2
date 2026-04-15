package ejercicio2.ej2;

public class Piedra implements Opcion {

	@Override
	public String pelearContraPiedra() {
		return "Empate";
	}

	@Override
	public String pelearContraTijera() {
		return "Piedra";
	}
	
	@Override
	public String pelearContraPapel() {
		return "Papel";
	}

	@Override
	public String combatir(Opcion op) {
		return op.pelearContraPiedra();
	}

}
