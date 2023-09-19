package Test1;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Murad Buildings","New",3,50000);
        Apartment apartment2 = new Apartment("Aristocrat","Used",1,129990);
        Apartment apartment3 = new Apartment("Nest","Used",2,120000);
        Apartment apartment4 = new Apartment("Arilliant","Pre-new",4,500000);
        List<Apartment> list = Arrays.asList(apartment1,apartment2,apartment3,apartment4);
        System.out.println(list);

        System.out.println("-----");
        Collections.sort(list,new NameCompare());
        System.out.println(list);

    }
}


class NameCompare implements Comparator<Apartment> {

    @Override
    public int compare(Apartment apartment1,Apartment apartment2) {
        return apartment1.name.compareTo(apartment2.name);
    }


}