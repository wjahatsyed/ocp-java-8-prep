package chapter_03.comparable_and_comparator.comparator;

import java.util.Comparator;

/**
 * Created by Syed Wajahat on 12/16/2019.
 */
public class ChainingComparator implements Comparator<SortRabbits.Employee> {
    @Override
    public int compare(SortRabbits.Employee e1, SortRabbits.Employee e2) {
        Comparator<SortRabbits.Employee> c = Comparator.comparing(e -> e.getName());
        c = c.thenComparing(SortRabbits.Employee::getAge);
        return c.compare(e1, e2);
    }
}
