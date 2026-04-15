package ar.edu.unlp.info.oo1.ej1;

public class Retweet implements Tweet {
	private Tweet origen;
	
	public Retweet (TweetNormal tweet) {
		this.origen = tweet; 
	}
}
