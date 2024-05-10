package chapter_03.comparable_and_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee_2 implements Comparable {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Override
    public int compareTo(Object o) {
        Employee_2 employee_2 = (Employee_2) o;
        return this.firstName.compareTo(employee_2.firstName);
    }

    @Override
    public String toString() {
        return this.firstName;
    }

    public static void main(String[] args) {
        List<Employee_2> list = new ArrayList<>();
        Employee_2 employee2 = new Employee_2();
        employee2.setFirstName("Wajahat");
        list.add(employee2);
        Employee_2 employee_2 = new Employee_2();
        employee_2.setFirstName("Adil");
        list.add(employee_2);
        Collections.sort(list);
        System.out.println(list);
    }
}
