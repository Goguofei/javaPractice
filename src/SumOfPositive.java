import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
        return Arrays.stream(arr)
                .filter(num -> num > 0)
                .sum();
    }
}


//You get an array of numbers, return the sum of all the positives ones.
//
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//Note: if there is nothing to sum, the sum is default to 0.