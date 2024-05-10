package chapter_03.bounds_and_generics;

import java.util.ArrayList;
import java.util.List;

public class Unbounded_WildCards_Immutable {

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add(i + " number");
        }
        printList(stringList);

        List<Integer> integerList = new ArrayList<>();
        int j=1;
        while(j<6){
            System.out.println(j);
            j++;
        }
        printList(integerList);
    }
}
