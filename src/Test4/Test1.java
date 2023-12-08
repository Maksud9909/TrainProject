package Test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

        Integer valueRemove = 1;
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            Integer currentValue = iterator.next();
            if (currentValue.equals(valueRemove)){
                iterator.remove();
            }
        }
        for (Integer val:
                list1) {
            System.out.println(val);
        }
    }
}
