package entities;

public class BasicEntity {
	
	private int health;
	private int stamina;
	private int magic;
	private final int MAXHEALTH;
	private final int MAXSTAMINA;
	private final int MAXMAGIC;
	
	
	BasicEntity(int mh, int ms, int mm){
		this.MAXHEALTH = mh;
		this.MAXSTAMINA = ms;
		this.MAXMAGIC = mm;
	}
	
	public void resetStats(){
		this.health = MAXHEALTH;
		this.stamina = MAXSTAMINA;
		this.magic = MAXMAGIC;
	
	}
	
	public void setHealth(int x){
		health = x;
	}
	public int getHealth(){
		return health;
	}
	public void setStamina(int x){
		stamina = x;
	}
	public int getStamina(){
		return stamina;
	}
	public void setMagic(int x){
		magic = x;
	}
	public int getMagic(){
		return magic;
	}
	


}

