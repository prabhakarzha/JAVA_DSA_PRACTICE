import java.util.*;

public class Classess {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name= "Prabhakar";
        p1.age=23;

        System.out.println(p1.age+" "+p1.name);
    }
    
}

class Person{
    String name;
    int age;

}



