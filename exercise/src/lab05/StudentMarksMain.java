package lab05;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarksMain {
    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks();

        Scanner getValue = new Scanner(System.in);
        System.out.println("Enter all student marks (each separated by space): ");
        String marks = getValue.nextLine();

        String[] marksArray = marks.split(" ");
        for(int i = 0; i < marksArray.length; i++){
            double mark = Double.parseDouble(marksArray[i]);
            s1.setMark(i, mark);
        }

        System.out.println("Student Marks: " + Arrays.toString(s1.getMarks()));
        System.out.println("Mean is: " + s1.calcMean());
        System.out.println("The first highest mark index: " + s1.getFirstHighest());
        System.out.println("The last highest mark index: " + s1.getLastHighest());

    }
}
