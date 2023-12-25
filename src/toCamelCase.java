import java.lang.StringBuilder;
import java.util.Arrays;

class toCamelCase{
    static String toCamelCase1(String s) {
        String[] words = s.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .reduce(words[0], String::concat);

    }
}

//        char[] chars = s.toCharArray();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '-' || chars[i] == '_') {
//                result.append(Character.toUpperCase(chars[i + 1]));
//                i++;
//            } else {
//                result.append(chars[i]);
//            }
//        }
//        return result.toString();
