import java.util.ArrayList;

public class Customer {
    private String name;
    private String adres;
    private String woonPlaats;
    private ArrayList<Bestelling> bestellingen;
    private ArrayList<CadeauKaart> cadeaukaarten;

    public Customer(String nm,String ad,String wP){
        this.name = nm;
        this.adres = ad;
        this.woonPlaats = wP;
        this.bestellingen = new ArrayList<>();
        this.cadeaukaarten = new ArrayList<>();
    }

    public void addCadeaukaart(CadeauKaart ck) {
        this.cadeaukaarten.add(ck);
    }

    public void removeCadeaukaart(CadeauKaart ck) {
        this.cadeaukaarten.remove(ck);
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

    public double berekenCadaubonTotaal() {
        double amount = 0;
        for(CadeauKaart ck:this.cadeaukaarten) {
            amount += ck.getBalance();
        }
        return amount;
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
