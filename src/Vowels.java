public class Vowels {
    public static int getCount(String str) {
        int sum = 0;
        char[] chars = str.toCharArray();
        String vowels = "aoeiu";

        for (char aChar : chars) {
            if (vowels.indexOf(aChar) != -1) {
                sum++;
            }
        }
        return sum;
    }
}
