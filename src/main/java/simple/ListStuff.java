package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListStuff {
    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add("Hello");
        ls.add("Bonjour");
        ls.add("你好");

        System.out.println(ls.get(0));

        String s = (String)ls.get(0);
        ls.add(LocalDate.now());

        String s1 = (String)ls.get(3);
    }
}
