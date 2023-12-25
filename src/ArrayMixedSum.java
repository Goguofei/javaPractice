import java.util.List;

public class ArrayMixedSum {

    /*
     * Assume input will be only of Integer or String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(e -> Integer.parseInt(String.valueOf(e))).sum();
    }
}
//Given an array of integers as strings and numbers,
// return the sum of the array values as if all were numbers.
