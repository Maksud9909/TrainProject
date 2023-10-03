package Test1;

import java.util.Objects;

public class Apartment implements Comparable<Apartment> {
    String name;
    String condition;
    int room;
    int price;

    public Apartment(String name, String condition, int room, int price) {
        this.name = name;
        this.condition = condition;
        this.room = room;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", condition='" + condition + '\'' +
                ", room=" + room +
                ", cost=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Apartment apartment) {
        return this.price - apartment.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return room == apartment.room && price == apartment.price && Objects.equals(name, apartment.name) && Objects.equals(condition, apartment.condition);
    }

    @Override
    public int hashCode() {
//        return 1;
        return Objects.hash(name, condition, room, price);
    }
}
