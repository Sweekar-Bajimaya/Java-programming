import java.util.*;
public class Keyvalue {
    public static void main(String args[]){
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Samsung");
        hash_map.put(2, "Iphone");
        hash_map.put(3, "Vivo");
        hash_map.put(4, "Xaomi");
        System.out.println("Size of the map is: " + hash_map.size());
    }
}
