import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class TestCollections {
    public static void main(String[] args) {

        // HashMap class - Hash table based implementation of the Map interface.
        testHashMap();

        // Hashtable class - It consists of synchronized methods. 
        testHashTable();

        // Properties class - A subclass of Hashtable that takes only String type of the key and value.
        testProperties();
        
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

    private static void testHashTable() {
        Map<String, Boolean> map = new Hashtable<>();
        map.put("Cherry tree", false);
        map.put("Pine tree", false);
        map.put("Oak tree", true);
        map.put("Palm tree", true);
    }

    private static void testProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("conf/database.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String username = properties.getProperty("username");
        System.out.println("username property : " + username);
    }
}
