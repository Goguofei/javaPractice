import java.util.Arrays;

public class ArrayStartFromN {
    static int[] take(int[] arr, int n) {
        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }
}

// Create a function that accepts a list/array and a number n,
// and returns a list/array of the first n elements from the list/array.
