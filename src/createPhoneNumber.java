import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class createPhoneNumber {
    public static String createPhoneNum(int[] numbers) {
        String phoneNumber = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return String.format("(%s) %s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6));
    }
}


// createPhoneNumber.createPhoneNum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) //
// => returns "(123) 456-7890"