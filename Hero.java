package goblinTower;

public class Hero extends Goblin {
	
	private int[] potions = {2, 2, 2, 2, 2};
	
	private int gold = 0;
	
	public int[] getPotions() {
		return potions;
	}

	public void setPotions(int[] potions) {
		this.potions = potions;
	}

	public int getGold() {
		return gold;
	}

	public void setGold() {
		int gd =0;
		setGold(gd);
	}
	
	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public void setHealthPnt(int healthPwr) {
		// TODO Auto-generated method stub
		super.setHealthPnt(healthPwr);
	}

	public void setAttackPwr() {
		int att = getRandomNumber(1,3);	  //1-3 	
		setAttackPwr(att);
	}

	public void setDefPwr() {
		int df= getRandomNumber(1,5);  //1-5
		setDefPwr(df);		
	}

	public void setHealthPnt() {
		int hp = getRandomNumber(20,30); // 20-30
		setHealthPnt(hp);		
	}
	
	
	

}
