package lab08b;

public class TestStack{
    public static void main(String[] args){
        Stack<String> s = new Stack<String>();
        Stack<Integer> s1 = new Stack<Integer>();

        s.push("Hello");
        s.push("Hi");
        s.push("age");
        System.out.println();
        System.out.println(s);
        System.out.println("The size of the array is: " + s.size());
        System.out.println("The pop removes last object: " + s.pop());
        System.out.println("The peak returns reference of the topmost element: " + s.peak());

        s1.push(134);
        s1.push(125);
        s1.push(2);
        s1.push(25);
        System.out.println();
        System.out.println(s1);
        System.out.println("The size of the array is: " + s1.size());
        System.out.println("The pop removes last object: " + s1.pop());
        System.out.println("The peak returns reference of the topmost element: " + s1.peak());
        System.out.println();

    }
}