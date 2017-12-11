package lab06.ex36;

public class BlueTower extends Tower {
	public BlueTower(){
		super();
		this.name = "Blue Tower";
	}

	@Override
	public void attackJelly() {
		System.out.println("Blue Tower attacks Jelly for 2 points damage.");
	}
}
