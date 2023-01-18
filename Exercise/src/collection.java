import java.util.HashMap;
public class collection {
    public static void main(String args[]){
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Samsung");
        hash_map.put(2, "Iphone");
        hash_map.put(3, "Vivo");
        hash_map.put(4, "Xaomi");
        System.out.println("Collection view of the map is: " + hash_map.values());
    }
}

