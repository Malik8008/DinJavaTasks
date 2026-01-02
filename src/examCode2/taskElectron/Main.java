package examCode2.taskElectron;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(1,"Jetta",10,1);
        washingMachine.applyDiscount(50);
        washingMachine.addWarrantyPeriod(2);

        System.out.println("Final Price: " + washingMachine.finalPrice());
        System.out.println("Warranty Period: " + washingMachine.warrantyPeriod);
    }
}
