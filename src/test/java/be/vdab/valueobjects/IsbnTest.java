package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsbnTest {

	@Test
	public void nummerDatUit13CijfersBestaatMetCorrecteControleIsOk() {
		new Isbn(9789027439642L);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nummerDatUit12CijfersBestaatIsNietOK() {
		new Isbn(978902743964L);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nummerDatUit14CijfersBestaatIsNietOk() {
		new Isbn(97890274396422L);
	}
	
	@Test
	public void nummerDatBegintMet978EnCorrecteControleIsOK() {
		new Isbn(9789027439642L);
	}
	
	@Test
	public void nummerDatBegintMet979EnCorrecteControleIsOk() {
		new Isbn(9799027439641L);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nummerDatNietBegintMet978Of979EnCorrecteControleIsNietOk() {
		new Isbn(9779027439643L);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nummerDatBegintMet978EnIncorrecteControleIsNietOk() {
		new Isbn(9789027439643L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerDatBegintMet979EnIncorrecteControleIsNietOk() {
		new Isbn(9799027439642L);
	}
	
	@Test
	public void dertiendeCijferIsGelijkAanNulAlsHetVerschil10IsIsOk() {
		new Isbn(9789227439640L);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void dertiendeCijferIsVerschillendVanNulAlsHetVerschil10IsIsNietOk() {
		new Isbn(9789047439642L);
	}
	
	@Test(expected = IllegalArgumentException.class) 
	public void nulAlsGetalIsNietOk() {
		new Isbn(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negatiefGetalIsNietOK() {
		new Isbn(-9789027439642L);
	}
	
	@Test
	public void toStringMoetHetNummerTeruggeven() {
		long nummer = 9789027439642L;
		assertEquals(String.valueOf(nummer), new Isbn(nummer).toString());
	}
}
