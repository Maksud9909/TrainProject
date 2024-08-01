package Train;

import java.util.ArrayList;
import java.util.List;

public class ParametarizedClass {
    public static void main(String[] args) {

    }






}

class Pair <T,V,U>{
    T t;
    V v;
    U u;

    public Pair(T t, V v, U u) {
        this.t = t;
        this.v = v;
        this.u = u;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t=" + t +
                ", v=" + v +
                ", u=" + u +
                '}';
    }
}