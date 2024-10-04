public class Bullet extends Ammunition {
    private int caliber;

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public void displayBulletInfo() {
        displayAmmunitionInfo();
        System.out.println("Caliber: " + caliber + " mm");
    }
}