package chapter_01.overloading_and_overriding;

/**
 * Created by Syed Wajahat on 3/3/2020.
 */
public class OverridingExample {
    protected void myMethod() throws Exception {
    }
}

class ClassWjahat extends OverridingExample{
    @Override
    protected void myMethod() throws MyException {
        //super.myMethod();
        System.out.println("Pakistan -> Poland, Karachi -> Krakow");
    }
}

class MyException extends Exception{

}
