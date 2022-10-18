import java.util.*;
public class GetSet {
    public static void main(String[] args){
        Pen p1 = new Pen();  //created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());


    }

}

// class BankAccount{
//     public String username;
//     private String password;

//     default void setPassword(String pwd) {
//         password = pwd;

//     }


    
// }
class Pen{
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy,int  che, int math){
//         percentage = (phy+che+math)/3;
//     }

    

// }
