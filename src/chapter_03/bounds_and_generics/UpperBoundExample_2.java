package chapter_03.bounds_and_generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundExample_2 {
    private static void printUpperBounds(List<? extends MyStringClass> list){
        for(MyStringClass myStringClass: list){
            System.out.println(myStringClass);
        }
    }

    private static void printUpperBounds_2(List<? extends MyStringClass> list){

    }
}

class MyStringClass{
    public static void main(String[] args){
        List<? super MyStringClass> myStringClassList = new ArrayList<>();
        myStringClassList.add(new MyStringClass());
        myStringClassList.add(new MyStringSubclass());
    }
}

class MyStringSubclass extends MyStringClass{

}
