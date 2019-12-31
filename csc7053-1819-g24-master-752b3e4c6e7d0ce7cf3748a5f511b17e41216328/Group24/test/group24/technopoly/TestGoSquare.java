package group24.technopoly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGoSquare {

	final static int PASS_GO_AMOUNT = 200;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGoSquareConstructor() {
		GoSquare g = new GoSquare();
	}

	@Test
	public void testUpdateBalance() {
		Player p = new Player();
		double updatedBalance = p.getBalance() + PASS_GO_AMOUNT;
		p.setBalance(updatedBalance);
	}

}
