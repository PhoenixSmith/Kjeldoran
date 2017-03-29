import javax.swing.JOptionPane;

import Utilities.Info;
import entities.BasicEntity;
import entities.Goblin;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Info information = new Info();
		
		BasicEntity playah = new Player();
		BasicEntity gob = new Goblin();
	
//String test = JOptionPane.showInputDialog("Hello!");
JOptionPane.showMessageDialog(null, "Kjeldoran ver. " + information.VERSION +"\nCopyright: Phoenix Feather Studios, 2017", "Kjeldoran, " + information.VERSION , JOptionPane.INFORMATION_MESSAGE);

	}

}
