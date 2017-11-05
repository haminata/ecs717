package lab03;

/**
 * created by Haminata
 */
public class Square {
    public double x;

    /**
     * constructor of the square that takes parameters
     * @param x is a variable of the side inside a inside a parameter
     */
    public Square (double x){
        this.x = x;
    }

    /**
     * method that calculates the area of the square
     * @return the area
     */
    public double calcArea(){
       double area = x * x;
        return area;
    }

    /**
     * 2 instances taking parameter values
     * @param args their area values
     */
    public static void main (String [] args){
        Square sq1 = new Square(10);
        System.out.println(sq1.calcArea());

        Square sq2 = new Square(35);
        System.out.println(sq2.calcArea());
    }
}