import javax.swing.JOptionPane;

import Panels.UtilityPanels;
import Utilities.Information;
import combat.Fate;
import entities.BasicEntity;
import entities.Goblin;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
	//Declarations
		Information info = new Information();
		UtilityPanels utilPanels = new UtilityPanels();
		Fate fates = new Fate();
		Player playah = new Player();
		Goblin gob = new Goblin();
		
	//Code
		
		utilPanels.intOpeningMenu();
		int answer = utilPanels.intStartMenu();

	//Main Menu
		switch(answer){
		case 1: answer = 0;
		//blah
		break;
		case 2: answer = 1;
		utilPanels.intCombatTest();
		break;
		case 3: answer = 2;
		//blah
		break;
		case 4: answer = 3;
		//blah
		break;
		}



	}

}
