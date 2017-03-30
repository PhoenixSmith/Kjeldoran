package combat;

import java.util.Random;

public class Fate {
	
	private Random rand = new Random();
	
	public int rollD(int diceSize){

		int result = rand.nextInt(diceSize) + 1; //if diceSize == 6: Default 0-6, This gives 1-5
		
		return result;
	}
	
	
}
