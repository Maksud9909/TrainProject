package Test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list1.add(2);

        System.out.println(list1.subList(0,3));

        Object [] arr = list1.toArray();
        for (Object a:
             arr) {
            System.out.println(a);
        }








    }
}
