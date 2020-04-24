import java.util.ArrayList;

public class Bestelling {
    private int id;
    private double totaalprijs;
    private Customer customer;
    private ArrayList<Item> items;

    public Bestelling(int id, Customer cs){
        this.id = id;
        this.items = new ArrayList<Item>();
        this.customer = cs;
    }
    public void addItem(Item I){
        this.items.add(I);
        this.totaalprijs += I.getPrice();
    }
    public void removeItem(Item I){
        this.items.remove(I);
        this.totaalprijs -= I.getPrice();
    }

    public String toString() {
        return "Bestelling{" +
                "id=" + id +
                ", totaalprijs=" + totaalprijs +
                ", items=" + items +
                ", Customer="+ customer.getName() +
                "}\n";
    }
}
