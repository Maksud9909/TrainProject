package Test4;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Maksud",18);
        hashmap.put("Alex",23);
        hashmap.put("Rahmon",45);
        System.out.println(hashmap);

        Set<String> set = hashmap.keySet();
        System.out.println(set);




        Student student1 = new Student("Maksud",18,"WIUT");
        Student student2 = new Student("Anton",23,"WIT");
        Student student3 = new Student("Rahmon",42,"IUT");
        HashMap<Student,Integer> studentIntegerHashMap = new HashMap<>();
        studentIntegerHashMap.put(student1,5);
        studentIntegerHashMap.put(student2,4);
        studentIntegerHashMap.put(student3,3);

        Student student4 = new Student("Rahmon",42,"IUT");



        boolean result = studentIntegerHashMap.containsKey(student4);
        System.out.println(result);



    }

}



class Student {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(uni, student.uni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, uni);
    }

    String name;
    int age;
    String uni;

    public Student(String name, int age, String uni) {
        this.name = name;
        this.age = age;
        this.uni = uni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
}
