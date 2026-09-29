package DSA;
//HASHMAP CREATION AND ITS FUNCTION
import java.util.HashMap;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        //INSERTION
        map.put("India" , 100);
        map.put("China" , 150);
        map.put("Us" , 20);

        System.out.println(map);

        //GET OPERATION
        int a = map.get("India");
        System.out.println(a);
        int b = map.get("Us");
        System.out.println(b);
        System.out.println(map.get("Pak"));

        //CONTAIN OPERATION
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Us"));
        System.out.println(map.containsKey("Pak"));

        //REMOVE OPERATION
        map.remove("China");
        map.remove("Us");
        map.remove("pak");

        System.out.println(map);

        //SIZE OPERATION
        System.out.println(map.size());

        //EMPTY OPERATION
        System.out.println(map.isEmpty());

        //CLEAR OPERATION
        map.clear();
        System.out.println(map.isEmpty());
    }
}