package chapter_03.comparable_and_comparator.comparable;

public class Animal_2 implements Comparable<Animal_2> {
    private final int age;

    public Animal_2(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal_2 o) {
        System.out.println("Called");
        return this.age - o.age;
    }

    public static void main(String[] args) {
        Animal_2 a = new Animal_2(25);
        Animal_2 a_2 = new Animal_2(10);
        System.out.println(a.compareTo(a_2));
    }
}
