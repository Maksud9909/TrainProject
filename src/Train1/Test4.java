package Train1;

import java.util.ArrayList;
import java.util.function.Predicate;


class StudentInfo{
    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate){
        for (Student st: arrayList){
            if (predicate.test(st)){
                System.out.println(st);
            }
        }
    }
}
public class Test4 {
    public static void main(String[] args) {
        Student student1 = new Student("Feruza",'f',23,4.5);
        Student student2 = new Student("Shuhrat",'m',242,3.6);
        Student student3 = new Student("Maksud",'m',13,4.7);
        Student student4 = new Student("Shokhafiz",'m',43,5);

        ArrayList<Student>studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        StudentInfo info = new StudentInfo();

        Predicate<Student> predicate1 = student -> student.sex == 'm';
        Predicate<Student> predicate2 = student -> student.mark==4.7;
        info.testStudents(studentArrayList,predicate1.and(predicate2));




    }

}


class Student{
    String name;
    char sex;
    int id;
    double mark;

    public Student(String name, char sex, int id, double mark) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", id=" + id +
                ", mark=" + mark +
                '}';
    }
}
interface StudentCheck2 {
    boolean check(Student student);
}

class CheckOverMarking implements StudentCheck2{

    @Override
    public boolean check(Student student) {
        return student.mark>=4.4;
    }
}