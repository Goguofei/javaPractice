public class BestScoreInClass {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return java.util.Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
// are you better than an average score in the class