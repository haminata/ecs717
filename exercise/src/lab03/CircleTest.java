package lab03;
import com.circle.Circle;
/**
 * A test class that uses the Circle class
 * @author laurissa
 *
 */
public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColour("orange");
		c.setRadius(3);

		Circle c2 = new Circle();
		c2.setColour("blue");
		c2.setRadius(1);

		Circle c3 = new Circle();
		c3.setColour("red");
		c3.setRadius(2);

		Circle c4 = new Circle();
		c4.setColour("yellow");
		c4.setRadius(4);

		Circle c5 = new Circle();
		c5.setColour("red");
		c5.setRadius(4);

		Circle c6 = new Circle();
		c6.setColour("orange");
		c6.setRadius(1);
		
		//ALL ADDED CODE MUST BE ABOVE THIS LINE
		Circle.displayMyCircles();
	}

}
