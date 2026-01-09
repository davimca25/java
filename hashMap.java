import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        
        HashMap<String, Double> items = new HashMap<>();

        // Keys & values
        items.put("pizza", 9.99);
        items.put("hamburguer", 6.99);
        items.put("hotdog", 4.99);
        items.put("taco", 5.99);
        items.put("sushi", 14.99);


        // Print keys & values
        for (String value : items.keySet()) {
            System.out.println(value + ": $" + items.get(value));
        }

    }
}
