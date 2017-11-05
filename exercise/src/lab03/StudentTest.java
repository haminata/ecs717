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

        // create a student using my name, gender and year of birth
        Student student1 = new Student("Haminata Camara", "female", 1990);
        System.out.println(student1);
        student1.register();

        System.out.println();

        // second student using exercise specification
        Student student2 = new Student("Rick Sanchez", "male", 1972);
        System.out.println(student2);
        student2.register();

    }
}
