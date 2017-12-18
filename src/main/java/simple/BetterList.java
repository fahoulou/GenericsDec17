package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetterList {
    public static void addItem(List l) {
        l.add(0, LocalDate.now());
    }

    public static void main(String[] args) {

//        List<String> ls = new ArrayList<>();
//        ls = Collections.checkedList(ls, String.class);
        List<String> ls = Collections.checkedList(new ArrayList<>(), String.class);

        ls.add("Hello");
        ls.add("Bonjour");
        ls.add("你好");

        addItem(ls);
        System.out.println(ls.get(0));

        String s = ls.get(0);
//        ls.add(LocalDate.now());

        String s1 = ls.get(3);
    }
}
