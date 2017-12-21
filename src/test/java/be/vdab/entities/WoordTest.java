package be.vdab.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class WoordTest {

	@Test
	public void lepelIsEenPalindroom() {
		assertTrue(new Woord("lepel").isPalindroom());
	}
	
	@Test
	public void woordIsGeenPalindroom() {
		assertFalse(new Woord("woord").isPalindroom());
	}
	
	@Test
	public void eenLegeStringIsEenPalindroom() {
		assertTrue(new Woord("").isPalindroom());
	}
}
