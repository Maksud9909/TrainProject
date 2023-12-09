package Train1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class Lambda {



    public static void main(String[] args) {
        Student student1 = new Student("Feruza",'f',23,4.5);
        Student student2 = new Student("Shuhrat",'m',242,3.6);
        Student student3 = new Student("Maksud",'m',13,4.7);
        Student student4 = new Student("Shokhafiz",'m',43,5);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);


    }
}
