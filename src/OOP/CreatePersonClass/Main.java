package OOP.CreatePersonClass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rahib");
        person.setHeight(1.80);
        System.out.println(person.printInfo(person.getName(),person.getHeight()));
    }
}
