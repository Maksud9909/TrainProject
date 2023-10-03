package Test1;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Murad Buildings","New",3,50000);
        Apartment apartment2 = new Apartment("Aristocrat","Used",1,129990);
        Apartment apartment3 = new Apartment("Nest","Used",2,120000);
        Apartment apartment4 = new Apartment("Arilliant","Pre-new",4,500000);
        HashMap <String,Apartment> hashMap = new HashMap<String, Apartment>();
        hashMap.put("Maqsud",apartment1);
        hashMap.put("Anton",apartment2);
        hashMap.put("Galibek",apartment2);
        hashMap.put("Afzal",apartment3);
        hashMap.put("Rahmon",apartment4);
        System.out.println(hashMap.get("Maqsud").hashCode());
        System.out.println(hashMap.get("Anton").hashCode());

    }
}
