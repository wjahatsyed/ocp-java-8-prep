package chapter_01.overloading_and_overriding;

import chapter_01.access_modifiers.package_A.ParentClass;

/**
 * Created by Syed Wajahat on 12/1/2019.
 */
public class ChildClass extends ParentClass {
    @Override
    public int myMethod(){
        System.out.println("As this is overriding method in superclass" +
                "it must not throw any broader exception but the same or subclass" +
                "of the checked exception or throw any RunTime Exception");
        return -10;

    }
}
