package chapter_01.nested_classes.anonymous_inner_classes;

public class Outer_3 {
    abstract static class SalesToday{
        abstract int dollarsOff();
    }

    public int pay(int basPrice){
        SalesToday salesToday = new SalesToday() {
            @Override
            int dollarsOff() {
                return 5;
            }
        };
        return basPrice - salesToday.dollarsOff();
    }
}
