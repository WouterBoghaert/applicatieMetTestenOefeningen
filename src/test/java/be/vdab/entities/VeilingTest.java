package be.vdab.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	private Veiling veiling;
	
	@Before
	public void before() {
		veiling = new Veiling();
	}
	
	@Test
	public void alsNogGeenBodUitgevoerdWerdIsHoogsteBodNul() {
		assertEquals(0, veiling.getHoogstebod());
	}
	
	@Test
	public void alsEersteBodUitgevoerdWerdIsHoogsteBodEersteBod() {
		veiling.doeBod(1000);
		assertEquals(1000, veiling.getHoogstebod());
	}
	
	@Test
	public void alsMeerdereBodenUitgevoerdWerdenIsHoogsteBodGelijkAanBedragHoogsteBod() {
		veiling.doeBod(1000);
		veiling.doeBod(2000);
		veiling.doeBod(1500);
		assertEquals(2000, veiling.getHoogstebod());
	}
}
