public class Cd extends Item {
    private String artist;

    public Cd(String nm, double pr, String ar) {
        super(nm, pr);
        this.artist = ar;
    }
    public String toString() {
        return this.getName()+" voor €"+this.getPrice()+" door "+artist;
    }
}
