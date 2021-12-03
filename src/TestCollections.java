import java.util.HashMap;
import java.util.Map;

public class TestCollections {
    public static void main(String[] args) {

        // HashMap class - Hash table based implementation of the Map interface.
        testHashMap();
        
    }

    /**
     * Pine tree value : false
     * Key : Pine tree, Value : false
     * Key : Palm tree, Value : true
     * Key : Cherry tree, Value : false
     * Key : Oak tree, Value : true
     * map size : 4
     * map contains Oak tree? true
     * map contains true? true
     * map contains Palm tree? false
     * map size : 0
     */
    private static void testHashMap() {

        // put() method
        Map<String, Boolean> map = new HashMap<>();
        map.put("Cherry tree", false);
        map.put("Pine tree", false);
        map.put("Oak tree", true);
        map.put("Palm tree", true);

        // get() method
        System.out.println("Pine tree value : " + map.get("Pine tree"));
        
        // ATTENTION: parentheses are optional only if there is a single parameter.
        // They are necessary if there are zero, two, or more parameters.
        map.forEach((key, value) -> System.out.printf("Key : %s, Value : %b\n", key, value));
        
        // size() method
        System.out.println("map size : " + map.size());

        // containsKey/Value() method
        System.out.println("map contains Oak tree? " + map.containsKey("Oak tree"));
        System.out.println("map contains true? " + map.containsValue(true));

        // remove() method
        map.remove("Palm tree");
        System.out.println("map contains Palm tree? " + map.containsKey("Palm tree"));

        // clear() method
        map.clear();
        System.out.println("map size : " + map.size());
    }
}
