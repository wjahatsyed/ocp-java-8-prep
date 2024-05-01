package chapter_01.static_nested_class;

public class MyOuterClass {
    public static void main(String[] args){
        MyStaticClass myStaticClass = new MyStaticClass();
        System.out.println(myStaticClass.name);
    }
    private static class MyStaticClass{
        String name = "Syed Muhammad Wajahat Adil Anwar Ali Al Hussaini";
    }
}
