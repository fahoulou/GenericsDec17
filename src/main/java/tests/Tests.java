package tests;

import java.util.function.Predicate;

public class Tests {
    public static boolean isTheSame(String toTest, Predicate<? super String> theTest) {
        return theTest.test(toTest);
    }

    public static void main(String[] args) {
        String s = "Hello";
        String t = s;
        String u = "He";
        u = u + "llo";
        String v = "Different";

        Predicate<String> sameContentsAsS = x -> x.equals(s);
        System.out.println("s sameContentsAs t? " + isTheSame(t, sameContentsAsS));
        System.out.println("s sameContentsAs u? " + isTheSame(u, sameContentsAsS));
        System.out.println("s sameContentsAs v? " + isTheSame(v, sameContentsAsS));

        Predicate<Object> sameObjectAsS = x -> x == s;
        System.out.println("s sameObjectAs t? " + isTheSame(t, sameObjectAsS));
        System.out.println("s sameObjectsAs u? " + isTheSame(u, sameObjectAsS));
        System.out.println("s sameObjectAs v? " + isTheSame(v, sameObjectAsS));
    }
}
