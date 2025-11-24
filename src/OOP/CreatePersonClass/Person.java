package OOP.CreatePersonClass;

public class Person {
    private String name;
    private double height;

    public String printInfo(String name,double height){
        return "Name: "+this.name+"\nHeight: "+this.height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
