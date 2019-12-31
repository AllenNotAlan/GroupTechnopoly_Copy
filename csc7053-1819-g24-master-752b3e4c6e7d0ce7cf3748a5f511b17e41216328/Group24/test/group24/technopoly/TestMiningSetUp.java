package group24.technopoly;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMiningSetUp {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMiningSetUp() {
		MiningSetUp m = new MiningSetUp();
	}

	@Test
	public void testMiningSetUpCostGetSet() {
		MiningSetUp m = new MiningSetUp();
		int testMiningSetUpCost = 150;
		m.setMiningSetUpCost(testMiningSetUpCost);
		assertEquals(testMiningSetUpCost, m.getMiningSetUpCost());
	}

	@Test
	public void testOwnerGetSet() {
		MiningSetUp m = new MiningSetUp();
		Player p = new Player();
		m.setOwner(p);
		assertEquals(p, m.getOwner());
	}

	@Test
	public void testUpgradeCostGetSet() {
		MiningSetUp m = new MiningSetUp();
		int testUpgradeCost = 150;
		m.setUpgradeCost(testUpgradeCost);
		assertEquals(testUpgradeCost, m.getUpgradeCost());
	}

	@Test
	public void testUpgradeLevelGetSet() {
		MiningSetUp m = new MiningSetUp();
		int testUpgradeLevel = 2;
		m.setUpgradeLevel(testUpgradeLevel);
		assertEquals(testUpgradeLevel, m.getUpgradeLevel());
	}

	@Test
	public void testMaxCapacityGetSet() {
		MiningSetUp m = new MiningSetUp();
		boolean testMaxCap = true;
		m.setMaxMiningCapacity(testMaxCap);
		assertEquals(testMaxCap, m.isMaxMiningCapacity());
	}

	@Test
	public void testPriceGetSet() {
		MiningSetUp m = new MiningSetUp();
		double testPrice = 100.00;
		m.setRentPrice(testPrice);
		assertEquals(testPrice, m.getRentPrice(), 1.00);
	}

	// @Test
	// public void testLandOnSquare() {
	// still need to do last 2 methods
	// }

}
