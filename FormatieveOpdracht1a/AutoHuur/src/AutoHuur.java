public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant klant;

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }
    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }
    public Auto getGehuurdeAuto(){
        return this.gehuurdeAuto;
    }
    public void setHuurder(Klant k){
        this.klant = k;
    }
    public Klant getHuurder(){
        return this.klant;
    }
    public double totaalPrijs(){
        return this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen;
    }

    @Override
    public String toString() {
        String message = "";
        double perDag = 0;
        double korting = 0.0;
        if (this.klant != null){
            korting = klant.getKorting();
        }
        if (this.gehuurdeAuto != null){
            perDag = gehuurdeAuto.getPrijsPerDag();
        }

        if (this.gehuurdeAuto == null){
            message += "er is geen auto bekend\n";
        }else{
            message += "autotype: " + gehuurdeAuto + "\n";
        }
        if (this.klant == null){
            message += "er is geen huurder bekend\n";
        }else{
            message += "op naam van: "+klant + "\n";
        }

        message += "aantal dagen: "+aantalDagen +" en dat kost "+((aantalDagen * perDag)-((aantalDagen * perDag)/100*korting)) +"\n";



        return message;
    }
}
