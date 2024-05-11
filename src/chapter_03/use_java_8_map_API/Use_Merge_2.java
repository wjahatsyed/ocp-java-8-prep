package chapter_03.use_java_8_map_API;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Use_Merge_2 {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Zaynab", "Bus Tour");
        favorites.put("Zeeshan", "Tram traveller");
        System.out.println(favorites);

        favorites.merge("Zaynab", "Air Traveller", mapper);
        System.out.println(favorites);

    }
}
