package chapter_02.design_principles.creational_design_patterns.factory_pattern.factory_pattern_2;

public class Pellets extends Food{
    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten: "+getQuantity());
    }
}
