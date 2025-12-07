package examCode.taskOOP.animalSoundTask;

/*
✔ Animal (abstract class)
abstract method: sound()
✔ Dog, Cat class-ları Animal-ı extends etsin
sound() fərqli işləsin
✔ Main-də polymorphism göstər:
Animal a = new Dog();
a.sound();

 */
public abstract class Animal {
    abstract void sound();
}
