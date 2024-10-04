public class Ammunition extends Equipment {
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayAmmunitionInfo() {
        displayInfo();
        System.out.println("Quantity: " + quantity);
    }
}