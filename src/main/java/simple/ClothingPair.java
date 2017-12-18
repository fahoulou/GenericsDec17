package simple;

public class ClothingPair<F extends Colored & Sized /*, String */> extends Pair<F> {
//    String x;
//    java.lang.String y;

    public ClothingPair(F left, F right) {
        super(left, right);
//        x = "Hello"; // Even though x storage seems to be "Object" still cannot
        // do this, as the usage determines the limits of valid x...
    }

    // type var declaration <G> isn't used here, but is legal
    public <G> boolean isMatched() {
//         could we use "instanceof Colored" and a cast -- well, yes, but DON'T!
        return left.getColor().equals(right.getColor())
            && left.getSize() == right.getSize();
    }

    public static <F extends Sized & Colored> boolean matches(ClothingPair<F> p) {
//        return p.left.getColor().equals(p.right.getColor())
//                && p.left.getSize() == p.right.getSize();
        return p.isMatched();
    }
}
