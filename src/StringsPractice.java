import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringsPractice {
//Write a function to split a string and convert it into an array of words.
//Examples (Input ==> Output):
//"Robin Singh" ==> ["Robin", "Singh"]
//"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
// ------------------------------------------------------------//
    public String dnaToRna(String dna) {
        return dna.replace("U", "T");
    }
// ----------------------------------------------------------//
    //Given a non-negative integer, 3 for example,
    // return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
    // Input will always be valid, i.e. no negative integers.

    public static String countingSheep(int num) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            builder.append(i).append(" sheep...");
        }
        return builder.toString();
    }
// -------------------------------------------------------------//
//Complete the solution so that it reverses all of the words within the string passed in.
//Words are separated by exactly one space and there are no leading or trailing spaces.
//Example(Input --> Output):
//"The greatest victory is that which requires no battle" -->
// "battle no requires which that is victory greatest The"

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
// -----------------------------------------------------------//
    //* "String"      -> "SSttrriinngg"
    //* "Hello World" -> "HHeelllloo  WWoorrlldd"
    //* "1234!_ "     -> "11223344!!__  "

    public static String doubleChar(String s){
        return s.chars().mapToObj(e -> String.valueOf((char) e)
                + (char) e).collect(Collectors.joining(""));
        //return s.replaceAll(".", "$0$0");
    }
// ---------------------------------------------------------------------//
//All of the animals are having a feast! Each animal is bringing one dish.
// There is just one rule: the dish must start and end with the same letters as the animal's name.
// For example, the great blue heron is bringing garlic naan
// and the chickadee is bringing chocolate cake.
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0)
                && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
// ----------------------------------------------------------------------//
    //("Hello", "o")  ==>  1
    //("Hello", "l")  ==>  2
    //("", "z")       ==>  0
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(e -> e == letter).count();
    }
// ------------------------------------------------------------------------//
    public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? 10 : 1) * salary;
    }
// --------------------------------------------------------------------------//
    public static String correct(String string) {
        return string.replace("5", "S")
                .replace("1", "I").replace("0", "O");
    }
// --------------------------------------------------------------------------//
    //You will be given a list of strings. You must sort it alphabetically
    // (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
    //The returned value must be a string, and have "***" between each of its letters.
    //You should not remove or add elements from/to the array.
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
// --------------------------------------------------------------------------- //
//write me a function stringy that takes a size and returns a string of alternating 1s and 0s.
//the string should start with a 1.
//a string with size 6 should return :'101010'.
    public static String stringy(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result = i % 2 == 1? result.append("1") : result.append("0");
        }
        return result.toString();
    }
// ---------------------------------------------------------------------------------- //
//Your goal is to return multiplication table for number that is always an integer from 1 to 10.
//For example, a multiplication table (string) for number == 5 looks like below:
//1 * 5 = 5
//2 * 5 = 10
//3 * 5 = 15
//4 * 5 = 20
//5 * 5 = 25
//6 * 5 = 30
//7 * 5 = 35
//8 * 5 = 40
//9 * 5 = 45
//10 * 5 = 50
//P. S. You can use \n in string to jump to the next line.
//Note: newlines should be added between rows, but there should be no
// trailing newline at the end. If you're unsure about the format, look at the sample tests.
    public static String multiTable(int num) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            builder.append(i + " * " + num + " = " + result + System.lineSeparator());
        }
        return builder.toString().trim();
    }
// --------------------------------------------------------------------------------- //
    //In this kata you need to check the provided array (x) for good ideas 'good'
    // and bad ideas 'bad'.
    // If there are one or two good ideas, return 'Publish!',
    // if there are more than 2 return 'I smell a series!'.
    // If there are no good ideas, as is often the case, return 'Fail!'.
    public static String well(String[] x) {
        int count = 0;
        for (String idea : x) {
            if (idea.equals("good")) {
                count ++;
            }
        }
        return count == 0 ? "Fail!" : (count > 2 ? "I smell a series!" : "Publish!");
    }
// ---------------------------------------------------------------------------------- //
    //Create a method that takes as input a name, city, and state to welcome a person.
    // Note that name will be an array consisting of one or more values
    // that should be joined together with one space between each,
    // and the length of the name array in test cases will vary.
    //Example:
    //['John', 'Smith'], 'Phoenix', 'Arizona'
    //This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
    public String sayHello(String[] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }

// ---------------------------------------------------------------------------------- //
    //Since Nessie is a master of disguise, the only way accurately tell is
    // to look for the phrase "tree fiddy". Since you are tired of being grifted by this monster,
    // the time has come to code a solution for finding The Loch Ness Monster.
    // Note that the phrase can also be written as "3.50" or "three fifty".
    // Your function should return true if you're talking with The Loch Ness Moster, false otherwise.
    public static boolean isLockNessMonster(String s){
        return s.contains("tree fiddy") || s.contains("three fifty") || s.contains("3.50");
    }

// --------------------------------------------------------------------------------------- //
//If your name would be Jeong-Ho Aristotelis,
// ad would cost £600. 20 letters * 30 = 600 (Space counts as a character).
    static int billboard(String name, int price) {
        return name.repeat(price).length();
    }
// ----------------------------------------------------------------------------------------- //

}




