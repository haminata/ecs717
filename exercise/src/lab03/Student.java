package lab03;

/**
 * Created by haminata on 04/11/2017.
 *
 */
public class Student {
    public String name;
    public String gender;
    public int yearOfBirth;

    public Student(String name, String gender, int yearOfBirth){
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public void register(){
        System.out.println("You have been registered!");
    }

    public String toString(){
        return "Student(name: " + name + ", gender: " + gender + ", yearOfBirth: " + yearOfBirth + ")";
    }
}
