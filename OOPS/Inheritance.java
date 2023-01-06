import java.util.*;
public class Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
    }
}
// Parent/Base Class 
class Animal{
    String color;  //properties
    void eat(){    // function
        System.out.println("eat function is called");
    }
    void breathe(){ // function
        System.out.println("breathes function is called");
    }
}
//Child Class / Derived Class
class Fish extends Animal{
    int fins;
    void swim(){ // function
        System.out.println("swim function is called");
    }

}
