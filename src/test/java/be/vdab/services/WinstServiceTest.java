package be.vdab.services;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;

public class WinstServiceTest {
	private WinstService winstService;
	
	@Before
	public void before() {
		OpbrengstRepository opbrengstRepository = new OpbrengstRepositoryStub();
		KostRepository kostRepository = new KostRepositoryStub();
		winstService = new WinstService(opbrengstRepository,
			kostRepository);		
	}

	@Test
	public void getWinstTest() {
		assertEquals(0, BigDecimal.valueOf(2500.00).compareTo(
			winstService.getWinst()));
	}

}
