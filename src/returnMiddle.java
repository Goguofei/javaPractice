public class returnMiddle {
    public static String getMiddle(String word) {
        final int LENGTH = word.length();
        return LENGTH % 2 == 0 ? word.substring(LENGTH / 2 - 1, LENGTH / 2 + 1)
                : word.substring(LENGTH / 2, LENGTH / 2 + 1);

    }
}
