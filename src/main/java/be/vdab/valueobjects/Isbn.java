package be.vdab.valueobjects;

public class Isbn {
	private final long nummer;
	
	public Isbn(long nummer) {
		if (nummer <= 0) {
			throw new IllegalArgumentException("Het nummer moet strikt positief zijn!");
		}
		if (nummer / 1_000_000_000_000L < 1L || nummer / 1_000_000_000_000L >= 10L) {
			throw new IllegalArgumentException("Het nummer moet 13 cijfers lang zijn!");
		}
		if (nummer / 10_000_000_000L < 978 || nummer / 10_000_000_000L > 979) {
			throw new IllegalArgumentException("Het nummer moet starten met 978 of 979");
		}
		if(!isControleOk(nummer)) {
			throw new IllegalArgumentException("Incorrect controlegetal!");
		}
		this.nummer = nummer;
	}
	
	@Override
	public String toString() {
		return String.valueOf(nummer);
	}
	
	private boolean isControleOk(long nummer) {
		int somOnevenPosities = 0;
		for (long i = 100; i<10_000_000_000_000L; i = i * 100) {
			somOnevenPosities += (int)((nummer % (i*10)) / i);
		}
		System.out.println(somOnevenPosities);
		int somEvenPosities = 0;
		for (long i = 10; i<1_000_000_000_000L; i = i * 100) {
			somEvenPosities += (int)((nummer % (i*10)) / i);
		}
		int som = somOnevenPosities + somEvenPosities * 3;
		int verschil = Math.floorDiv(som, 10)*10 + 10 - som;
		int dertiendeCijfer = (int) (nummer % 10);
		if(verschil == 10) {
			return dertiendeCijfer == 0;
		}
		else {
			return dertiendeCijfer == verschil;
		}
	}
}
