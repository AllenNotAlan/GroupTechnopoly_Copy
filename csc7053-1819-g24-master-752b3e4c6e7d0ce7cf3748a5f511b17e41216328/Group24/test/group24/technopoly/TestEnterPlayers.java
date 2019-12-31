package group24.technopoly;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestEnterPlayers {

	public static ArrayList<Player> players;
	public static int totalPlayers;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEnterPlayers() {
		Player p = new Player();
	}

	@Test
	public void testEnterNoOfPlayers() {
		Player p1 = new Player();
		p1.setPlayerName("Player One");
		Player p2 = new Player();
		p2.setPlayerName("Player Two");
		Player p3 = new Player();
		p3.setPlayerName("Player Three");
		Player p4 = new Player();
		p4.setPlayerName("Player Four");

		int totalPlayers = 4;

		players = new ArrayList<Player>();

		do {
			System.out.println("How many players are there?");

			if (totalPlayers >= 5 || totalPlayers <= 1) {
				System.out.println("Invalid number. Enter a number between 1-4");
			}
		} while (totalPlayers >= 5 || totalPlayers <= 1);

		if (totalPlayers == 2) {
			players.add(p1);
			players.add(p2);

		} else if (totalPlayers == 3) {
			players.add(p1);
			players.add(p2);
			players.add(p3);
		} else {
			players.add(p1);
			players.add(p2);
			players.add(p3);
			players.add(p4);
		}

	}

	@Test
	public void testArrayListInitialised() {
		players = new ArrayList<Player>();
	}

	@Test
	public void testSetNameOfPlayers() {
		Player p = new Player();
		String playerNameTest = "Example";
		p.setPlayerName(playerNameTest);
		assertEquals(playerNameTest, p.getPlayerName());
	}

}
