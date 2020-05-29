public class Stap {
    private int afstand;
    private Node bestemming;

    public Stap(Node bestemming) {
        this.bestemming = bestemming;
    }

    public Stap(int afstand, Node bestemming){
        this.afstand = afstand;
        this.bestemming = bestemming;
    }

    public int getAfstand() {
        return afstand;
    }

    public Node getBestemming() {
        return bestemming;
    }

    @Override
    public String toString() {
        return "("+afstand+", "+bestemming.getName()+")";
    }
}
