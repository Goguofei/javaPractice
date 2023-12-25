public class ValidationUsername {
    public static boolean validateUsr(String s) {
        char[] chars = s.toCharArray();
        boolean success = true;

        if (s.length() > 16 || s.length() < 4) {
            success = false;
        }

        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                success = false;
            } else if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !(ch == '_')) {
                success = false;
            }
        }
        return success;
    }
}

//Write a simple regex to validate a username. Allowed characters are:
//
//lowercase letters,
//numbers,
//underscore
//Length should be between 4 and 16 characters (both included).

//public static boolean validateUsr(String s) {
//    return s.matches("[a-z_\\d]{4,16}");
//  }