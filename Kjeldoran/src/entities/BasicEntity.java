package entities;

public class BasicEntity {
	
	private int health;
	private int stamina;
	private int magic;
	private int attack;
	private int accuracy;
	private int deffense;
	private int maxAttack;
	private int maxDeffense;
	private int maxAccuracy;
	private int maxHealth;
	private int maxStamina;
	private int maxMagic;

	
	
	
	BasicEntity(int maxH, int maxS, int maxM, int maxA, int maxD, int maxAcc){
		this.maxHealth = maxH;
		this.maxStamina = maxS;
		this.maxMagic = maxM;
		this.maxAttack = maxA;
		this.maxDeffense = maxD;
		this.maxAccuracy = maxAcc;
	}
	
	public void resetStats(){
		this.health = maxHealth;
		this.stamina = maxStamina;
		this.magic = maxMagic;
		this.attack = maxAttack;
		this.deffense = maxDeffense;
		this.accuracy = maxAccuracy;
	
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
	public void setAtk(int x){
		attack = x;
	}
	public int getAtk(){
		return attack;
	}
	public void setDef(int x){
		deffense = x;
	}
	public int getDef(){
		return deffense;
	}
	


}

