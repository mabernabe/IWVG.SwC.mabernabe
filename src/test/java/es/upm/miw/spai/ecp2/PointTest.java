package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3, 4);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
        assertEquals(4, pt.getZ());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
        assertEquals(0, pt.getZ());
    }

    @Test
    public void testModulo() {
        assertEquals(5.3851, pt.module(), 10e-5);
    }

    @Test
    public void testFaseXY() {
        assertEquals(0.9828, pt.phaseXY(), 10e-5);
    }

    @Test
    public void testFaseYZ() {
        assertEquals(0.9272, pt.phaseYZ(), 10e-5);
    }

    @Test
    public void testFaseZX() {
        assertEquals(0.4636, pt.phaseZX(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
        assertEquals(3, pt.getZ());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3,4]", pt.toString());
    }

}
