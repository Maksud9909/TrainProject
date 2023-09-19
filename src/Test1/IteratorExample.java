package Test1;

import java.util.*;
import java.util.stream.Collectors;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(234,23,34,5,2,3,4,2342);
        Collections.sort(list);
        int index = Collections.binarySearch(list,234);
        System.out.println(index);
    }
}
