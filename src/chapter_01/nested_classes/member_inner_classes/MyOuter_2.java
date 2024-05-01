package chapter_01.nested_classes.member_inner_classes;

public class MyOuter_2 {
    public static void main(String[] args){
        MyOuter_2 myOuter2 = new MyOuter_2();
        myOuter2.new MyInnerClass().myInnerClassMethod();
    }
    private class MyInnerClass{
        public void myInnerClassMethod(){
            System.out.println("Hello, Mr. Wajahat Adil");
        }
    }
}
