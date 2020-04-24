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
        this.bestellingen = new ArrayList<>();
    }

    public void addBestelling(Bestelling bes){ // voegt een bestelling toe aan een customer
        if(!bestellingen.contains(bes)){
            this.bestellingen.add(bes);
            System.out.println("Bestelling "+bes.getId()+" toegevoegt aan "+ this.name+"\n");

        }
        else{
            System.out.println(this.name+ " bezit bestelling "+bes.getId()+" al\n");
        }
    }

    public void removeBestelling(Bestelling bes){ // verwijderd een bestelling van een customer
        if(bestellingen.contains(bes)) {
            this.bestellingen.remove(bes);
            System.out.println("Bestelling "+bes.getId()+" verwijderd van "+ this.name+"\n");
        }
        else{
            System.out.println(this.name+ " bevat bestelling "+bes.getId()+" niet\n");
        }
    }

    public String getName(){ // geeft de naam van de customer
        return this.name;
    }

    public String toString() { // geeft alle info in en string en geeft een andere message als de customer
        // geen bestellingen heeft
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
