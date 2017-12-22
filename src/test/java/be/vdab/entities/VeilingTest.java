package be.vdab.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class VeilingTest {

	@Test
	public void alsNogGeenBodUitgevoerdWerdIsHoogsteBodNul() {
		Veiling veiling = new Veiling();
		assertEquals(0, veiling.getHoogstebod());
	}
	
	@Test
	public void alsEersteBodUitgevoerdWerdIsHoogsteBodEersteBod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(1000);
		assertEquals(1000, veiling.getHoogstebod());
	}
	
	@Test
	public void alsMeerdereBodenUitgevoerdWerdenIsHoogsteBodGelijkAanBedragHoogsteBod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(1000);
		veiling.doeBod(2000);
		veiling.doeBod(1500);
		assertEquals(2000, veiling.getHoogstebod());
	}

}
