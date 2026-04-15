package ar.edu.unlp.info.oo1.ej1;
import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.tweets = new LinkedList <> ();
	}
	
	public void postear (String texto) {
		TweetNormal post = new TweetNormal (texto);
		if (post.contieneTexto())
			this.tweets.add(post);
	}
	
	public void repostear (TweetNormal tweet) {
		if (tweet != null)
			this.tweets.add(new Retweet (tweet));
	}
	
	public boolean coincide (String name) {
		return this.screenName.equals(name);
	}
	
	public int getCantidadDePosts() {
		return this.tweets.size();
	}
	
	
	
	
}
