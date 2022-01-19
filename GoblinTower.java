package goblinTower;

public class GoblinTower {

	public static void main(String[] args) {
		
		// Create new Hero Attack Pwr(1-3) DefPwr(1-5) HealthPnt(20-30)
		Hero myHero = new Hero();
		Goblin myGoblin = new Goblin();
		initChar(myHero);
		initChar(myGoblin);
		
		displayChar(myHero);
		displayChar(myGoblin);	
		
	}	

	private static void initChar(Hero hero) {
		Hero myHero = hero;
		
		myHero.setAttackPwr();
		myHero.setDefPwr();
		myHero.setHealthPnt();
		myHero.setGold();
	}
	
	private static void initChar(Goblin myGoblin) {
		Goblin myGob = myGoblin;
		
		myGob.setAttackPwr();
		myGob.setDefPwr();
		myGob.setHealthPnt();
		
	}
	
	private static void displayChar(Hero hero) {
		Hero myHero = hero;
		
		System.out.println(myHero.getClass().getSimpleName().toUpperCase() + " INIT");
		System.out.println("====================================================");
		System.out.println("AttackPwr[" + myHero.getAttackPwr() + "] DefPwr[" + myHero.getDefPwr() +"] " +
							"HealthPnt[" + myHero.getHealthPnt() + "] Gold[" + myHero.getGold() + "]");
	}
	
	private static void displayChar(Goblin goblin) {
		Goblin myGoblin = goblin;
		
		System.out.println("====================================================");
		System.out.println(myGoblin.getClass().getSimpleName().toUpperCase() + " INIT");
		System.out.println("====================================================");
		System.out.println("AttackPwr[" + myGoblin.getAttackPwr() + "] DefPwr[" + myGoblin.getDefPwr() +"] " +
							"HealthPnt[" + myGoblin.getHealthPnt() + "]");
	}

}
