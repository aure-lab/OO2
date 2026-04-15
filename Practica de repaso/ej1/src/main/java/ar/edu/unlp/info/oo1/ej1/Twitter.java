package ar.edu.unlp.info.oo1.ej1;
import java.util.*;


public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter () {
		this.usuarios = new LinkedList<>();
	}
	
	public void crearUsuario (String screenName) {
		if (!this.existeUsuario(screenName))
			this.usuarios.add(new Usuario (screenName));
	}
	
	public boolean existeUsuario (String screenName) {
		return this.usuarios.stream().anyMatch(u -> u.coincide(screenName));
	}
	
	public void eliminarUsuario (String screenName) {
		if (this.existeUsuario(screenName)) // esta bien este aca??
			this.usuarios.removeIf(u -> u.coincide(screenName));
	}
	
	public int getCantidadDeUsuarios() {
		return this.usuarios.size();
	}
}
