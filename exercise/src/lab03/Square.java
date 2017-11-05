package lab03;

public class Square {
    public double x;

    public Square (double x){
        this.x = x;
    }

    public double calcArea(){
       double area = x * x;
        return area;
    }

    public static void main (String [] args){
        Square sq1 = new Square(10);
        System.out.println(sq1.calcArea());

        Square sq2 = new Square(35);
        System.out.println(sq2.calcArea());
    }
}