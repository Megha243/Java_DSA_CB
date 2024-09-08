package Week7.Day1;
import java.util.ArrayList;
import java.util.Collections;
public class Array_List {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(); //uses wrapper class instead of primitive datatypes
        //ADD
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("Values:"+arr);
        //GET
        System.out.println("Get:"+arr.get(1));
        //SET
        arr.set(1, 100);
        //SIZE
        System.out.println("Size:"+arr.size());
        //Remove
        // arr.remove(1);
        //DISPLAY
        System.out.println("Values:"+arr);
        //***SORT***
        Collections.sort(arr);
        System.out.println("Values:"+arr);
        //Insert
        arr.add(2,50);
        System.out.println("Values:"+arr);
        arr.clear();
        System.out.println("Values:"+arr);

    }
}
