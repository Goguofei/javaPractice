public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}


//  public static String repeatStr(final int repeat, final String string) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < repeat; i++)
//            stringBuilder.append(string);
//        return stringBuilder.toString();
//    }