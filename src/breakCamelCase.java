public class breakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

}

// Input: "HelloWorld"
// Output: "Hello World"

//public static String camelCase(String input) {
//        char[] chars = input.toCharArray();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isUpperCase(chars[i])) {
//                result.append(" " + chars[i]);
//            } else {
//                result.append(chars[i]);
//            }
//        }
//        return result.toString();
//    }