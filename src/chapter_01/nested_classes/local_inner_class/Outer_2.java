package chapter_01.nested_classes.local_inner_class;

public class Outer_2 {
    int a = 5;

    public static void main(String[] args) {
        Outer_2 outer2 = new Outer_2();
        outer2.myMethod();
    }

    public void myMethod() {
        int b = 25;
        class MyLocalInnerClass {
            public void multiply() {
                System.out.println(a * b);
            }
        }
        MyLocalInnerClass myLocalInnerClass = new MyLocalInnerClass();
        myLocalInnerClass.multiply();
    }
}
