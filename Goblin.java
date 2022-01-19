package goblinTower;

public class Goblin {
	
	private int healthPnt;
	
	private int attackPwr;
	
	private int defPwr;
	
	public int getHealthPnt() {
		return healthPnt;
	}

	public void setHealthPnt(int healthPwr) {
		this.healthPnt = healthPwr;
	}

	public int getAttackPwr() {
		return attackPwr;
	}
	
	public void setDefPwr(int defPwr) {
		this.defPwr = defPwr;
	}
	
	public void setAttackPwr(int attackPwr) {
		this.attackPwr = attackPwr;
	}

	public int getDefPwr() {
		return defPwr;
	}

	public void setAttackPwr() {
		int att = getRandomNumber(2,3);	  //2-3 	
		setAttackPwr(att);
	}

	public void setDefPwr() {
		int df= getRandomNumber(1,2);  //1-2
		setDefPwr(df);		
	}

	public void setHealthPnt() {
		int hp = getRandomNumber(5,10); // 5-10
		setHealthPnt(hp);		
	}
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

}
