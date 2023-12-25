import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysPractice {
// Create a function with two arguments that will return an array of the first n multiples of x.
//Assume both the given number and the number of times to count will be positive numbers greater than 0.
//Return the results as an array or list ( depending on language ).
//Examples
//countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
//countBy(2,5)  // should return {2,4,6,8,10}

    public static int[] countBy(int x, int n){
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = x * i;
        }
        return result;
    }
// ---------------------------------------------------------------------------//
    public static int getAverage(int[] marks){
        return (int) Arrays.stream(marks).average().orElse(0);
    }
// --------------------------------------------------------------------------- //
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
// --------------------------------------------------------------------------- //
    public static Object[] removeEverySecondObject(Object[] arr) {
        Object[] output = new Object[(arr.length + 1) / 2];
        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i * 2];
        }
        return output;
    }
// --------------------------------------------------------------------------- //
    public static int[] monkeyCountOneToN(final int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }
// ---------------------------------------------------------------------------- //
//Find the first non-consecutive number
    public static Integer find(final int[] array) {
        if (array.length <= 1) {
            return null;
        }
        Integer breaker = null;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                breaker = array[i + 1];
                break;
            }
        }
        return breaker;
    }
// ------------------------------------------------------------------------------ //
    public static String howMuchILoveYou(int nb_petals) {
        String[] arr = {"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        return arr[nb_petals % 6];
    }
// -------------------------------------------------------------------------------- //
    public static String[] fixTheMeerkat(String[] arr) {
        return new String[] {arr[2], arr[1], arr[0]};
    }
// -------------------------------------------------------------------------------- //
    //In this simple exercise, you will build a program that takes a value, integer ,
// and returns a list of its multiples up to another value, limit .
// If limit is a multiple of integer, it should be included as well.
// There will only ever be positive integers passed into the function,
// not consisting of 0. The limit will always be higher than the base.
//For example, if the parameters passed are (2, 6), the function should
// return [2, 4, 6] as 2, 4, and 6 are the multiples of 2 up to 6.

    public static int[] find(int base, int limit) {
        int[] result = new int[limit / base];
        for (int i = 0; i < result.length; i++) {
            result[i] = base * (i + 1);
        }
        return result;

        //IntStream.iterate(base, i -> i <= limit, i -> i + base).toArray();
    }
// ---------------------------------------------------------------------------------- //
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(num -> num % divider == 0).toArray();
    }
// ---------------------------------------------------------------------------------- //
    //Examples (input -> output:
//* 'R', [3, 2, 1, 2]      ->  [1, 2, 2, 3]
//* 'L', [1, 4, 5, 3, 5 ]  ->  [5, 5, 4, 3, 1]

    public static int[] flipArray(char dir, int[] arr) {
        if (dir == 'L') {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            Arrays.sort(arr);
        }
        return arr;
    }
// ------------------------------------------------------------------------------------- //
    //[4,3,9,7,2,1] -> [2,9,3,49,4,1]
    public static int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) * Math.sqrt(array[i]) == array[i]) {
                result[i] = (int) Math.sqrt(array[i]);
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }
// --------------------------------------------------------------------------------------- //
//Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
//Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"
//Input: ["sheep", "sheep", "wolf"]
//Output: "Pls go away and stop eating my sheep"

    public static String warnTheSheep(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number "
                + pos + "! You are about to be eaten by a wolf!";
    }
// --------------------------------------------------------------------------------------- //
//Input: Array of elements
//["h","o","l","a"]
//Output: String with comma delimited elements of the array in th same order.
//"h,o,l,a"

    public static String printArray(Object[] array) {
        return Arrays.stream(array).collect(String.join(","));
    }
// ----------------------------------------------------------------------------------------- //

}

