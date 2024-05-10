package chapter_03.bounds_and_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syed Wajahat on 12/15/2019.
 */
public class LowerBound_Example {
    public static void main(String[] args) {
        List<? super Object> objects = new ArrayList<>();
        Object o = "Sami";
        objects.add(o);
        objects.add("Wajahat");
        objects.add("Object and anything that has Object as a super class");
        objects.add(new Manchester("Java Developer at IBM."));
        objects.forEach(System.out::println);

    }

}

class Manchester{
    private final String name;
    public Manchester(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}



