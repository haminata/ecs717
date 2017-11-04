package lab02;

public class PatternMethod {
    public void printPattern (int n){
        for(int i = 0; i <= n; i = i + 1){
            for(int j = 1; j <= i; j = j + 1){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        PatternMethod p = new PatternMethod();
        p.printPattern(value);
    }
}
