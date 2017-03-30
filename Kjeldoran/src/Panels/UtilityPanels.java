package Panels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Utilities.Information;

public class UtilityPanels {
	
	Information info = new Information();
	
	public void intOpeningMenu(){
	JOptionPane.showMessageDialog(null, info.HEADER + "\nCopyright: Phoenix Feather Studios, 2017", info.HEADER , JOptionPane.INFORMATION_MESSAGE);
	}
	
	public int intStartMenu(){
	Object[] possibleValues = { "New Game", "Load", "Options", "Credits" };
	Object temp = JOptionPane.showOptionDialog(null, "Select One:", info.VERSION, JOptionPane.YES_NO_CANCEL_OPTION, 1, null, possibleValues, possibleValues[0]);
	int value = (int) temp;
	return value;
	}	
	
	
	
	public void intCombatTest(){
		
		System.out.println();
		
	}
	
}


//Object[] possibleValues = { "Rock", "Paper", "Scissors" };
//Object selectedValue = JOptionPane.showInputDialog(null,"Choose one:", "RPS",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
//Object selectedValue = JOptionPane.showOptionDialog(null,"Choose one:", "RPS",JOptionPane.YES_NO_OPTION, 1, null,possibleValues, possibleValues[0]);
//int tempChoice =(Integer) selectedValue;