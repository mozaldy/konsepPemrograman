public class Equipment {
    private String name;
    private String maker;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Maker: " + maker);
        System.out.println("Price: $" + price);
    }
}