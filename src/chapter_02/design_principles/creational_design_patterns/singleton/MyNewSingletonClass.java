package chapter_02.design_principles.creational_design_patterns.singleton;

public class MyNewSingletonClass {
    private MyNewSingletonClass() {
    }

    private volatile static MyNewSingletonClass instance;

    public static MyNewSingletonClass getInstance() {
        if (instance == null) {
            synchronized (MyNewSingletonClass.class) {
                if (instance == null) {
                    instance = new MyNewSingletonClass();
                }
            }
        }
        return instance;
    }
}
