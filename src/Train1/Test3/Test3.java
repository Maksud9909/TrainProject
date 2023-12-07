package Train1.Test3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maksdu");
        list.add("Mak");
        list.add("Oleg");
        showListInfo(list);
    }
    static void showListInfo(List<?> list){
        System.out.println("Here is the all elemnts " + list);
    }
}
