package lab05;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarks {
    private double[] marks;

    public StudentMarks() {
         marks = new double[7];
    }
    public double[] getMarks(){ // method that access the private instance variable
        return marks;

    }
    public void setMark(int pos, double mark) { //method to set individual mark
        this.marks[pos] = mark;
    }

    public double getMark(int pos){ // method to retrieve individual mark
        return marks[pos];
    }

    public double calcMean(){ //method calculate the mean
        double sum = 0;
        for(int i = 0; i < getMarks().length; i++) {
            sum = sum + getMarks()[i];
        }
        return sum / getMarks().length;

    }

    public int getFirstHighest(){
        int indPos = 0;
        double currentHighest = 0;
        for (int i = 0; i < marks.length; i++) {
            double valueAtI = marks[i];
            if (valueAtI > currentHighest){
                currentHighest = valueAtI;
                indPos = i;
            }
        }
        return indPos;
    }

    public int getLastHighest(){
        int indPos = 0;
        double currentHighest = 0;
        for (int i = 0; i < marks.length; i++) {
            double valueAtI = marks[i];
            if (valueAtI >= currentHighest){
                currentHighest = valueAtI;
                indPos = i;
            }
        }
        return indPos;

    }


}
