package chapter_01.overloading_and_overriding;

/**
 * Created by Syed Wajahat on 12/1/2019.
 */
public class ParentClass {
    public int myMethod() throws Exception {
        return -5;
    }
}

class ChildClassMakko extends ParentClass{
    @Override
    public int myMethod() throws RuntimeException {
        return 500;
    }
}
