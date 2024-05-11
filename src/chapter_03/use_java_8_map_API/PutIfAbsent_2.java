package chapter_03.use_java_8_map_API;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsent_2 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("Wajahat", "Adil");
        map.put("Wajahat", "Syed Muhammad Adil");
        map.putIfAbsent("Zeeshan", "Adil");;
        System.out.println(map);
    }
}
