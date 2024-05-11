package chapter_03.comparable_and_comparator.comparator;

import java.util.Comparator;

public class ChainingComparator2 implements Comparator<SortRabbits.Employee> {
    @Override
    public int compare(SortRabbits.Employee o1, SortRabbits.Employee o2) {
        Comparator<SortRabbits.Employee> c = Comparator.comparing(e->e.getAge());
        c = c.thenComparing(e->e.getName());
        return c.compare(o1,o2);
    }
}
