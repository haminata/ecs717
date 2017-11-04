public class Pattern {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);


        for(int i = 0; i <= value; i = i + 1){

            for(int j = 1; j <= i; j = j + 1){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
/*
if  i does not met the condition then is going to run the body of the loop
j = the body is not gonna be executed the first round


 */