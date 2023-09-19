package Test1;

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
}
