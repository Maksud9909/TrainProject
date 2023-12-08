package Test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(234);
        list.add(23);
        list.add(9);
        list.add(46);
        list.add(1467);
        list.add(39);

        Collections.shuffle(list);
        System.out.println(list);



        System.out.println("----------");
        Collections.sort(list);
        System.out.println(list);

        Integer [] arr = list.toArray(new Integer[0]);


        int index = Arrays.binarySearch(arr,34);
        System.out.println(index);
    }
}
