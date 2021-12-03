import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestArray {
    public static void main(String[] args) throws Exception {
        int[] intArr = {50, 10, 20, 30};

        // asList() method
        testAsList(intArr);

        // copyOf() method
        testCopyOf(intArr);
        
        // sort() method
        testSort(intArr);

        // binarySearch() method
        testBinarySearch(intArr);
        
        // fill() method
        testFill(intArr);
    }

    /**
     * int[] => List<Integer>
     * @param intArr
     */
    private static void testAsList(int[] intArr) {
        // Problem
        // List<Integer> list = Arrays.asList(intArr); doesn't work, because you can't have a list of a primitive type.
        
        // Solution #1
        List<Integer> list1 = Arrays.asList(50, 10, 20, 30);

        // Solution #2
        Integer[] integerArr = {50, 10, 20, 30}; 
        List<Integer> list2 = Arrays.asList(integerArr);

        // Solution #3 - boxed() : An intermediate operation returning a Stream consisting of the elements of this stream, each boxed to an Integer.
        List<Integer> list3 = Arrays.stream(intArr).boxed().collect(Collectors.toList());
    }

    /**
     * newArr : [50, 10, 20, 30]
     * @param intArr
     */
    private static void testCopyOf(int[] intArr) {
        int[] newArr = Arrays.copyOf(intArr, intArr.length);
        System.out.println("newArr : " + Arrays.toString(newArr)); // *Simplest way to print out elements of an array
    }

    /**
     * intArr : [10, 20, 30, 50]
     * boxedArr : [50, 30, 20, 10]
     * @param intArr
     */
    private static void testSort(int[] intArr) {
        // Ascending order
        Arrays.sort(intArr);
        System.out.println("intArr : " + Arrays.toString(intArr));

        // Descending order
        List<Integer> list = Arrays.stream(intArr).boxed().collect(Collectors.toList()); // Int[] => List<Integer>
        Integer[] boxedArr = list.stream().toArray(Integer[]::new); // List<Integer> => Integer[]
        Arrays.sort(boxedArr, Collections.reverseOrder());
        System.out.println("boxedArr : " + Arrays.toString(boxedArr));
    }

    /**
     * idxOfSearchKey : 3
     * @param intArr
     */
    private static void testBinarySearch(int[] intArr) {
        Arrays.sort(intArr); // The array needs to be sorted before you use the binarySearch method.
        int idxOfSearchKey = Arrays.binarySearch(intArr, 50);
        System.out.println("idxOfSearchKey : " + idxOfSearchKey);
    }

    /**
     * [99, 99, 99, 99]
     * @param intArr
     */
    private static void testFill(int[] intArr) {
        Arrays.fill(intArr, 99);
        System.out.println(Arrays.toString(intArr));
    }
}
