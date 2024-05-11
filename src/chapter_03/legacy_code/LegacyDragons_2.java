package chapter_03.legacy_code;

import java.util.ArrayList;
import java.util.List;

public class LegacyDragons_2 {
    public static void main(String[] args){
        List unicornList = new ArrayList();
        unicornList.add(new Unicorn_2());
        print(unicornList);

    }
    private static void print(List<Dragon_2> dragon_2List){
        for(Dragon_2 dragon2: dragon_2List){
            System.out.println(dragon2);
        }
    }
}

class Unicorn_2{

}

class Dragon_2{

}
