package chapter_02.design_principles.has_a_relationship;

/**
 * Created by Syed Wajahat on 12/11/2019.
 * Bird-has-a-Beak is known as has-a relationship
 * This is also known as object composition
 */

public class Bird {
    private Beak beak;
    public Bird(String beakColor){
        beak = new Beak(beakColor);
    }
}

class Beak {
    private String color;

    public String getColor() {
        return this.color;
    }
    public Beak(String color){
        this.color = color;
    }
}
