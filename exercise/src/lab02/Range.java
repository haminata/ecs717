package lab02;

/**
 * Created by haminata on 05/11/2017.
 */
public class Range {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        //System.out.println(start); // 5
        //System.out.println(end); // 9

        if (start > end){
            System.out.println("Error reverse your input");
        }
//        int result = start;
//        result = result + 6;
//        result = result + 7;
//        result = result + 8;
//        result = result + 9;
//        System.out.println(result);

        int result = 0;
        for (int i = start; i <= end; i++) {
            result = i + result;
            System.out.println(result);

        }
    }
}
