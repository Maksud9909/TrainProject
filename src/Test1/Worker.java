package Test1;

import java.io.Serializable;

public class Worker implements Serializable {
    String name;
    String position;
    int age;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }

    public Worker(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }
}
