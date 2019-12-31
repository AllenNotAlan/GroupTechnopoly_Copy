package group24.technopoly;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDice.class, TestEnterPlayers.class, TestGameSystem.class, TestGoSquare.class, TestMiningSetUp.class,
		TestPlayer.class, TestStandby.class })
public class AllTests {

}
