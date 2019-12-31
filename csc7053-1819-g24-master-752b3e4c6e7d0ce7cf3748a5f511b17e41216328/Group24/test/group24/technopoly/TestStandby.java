package group24.technopoly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStandby {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDisplayDetails() {
		Standby s = new Standby();
		s.displayDetails();
	}

	@Test
	public void testFreeParking() {
		Standby s = new Standby();
	}

	@Test
	public void testFreeParkingStringInt() {
		Standby s = new Standby("Free", 1);
	}

}
