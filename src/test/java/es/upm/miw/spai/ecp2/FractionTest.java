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
	
	@Test
	public void testIsProper(){
        assertTrue(new Fraction(1, 2).isProper());
        assertFalse(new Fraction(2, 1).isProper());
        assertFalse(new Fraction(1, 1).isProper());
	}

	@Test
    public void testIsEquivalente() {
	    Fraction fraction1= new Fraction(3, 2);
	    Fraction fraction2= new Fraction(4, 2);
	    assertTrue(fraction2.isEquivalente(fr, fraction2));
	    assertFalse(fraction1.isEquivalente(fr, fraction1));
	    
    }

	@Test
	public void isGreaterThanTest() {
		Fraction other = new Fraction(3, 2);
		assertFalse(fr.isGreaterThan(other));

	}
}
