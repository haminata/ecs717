package lab06.ex36;

public class BlueRedTower extends Tower {
	
	public BlueRedTower(){
		super();
		this.name = "Blue Red Tower";
	}

	@Override
	public void attackJelly() {
		System.out.println("Blue Red Tower attacks Jelly for 1 points damage.");
	}

}
