package examCode2.taskElectron;

public class WashingMachine extends ElectronicsProduct{
    int warrantyPeriod;

    public WashingMachine(int productID, String name, int price,int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void addWarrantyPeriod(int month){
        warrantyPeriod = warrantyPeriod + month;
    }
}
