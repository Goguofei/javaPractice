import java.util.List;
import java.util.stream.Collectors;

public class SortListTextbooks {
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }
}

////use sort() from Collections with the static field of String class to ensure case insensitivity
//    Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
//    return textbooks;