package chapter_02.functional_programming;

@FunctionalInterface
public interface NewFunctionalInterface {
    public void myMethod();
}

class NewClass implements NewFunctionalInterface{
    @Override
    public void myMethod() {

    }
}
