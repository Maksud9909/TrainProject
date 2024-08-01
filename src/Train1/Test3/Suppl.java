package Train1.Test3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Suppl {
    public static void main(String[] args) {
        Suppl suppl = new Suppl();
        suppl.changeStr("Maksud", new Consumer<String>() {
            @Override
            public void accept(String s) {
                s = "Anton";
                System.out.println(s);
            }
        });


        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(29);
        list.add(2);
        list.add(23);
        list.add(56);



        List<Integer> anotherList = list.stream()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(anotherList);



    }

    public void changeStr(String s,Consumer<String> consumer){
        consumer.accept(s);
    }


}
