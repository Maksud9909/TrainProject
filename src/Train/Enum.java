package Train;

public class Enum {
    Cars cars;

    public Enum(Cars cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "cars=" + cars +
                '}';
    }

    public static void main(String[] args) {
        Enum cars = new Enum(Cars.AUDI);
        System.out.println(cars);
    }
}
enum Cars{
    BMW,MB,AUDI,Chevrolet;

    public static void changeCar(Cars cars){
        System.out.println("You changed your car to this " + cars);

    }
}

