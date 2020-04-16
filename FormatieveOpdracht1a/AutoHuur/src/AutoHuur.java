public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant klant;
    public void AutoHuur(){}

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
        if (this.gehuurdeAuto != null) {
            return this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "AutoHuur{" +
                "aantalDagen=" + aantalDagen +
                ", gehuurdeAuto=" + gehuurdeAuto +
                ", klant=" + klant +
                '}';
    }
}
