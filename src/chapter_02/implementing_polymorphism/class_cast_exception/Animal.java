package chapter_02.implementing_polymorphism.class_cast_exception;

public class Animal {
    public void makeNoise(){
        System.out.println("Some animal noise");
    }
}

class Cat extends Animal{
    public void playCoolCat(){
        System.out.println("Playing cool");
    }
    public static void main(String [] args){
        Animal[] animals = new Animal[]{new Animal(), new Cat()};
        for(Animal a: animals){
            a.makeNoise();
            if(a instanceof Cat c){
                c.playCoolCat();
            }
        }
    }
}
