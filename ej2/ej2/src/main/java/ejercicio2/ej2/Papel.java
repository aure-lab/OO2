package ejercicio2.ej2;

public class Papel implements Opcion {

	@Override
	public String pelearContraPiedra() {
		return "Papel";
	}

	@Override
	public String pelearContraTijera() {
		return "Tijera";
	}

	@Override
	public String pelearContraPapel() {
		return "Empate";
	}

	@Override
	public String combatir(Opcion op) {
		return op.pelearContraPapel();
	}

}
