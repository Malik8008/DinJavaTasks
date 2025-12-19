package oop2.zooPark;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Lion();
        animal1.makeSound();
        Animal animal2 = new Elephant();
        animal2.makeSound();
        Animal animal3 = new Monkey();
        animal3.makeSound();
        System.out.println();
        makeAllSound(animal1);
    }
    public static void makeAllSound(Animal animal){
        animal.makeSound();
    }
}
