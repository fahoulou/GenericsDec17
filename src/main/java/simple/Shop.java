package simple;

import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {
        // RAW types do not get checked
//        Pair ps = new Pair("Fred", LocalDate.now());
        Pair<String> ps = new Pair<>("Fred", "Jones");

        // type checking rejects this.
//        ps.setRight(LocalDate.now());
        ps.setRight("Smith");

        // ClothingPair's bound rejects String, because it's not Colored
//        ClothingPair<String> bad;
        ClothingPair<Shoe> pShoe = new ClothingPair<>(
                new Shoe("Black", 44), new Shoe("Black", 43));

        System.out.println("shoes match? " + pShoe.isMatched());
    }
}
