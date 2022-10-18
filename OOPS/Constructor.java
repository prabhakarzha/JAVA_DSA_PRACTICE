import java.util.*;
public class Constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        // System.out.println(s1.name);
        Student s2 = new Student("sonukashyap");
        String s3 = new Student(4);

    }
    
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }


}
