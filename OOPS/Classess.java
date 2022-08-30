import java.util.*;

public class Classess {
    public static void main(String[] args){
        // properties

        Person p1 = new Person();
        p1.name= "Prabhakar";
        p1.age=23;

        Person p2 = new Person(31,"Sonu kashyap");

        System.out.println(p1.age+" "+p1.name);

        // behaviour method
        // p1.eat();
        // p1.walk();
        p2.walk();
        p2.walk();
        System.out.println(Person.count);
    }
    
}
class Person{
    String name;
    int age;
    // default constuctor
    
     static int count;
    public Person(){
        count++;

        System.out.println("creating an object");
    }

    public Person(int newAge, String NewName){
        name = NewName;
        age = newAge;
    }

    void walk(){
        System.out.println(name +" is walking.");

    }
    void eat(){
        System.out.println(name+" is eating");
    }

}

    
    






