public class Item implements ItemInterface {
    private String name;
    private double price;

    public Item(String nm, double pr){
        this.name = nm;
        this.price = pr;
    }

    public String getName() { // geeft de naam van het item
        return this.name;
    }
    public double getPrice() { // geeft de prijs van het item
        return this.price;
    }
}
