package entities;

public class Player extends BasicEntity{
	
	private static String equippedWeapon;
	private static String[] playerWeapons = {"SpearnShield", "Longsword", "Bow"};
	
	public Player(){
		super(20, 20, 20, 0, 5, 0);
		this.resetStats();
	}


	public void setWeapon(int weaponSelection){
		switch(weaponSelection){
		case 1: weaponSelection = 1;
		equippedWeapon = playerWeapons[0];
		this.setAtk(4);
		this.setDef(this.getDef() + 2);
		break;
		case 2: weaponSelection = 2;
		equippedWeapon = playerWeapons[1];
		this.setAtk(8);
		this.setDef(this.getDef() + -2);
		break;
		case 3: weaponSelection = 3;
		equippedWeapon = playerWeapons[2];
		this.setAtk(6);
		this.setDef(this.getDef() + -2);
		break;
		default: System.out.println("Error on weapon selection code!");
		break;
		
		}
	}
	
	public String getWeapon(){
		return equippedWeapon;
	}
	
	
}


