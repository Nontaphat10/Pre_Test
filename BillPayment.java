public class BillPayment {
    private String billType;
    private int billLastUnit;
    private int billCurrentUnit;
    private double billResult;

    public BillPayment(String type, int lastUnit) {
        billType = type;
        billLastUnit = lastUnit;
        billCurrentUnit = 0; 
        billResult = 0.0; 
    }

    public int getBillCurrentUnit() {
        return billCurrentUnit;
    }

    public void setBillCurrentUnit(int currentUnit) {
        if (currentUnit > billLastUnit) {
            billCurrentUnit = currentUnit;
        } else {
            System.out.println("Please Insert a correct unit");
        }
    }

    public int calculateUnit() {
        return billCurrentUnit - billLastUnit;
    }

    public double calculateBill() {
        if (billType.equalsIgnoreCase("Water")) {
            billResult = calculateUnit() * 5;
        } else if (billType.equalsIgnoreCase("Electric")) {
            billResult = calculateUnit() * 6;
        }
        return billResult;
    }

    public void displayBill() {
        System.out.println("My payment bill is: " + billType);
        System.out.println("The result is: " + billResult);
    }

    public static void main(String[] args) {
        BillPayment waterBill = new BillPayment("Water", 100);
        waterBill.setBillCurrentUnit(150); 
        waterBill.calculateBill();
        waterBill.displayBill();

        BillPayment electricBill = new BillPayment("Electric", 500);
        electricBill.setBillCurrentUnit(600); 
        electricBill.calculateBill();
        electricBill.displayBill();
    }
}
