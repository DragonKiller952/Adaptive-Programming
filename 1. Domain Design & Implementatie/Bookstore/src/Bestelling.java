import java.util.ArrayList;

public class Bestelling {
    private int id;
    private double totaalprijs;
    private double verzendkosten;
    private ArrayList<Item> items;

    public Bestelling(int id){
        this.id = id;
        this.items = new ArrayList<>();
    }
    public int getId(){ // geeft het id van de bestelling
        return this.id;
    }

    public void addItem(Item I){ // voegt een item toe aan de bestelling
        this.items.add(I);
        this.totaalprijs += I.getPrice();
        System.out.println("Item "+I.getName()+" toegevoegt aan bestelling "+ this.id+"\n");
        berekenVerzendskosten();
    }
    public void removeItem(Item I){ // verwijdert item uit bestelling
        if(items.contains(I)) {
            this.items.remove(I);
            this.totaalprijs -= I.getPrice();
            System.out.println("Item "+I.getName()+" verwijderd uit bestelling "+ this.id+"\n");
            berekenVerzendskosten();
        }
        else{
            System.out.println("Bestelling "+this.id+ " bevat item "+I.getName()+" niet\n");
        }
    }
    public void berekenVerzendskosten(){ // kijkt of de bestelling verzendkosten heeft of niet
        if(totaalprijs<50){
            this.verzendkosten = 4.95;
        }
        else{
            this.verzendkosten = 0;
        }
    }
    public boolean isValid(){ // kijkt of de bestelling groot genoeg is om te bestellen
        int counter = 0;
        for (Item item : this.items) {
            counter+=1;
        }
        return counter >= 5;
    }

    public String toString() { // geeft alle info in en string en geeft een andere message als de bestelling
        // te klein is
        if(isValid()){
            return "Bestelling " + id + " kost " + String.format("%.2f",totaalprijs+verzendkosten) +
                    ", waarvan " + verzendkosten +
                    " verzendkosten, en items " + items +"}\n";
        }
        else{
            return "Er zitten te weinig Items in bestelling "+ id+ ", dit zijn de huidige items: "+ items+ "\n";
        }
    }
}
