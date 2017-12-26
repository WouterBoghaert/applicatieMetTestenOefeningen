package be.vdab.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WoordTellerTest {

	private WoordTeller woordTeller;
	
	@Before
	public void before() {
		woordTeller = new WoordTeller();
	}
	
	@Test(expected = NullPointerException.class)
	public void woordTellerMetNullAlsZinGeeftException () {
		woordTeller.getAantalWoorden(null);
	}
	
	@Test
	public void eenLegeZinGeeftNulWoorden() {
		assertEquals(0, woordTeller.getAantalWoorden(""));
	}
	
	@Test
	public void eenZinMetEnkelEenSpatieGeeftNulWoorden() {
		assertEquals(0, woordTeller.getAantalWoorden(" "));
	}
	
	@Test
	public void eenZinMetEnkelDrieSpatiesGeeftNulWoorden() {
		assertEquals(0, woordTeller.getAantalWoorden("   "));
	}
	
	@Test
	public void eenZinMetEnkelEenKommaGeeftNulWoorden() {
		assertEquals(0, woordTeller.getAantalWoorden(","));
	}
	
	@Test
	public void eenZinMetEnkelDrieKommasGeeftNulWoorden() {
		assertEquals(0, woordTeller.getAantalWoorden(",,,"));
	}
	
	@Test
	public void eenZinMetEnkelDrieSpatiesEnDrieKommasGeeftNulWoorden() {
		assertEquals(0, woordTeller.getAantalWoorden(" , , ,"));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenDoorTweeKommasGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test,test,test"));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenDoorTweeSpatiesGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test test test"));
	}

	@Test
	public void eenZinMetDrieWoordenGescheidenDoorEenSpatieEnEenKommaGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test test,test"));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenDoorEenSpatieEnDanEenKommaGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test ,test ,test"));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenDoorEenKommaEnDanEenSpatieGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test, test, test"));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenDoorEenSpatieDanEenKommaEnDanEenSpatieGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test , test , test"));
	}

	@Test
	public void eenZinMetDrieWoordenGescheidenKommasEnSpatiesEnOpHetEindeNogEenSpatieGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test, test, test "));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenKommasEnSpatiesEnOpHetEindeNogEenKommaGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test, test, test,"));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenKommasEnSpatiesEnOpHetEindeNogEenKommaEnEenSpatieGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test, test, test, "));
	}
	
	@Test
	public void eenZinMetDrieWoordenGescheidenKommasEnSpatiesEnOpHetEindeNogEenSpatieEnEenKommaGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden("test, test, test ,"));
	}
	
	@Test
	public void eenZinBeginnendMetEenSpatieEnMetDrieWoordenGescheidenKommasEnSpatiesGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden(" test, test, test, "));
	}
	
	@Test
	public void eenZinBeginnendMetEenKommaEnMetDrieWoordenGescheidenKommasEnSpatiesGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden(",test, test, test, "));
	}
	
	@Test
	public void eenZinBeginnendMetEenSpatieEnEenKommaEnMetDrieWoordenGescheidenKommasEnSpatiesGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden(" ,test, test, test, "));
	}
	
	@Test
	public void eenZinBeginnendMetEenKommaEnEenSpatieEnMetDrieWoordenGescheidenKommasEnSpatiesGeeftDrieWoorden() {
		assertEquals(3, woordTeller.getAantalWoorden(", test, test, test, "));
	}
	
	@Test
	public void eenZinMetEnkel1WoordGeeft1Woord() {
		assertEquals(1, woordTeller.getAantalWoorden("test"));
	}
	
	@Test
	public void eenZinMetEnkel1WoordEnSpatiesOpBeginEnEindeGeeft1Woord() {
		assertEquals(1, woordTeller.getAantalWoorden(" test "));
	}
	
	@Test
	public void eenZinMetEnkel1WoordEnKommasOpBeginEnEindeGeeft1Woord() {
		assertEquals(1, woordTeller.getAantalWoorden(",test,"));
	}
	
	@Test
	public void eenZinMetEnkel1WoordEnKommasEnSpatiesOpBeginEnEindeGeeft1Woord() {
		assertEquals(1, woordTeller.getAantalWoorden(" ,test ,"));
	}
}
