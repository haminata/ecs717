package lab06.ex36;

public abstract class Tower {
	public static final int LEVEL_1 = 1;
	public static final int LEVEL_2 = 2;
	public static final int LEVEL_3 = 3;
	public static final int LEVEL_4 = 4;
	
	protected int level;
	protected String name;
	
	public Tower(){
		this.level = LEVEL_1;
		name = "Generic Tower";
	}
	
	public void increaseLevel(){
		if (this.level != LEVEL_4) this.level++;
		else System.out.println("Tower at maximum level");
	}
	public abstract void attackJelly();

}
