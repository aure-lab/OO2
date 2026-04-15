package ejercicio2.ej2;

public class Tijera implements Opcion {

	@Override
	public String pelearContraPiedra() {
		return "Piedra";
	}

	@Override
	public String pelearContraTijera() {
		return "Empate";
	}

	@Override
	public String pelearContraPapel() {
		return "Tijera";
	}

	@Override
	public String combatir(Opcion op) {
		return op.pelearContraTijera();
	}

}
