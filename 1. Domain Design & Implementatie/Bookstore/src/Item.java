public class Item implements ItemInterface {
    private String name;
    private double price;

    public Item(String nm, double pr){
        this.name = nm;
        this.price = pr;
    }

    public String getName() {
        return this.name;
    };
    public double getPrice() {
        return this.price;
    };

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
