public class Bomb extends Ammunition {
    private int blastRadius;

    public void setBlastRadius(int blastRadius) {
        this.blastRadius = blastRadius;
    }

    public void displayBombInfo() {
        displayAmmunitionInfo();
        System.out.println("Blast Radius: " + blastRadius + " meters");
    }
}