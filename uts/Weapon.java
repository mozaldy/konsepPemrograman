public class Weapon extends Equipment {
    private int weight;
    private int range;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void displayWeaponInfo() {
        displayInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Range: " + range + " meters");
    }
}