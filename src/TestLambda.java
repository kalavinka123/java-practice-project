import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestLambda {
    public static void main(String[] args) {

        // Functional interface : Accept no input, Return no output
        testFunctionalInterface1();

        // Lambda Practical Usage
        testForEach();

        // Consumer interface : Accept input, Return no output
        testConsumerInterface();
    }

    /**
     * With curly braces
     * Without curly braces
     */
    private static void testFunctionalInterface1() {
        TestLambdaFuncIf funcIf1 = () -> { System.out.println("With curly braces"); };
        TestLambdaFuncIf funcIf2 = () -> System.out.println("Without curly braces"); // Only one line can be without curly braces;
        funcIf1.execute();
        funcIf2.execute();
    }

    /**
     * apple
     * banana
     * pomegranate
     */
    private static void testForEach() {
        List<String> list = Arrays.asList("apple", "banana", "pomegranate");

        // The forEach method takes "Consumer" interface.
        list.forEach(System.out::println);
    }

    /**
     * 35
     * 900
     */
    private static void testConsumerInterface() {
        Consumer<Integer> consumer = t -> System.out.println(t);
        consumer.accept(35);
        consumer.accept(900);
    }
}