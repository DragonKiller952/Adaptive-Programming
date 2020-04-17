import java.time.LocalDate;
public class Game {
    private String naam;
    private int releaseJaar;
    private double prijs;

    public Game(String nm, int rJ, double pr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.prijs = pr;
    }

    public String toString(){
        String newPrice = String.format("%.2f",prijs*(Math.pow(0.7, (LocalDate.now().getYear()-releaseJaar))));
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + prijs+" nu voor : €"+newPrice+"\n";
    }
    public double getPrice(){
        return this.prijs;
    }
    public double getReleaseJaar(){
        return this.releaseJaar;
    }
    public String getNaam(){
        return this.naam;
    }
}
