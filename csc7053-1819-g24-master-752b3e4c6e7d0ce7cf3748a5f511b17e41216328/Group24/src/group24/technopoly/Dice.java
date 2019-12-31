/**
 * 
 */
package group24.technopoly;

import java.util.Random;

/**
 * Class represents a Dice object
 * @author jonny
 *
 */
public class Dice {

	/**
	 * Method to roll the dice
	 * @return
	 */
	public int rollDice() {
			
			Random diceRoll = new Random();
			
			int roll = diceRoll.nextInt(6)+1;
			
			if ((roll >=1) && (roll <=6)) {
				return roll;
			} else {
				throw new IllegalArgumentException();
			}
	}
}
