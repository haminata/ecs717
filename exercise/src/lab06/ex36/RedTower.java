package lab06.ex36;

public class RedTower extends Tower  {
	public RedTower(){
		super();
		this.name = "Red Tower";
	}

	@Override
	public void attackJelly() {
		System.out.println("Red Tower attacks Jelly for 2 points damage.");
	}
}
