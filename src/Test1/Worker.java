package Test1;

public class Worker {
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
