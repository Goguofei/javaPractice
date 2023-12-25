import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test {


////////////////////////////////////////////////////////////
    public static boolean checkIfIsPresentInArray(Object[] a, Object x) {
        // Your code here
        return Arrays.asList(a).contains(x);
    }
////////////////////////////////////////////////////////////
}

//return new StringBuilder(str).reverse().toString();
