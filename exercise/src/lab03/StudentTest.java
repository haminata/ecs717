package lab03;

import java.util.Date;

/**
 * Created by haminata on 04/11/2017
 * In this test class we have two instances of the class Student
 * The Student instances are created using a parametrised constructor on the student class
 * it also call the register method
 */
public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Haminata Camara" ,"female", 1990);
        System.out.println(student1);
        student1.register();

        System.out.println();

        Student student2 = new Student("Rick Sanchez", "male", 1972);
        System.out.println(student2);
        student2.register();

    }
}
