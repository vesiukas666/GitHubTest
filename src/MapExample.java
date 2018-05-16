import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("Andrius", 22);
        numbers.put("Jonas", 12);
        numbers.put("Kaziukas", 33);
        numbers.put("Andrius", 45);

        for(String a : numbers.keySet()){
            System.out.println("key:" + a + "value" + numbers.get(a));
        }
    }
}
