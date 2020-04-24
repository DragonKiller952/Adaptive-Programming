import java.util.ArrayList;

public class Customer {
    private String name;
    private String adres;
    private String woonPlaats;
    private ArrayList<Bestelling> bestellingen;

    public Customer(String nm,String ad,String wP){
        this.name = nm;
        this.adres = ad;
        this.woonPlaats = wP;
        this.bestellingen = new ArrayList<Bestelling>();
    }

    public void addBestelling(Bestelling bes){
        this.bestellingen.add(bes);
    }

    public void removeBestelling(Bestelling bes){
        this.bestellingen.remove(bes);
    }

    public String getName(){
        return this.name;
    }

    public String toString() {
        int counter = 0;
        StringBuilder message = new StringBuilder();
        message.append(name).append(" woont op de ").append(adres).append(" in ").append(woonPlaats);
        for (Bestelling bestelling : this.bestellingen) {
            counter+=1;
        }
        if(counter > 0) {
            message.append(", en heeft het volgende bestellingen op zijn naam: \n");
            for (Bestelling bestelling : this.bestellingen) {
                message.append(bestelling.toString());
            }
        }
        else {
            message.append(", en heeft geen bestellingen op zijn naam");
        }

        return message.toString();
    }
}
