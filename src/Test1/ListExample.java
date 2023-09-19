package Test1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList();
        list.add(987.0);
        list.add(23452345.0);
        list.add(123455.0);
        list.add(1234.0);
        list.add(1234.0);
        double res = sum(list);
        System.out.println(res);
    }

    public static double sum(ArrayList <? extends Number> arrayList){
        double result = 0;
        for (Number n:
             arrayList) {
            result+=n.doubleValue();
        }
        return result;
    }
}
