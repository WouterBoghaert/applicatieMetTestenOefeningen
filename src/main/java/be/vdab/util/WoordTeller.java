package be.vdab.util;

public class WoordTeller {
	public int getAantalWoorden(String zin) {
		zin = zin.replace(',', ' ');
		zin = zin.trim();
		String [] zinGesplitDoorSpaties = zin.split(" ");
		StringBuilder zinBuilder = new StringBuilder();
		for (String woord : zinGesplitDoorSpaties) {
			woord = woord.trim();
			if(!woord.isEmpty()) {
				zinBuilder.append(woord + " ");
			}
		}
		String zin2 = zinBuilder.toString().trim();
		if(!zin2.isEmpty()) {
			zinGesplitDoorSpaties = zin2.split(" ");		
			return zinGesplitDoorSpaties.length;
		}
		else {
			return 0;
		}
	}
}
