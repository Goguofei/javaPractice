import java.util.Arrays;

public class ArraySum {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
