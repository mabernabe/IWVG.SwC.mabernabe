package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User us;
	
    @Before
    public void before() {
        this.us = new User(3, "Miguel", "Bernabe");
    }

	@Test
	public void testUser() {
        assertEquals(3, this.us.getNumber());
        assertEquals("Miguel", this.us.getName());
        assertEquals("Bernabe", this.us.getFamilyName());
	}

	@Test
	public void testGetNumber() {
        assertEquals(3, this.us.getNumber());
	}

	@Test
	public void testGetName() {
        assertEquals("Miguel", this.us.getName());
	}

	@Test
	public void testGetFamilyName() {
        assertEquals("Bernabe", this.us.getFamilyName());
	}

	@Test
	public void testFullName() {
        assertEquals("Miguel Bernabe", this.us.fullName());
	}

	@Test
	public void testInitials() {
        assertEquals("M.", this.us.initials());
	}

}
