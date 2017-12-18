package inferecefailure;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Inferrit {

    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        map.put("Fred", 3L);
        map.put("Jim", 5L);
        map.put("Sheila", 2L);

        Comparator<Map.Entry<String, Long>> byValue = Map.Entry.comparingByValue();
        Comparator<Map.Entry<String, Long>> byValueRev = byValue.reversed();

        map.entrySet()
                .stream()
//                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
//                .sorted(byValueRev)
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
