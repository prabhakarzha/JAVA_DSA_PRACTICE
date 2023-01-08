import java.util.*;
public class Example {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add operation of ArrayList java Collection Framework
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //get operation
 
        int element =list.get(2);
        System.out.println(element);

        //remove element

        list.remove(2);
        System.out.println(list);




    }
    
}
