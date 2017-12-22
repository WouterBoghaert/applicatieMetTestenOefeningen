package be.vdab.entities;

public class Veiling {
	private int bod = 0;
	private int hoogsteBod = 0;
	public void doeBod(int bedrag) {
		this.bod = bedrag;
		if(bod > hoogsteBod) {
			hoogsteBod = bod;
		}
	}
	
	public int getHoogstebod() {
		return hoogsteBod;
	}
}
