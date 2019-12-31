package group24.technopoly;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestGameSystem {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetSetNumberOfPlayers() {
		int numPlay = 2;
		GameSystem g = new GameSystem();
		g.setNumberOfPlayers(numPlay);
		assertEquals(numPlay, g.getNumberOfPlayers());
	}

	@Test
	public void testGetSetCurrentTurn() {
		GameSystem g = new GameSystem();
		Player p = new Player();
		g.setCurrentTurn(p);
		assertEquals(p, g.getCurrentTurn());

	}

	@Test
	public void testIsSetGameStatus() {
		boolean set = true;
		GameSystem g = new GameSystem();
		g.setGameStatus(set);
		assertEquals(set, g.isGameStatus());
	}

	@Test
	public void testFieldSize() {
		int fieldCount = 0;
		ArrayList<MiningSetUp> setups = new ArrayList<MiningSetUp>();
		Field field = null;

		// count total setups that make up the complete field
		for (int loop = 0; loop < setups.size(); loop++) {
			if (setups.get(loop).getField() == field) {
				fieldCount++;
			}
		}

	}

}
