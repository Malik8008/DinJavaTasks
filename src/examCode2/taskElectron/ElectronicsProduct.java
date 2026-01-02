package examCode2.taskElectron;
/*
4.	Write a Java program to create a class called "ElectronicsProduct" with attributes for product
 ID, name, and price. Implement methods to apply a discount and calculate the final price.
 Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
 */
public class ElectronicsProduct {
    int productID;
    String name;
    int price;
    int discountPrice;

    public ElectronicsProduct(int productID, String name, int price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(int percent){
        discountPrice = price-(price * percent / 100);
    }

    int finalPrice(){
        return discountPrice;
    }

}
