package chapter_02.functional_programming;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class Tiger implements Sprint {
    @Override
    public void myAbstractMethod() {
        System.out.println("Tiger is gonna sprint");
    }
}

interface MyNewInterface{
    boolean testMethod(Animal_New animalNew);
}

class Animal_New implements MyNewInterface{
    @Override
    public boolean testMethod(Animal_New animalNew) {
        return false;
    }
}

class FindingAninmals{
    public static void print(Animal_New animalNew, MyNewInterface myNewInterface){

    }
    public static void main(String[] args){

    }
}
