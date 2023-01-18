import java.util.*;
public class Comparing {
    public static void main (String [] args){
        HashSet<String> bike = new HashSet<String>();
        bike.add("Hero");
        bike.add("Honda");
        bike.add("Suzuki");
        bike.add("Yamaha");
        bike.add("Jawa");
        System.out.println("Bike Hashset: "+bike);

        HashSet<String> cars= new HashSet<String>();
        cars.add("Honda");
        cars.add("Suzuki");
        cars.add("Lamborghini");
        cars.add("Bugatti");
        cars.add("Hyaundai");
        System.out.println("Cars Hashset: " +cars);
        bike.retainAll(cars);
        System.out.println("Hashset content: ");
        System.out.println(bike);
    }
}

