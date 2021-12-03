import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "pomegranate");

        // The forEach method takes "Consumer" interface.
        list.forEach(System.out::println);
    }
}
