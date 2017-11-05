package lab03;

/**
 * Created by Haminata on 04/11/2017.
 *
 */
public class Student {
    //is a class called Student with attributes
    public String name;
    public String gender;
    public int yearOfBirth;

    /**
     * constructor with parameters - called at creation time to initialise attributes
     * @param name represent the first and last name of the student
     * @param gender gender of the student
     * @param yearOfBirth year of birth of the student
     */
    public Student(String name, String gender, int yearOfBirth){
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * method defines the student have been registered
     */
    public void register(){
        System.out.println("You have been registered!");
    }

    /**
     * @return string representation of the class
     */
    public String toString(){
        return "Student(name: " + name + ", gender: " + gender + ", yearOfBirth: " + yearOfBirth + ")";
    }
}
