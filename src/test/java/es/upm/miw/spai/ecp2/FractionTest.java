package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fr;
	
    @Before
    public void before() {
        this.fr = new Fraction(4, 2);
    }

	@Test
	public void testFractionIntInt() {
        assertEquals(2, this.fr.getDenominator());
        assertEquals(4, this.fr.getNumerator());;
	}

	@Test
	public void testFraction() {
		fr = new Fraction();
        assertEquals(1, this.fr.getDenominator());
        assertEquals(1, this.fr.getNumerator());;
	}

	@Test
	public void testGetNumerator() {
        assertEquals(4, this.fr.getNumerator());;
	}

	@Test
	public void testGetDenominator() {
        assertEquals(2, this.fr.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(2, fr.getNumerator() / fr.getDenominator());
	}

}
