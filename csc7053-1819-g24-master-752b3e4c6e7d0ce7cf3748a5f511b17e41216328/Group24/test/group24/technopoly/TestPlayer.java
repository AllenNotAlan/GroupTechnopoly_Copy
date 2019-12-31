package group24.technopoly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import group24.technopoly.Player;

public class TestPlayer {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPlayer() {
		Player p = new Player();
	}

	@Test
	public void testPlayerStringIntIntDouble() {
		Player p = new Player("Example", 1, 1, 1000.00);
	}

	@Test
	public void testNameSetGet() {
		Player p = new Player();
		String exampleName = "Example";

		p.setPlayerName(exampleName);
		assertEquals(exampleName, p.getPlayerName());

	}

	@Test
	public void testValidPlayerIDGetSet() {
		Player p = new Player();
		int playerIDExample = 1;
		p.setPlayerID(playerIDExample);
		assertEquals(playerIDExample, p.getPlayerID());

	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPlayerIDGetSet() {
		Player p = new Player();
		int invalidLowPlayerID = 0;
		int invalidHighPlayerID = 5;
		p.setPlayerID(invalidLowPlayerID);
		p.setPlayerID(invalidHighPlayerID);

	}

	@Test
	public void testGetSetLocation() {
		Player p = new Player();
		int locationExample = 6;

		p.setLocation(locationExample);
		assertEquals(locationExample, p.getLocation());
	}

	@Test
	public void testGetSetBalance() {
		Player p = new Player();
		double balanceExample = 2000.00;

		p.setBalance(balanceExample);
		assertEquals(balanceExample, p.getBalance(), 0.0);
	}

	@Test
	public void testPayPlayer() {
		boolean contineGame = true;
		Player p = new Player();
		MiningSetUp s = new MiningSetUp();
		p.setPlayerID(1);
		p.setBalance(2000.00);

		// to check that player does not own the square themselves
		if (p.getPlayerID() != p.getPlayerID()) {

			System.out.println("Rent due for landing on " + s.getSquareName() + " : " + s.getRentPrice());

			// subtract rent money from paying player
			double newPayingBalance = p.getBalance() - s.getRentPrice();
			p.setBalance(newPayingBalance);

			// add rent money to owner's balance
			double newOwnerBalance = p.getBalance() + s.getRentPrice();
			p.setBalance(newOwnerBalance);

			// determine if payment has made player bankrupt
			if (p.getBalance() < 0) {
				System.out.println(p.getPlayerName() + ", not enough funds to pay rent. You are bankrupt.");
				contineGame = false;

			} else {
				System.out.println(p.getPlayerName() + ", your new balance is " + p.getBalance() + " gameCoin.");
				System.out.println(p.getPlayerName() + ", your new balance is " + p.getBalance() + " gameCoin.");
			}

		} else if (p.getPlayerID() == p.getPlayerID()) {
			System.out.println("This square is owned by you! No rent to pay.");
		}

	}

	@Test
	public void testMovePlayer() {
		boolean passedGo = false;
		int roll = 3;
		Player p = new Player();

		// add the roll to the player's current location
		int newLocation = p.getLocation() + roll;

		// ensure new location is not off the board (outside spaces 0 -11)
		if (newLocation > (GameSystem.NUMBER_OF_SQUARES - 1)) {
			newLocation -= GameSystem.NUMBER_OF_SQUARES;
			p.setLocation(newLocation);
			passedGo = true;
		} else {
			p.setLocation(newLocation);

		}

		assertEquals(newLocation, p.getLocation());

	}

}
