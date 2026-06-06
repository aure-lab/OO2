package ar.edu.unlp.oo2.persitencia;

import java.util.LinkedList;
import java.util.List;

public class PostRepositorySpy {
	int cont = 0;
	
	public List<Post> findPostsByUsername(String aUsername) {
		this.cont++;
		List <Post> l = new LinkedList<>();
		l.add(new Post("1234"));
		return l;
	}
	
	public int getCont()
	{
		return cont;
	}
}
