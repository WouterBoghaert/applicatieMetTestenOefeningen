package be.vdab.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;

public class WinstServiceTest {
	private WinstService winstService;
	private OpbrengstRepository opbrengstRepository;
	private KostRepository kostRepository;
	
	@Before
	public void before() {
		opbrengstRepository = mock(OpbrengstRepository.class);
		kostRepository = mock(KostRepository.class);
		when(opbrengstRepository.findTotaleOpbrengst())
			.thenReturn(BigDecimal.valueOf(5000));
		when(kostRepository.findTotaleKost())
			.thenReturn(BigDecimal.valueOf(2500));
		winstService = new WinstService(opbrengstRepository,
			kostRepository);		
	}

	@Test
	public void getWinstTest() {
		assertEquals(0, BigDecimal.valueOf(2500.00).compareTo(
			winstService.getWinst()));
		verify(opbrengstRepository).findTotaleOpbrengst();
		verify(kostRepository).findTotaleKost();
	}

}
