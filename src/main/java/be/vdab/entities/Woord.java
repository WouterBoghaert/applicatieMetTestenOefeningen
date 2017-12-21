package be.vdab.entities;

public class Woord {
	private String woord;
	
	public Woord(String woord) {
		this.woord = woord;
	}
	
	public boolean isPalindroom() {
		return woord.equals( new StringBuilder(woord).reverse().toString());
	}
	
}
