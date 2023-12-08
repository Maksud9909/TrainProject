package Test4;

import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(45,"Maksud");
        treeMap.put(2,"Alex");
        treeMap.put(5,"Anton");
        treeMap.put(2,"Rahmon");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap);
    }

}
