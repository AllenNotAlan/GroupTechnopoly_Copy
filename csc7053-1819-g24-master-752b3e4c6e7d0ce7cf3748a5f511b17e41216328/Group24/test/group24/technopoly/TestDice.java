package group24.technopoly;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestDice {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testValidDiceResult() {
		Random firstRoll = new Random();
		Random secondRoll = new Random();

		int firstResult = firstRoll.nextInt(6) + 1;

		int secondResult = secondRoll.nextInt(6) + 1;

		int total = firstResult + secondResult;

		assertEquals(total, firstResult + secondResult);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidDiceResult() {
		
		int total = 13;

		if ((total >= 2) && (total <= 12)) {
			total = total;
		} else {
			throw new IllegalArgumentException();
		}

	}

}
