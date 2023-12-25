import java.util.Arrays;

public class FindSmalestInArray {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args)
                .min()
                .orElseThrow();
    }
}
