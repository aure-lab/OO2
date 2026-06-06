package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class UserProxy implements PersistableUser{
	private String username;
	private String email;
	private PostRepository repo;
	private List<Post> posts = null;
	public UserProxy (String username, String email, PostRepository repo) {
		this.username = username;
		this.email = email;
		this.repo = repo;
	}
	
	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public List<Post> getPosts() {
		if (this.posts == null)
			this.posts = this.repo.findPostsByUsername(this.username);
		return this.posts;
			
	}

}
