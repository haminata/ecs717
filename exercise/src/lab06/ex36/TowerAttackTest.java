package lab06.ex36;
import java.util.ArrayList;

public class TowerAttackTest {
	public static void main (String[] args){
		ArrayList<Tower> towerList = new ArrayList<Tower>();
		towerList.add(new BlueRedTower());
		towerList.add(new BlueTower());
		towerList.add(new BlueTower());
		towerList.add(new RedTower());
		
		
		for (Tower t: towerList) t.attackJelly();
	}
}
