public class Treinrit extends Stap {
    int minuten;

    public Treinrit(int minuten, Node bestemming) {//innitialiseert em maakt een verbinding met Stap
        super(bestemming);
        this.minuten = minuten;
    }

    public int getAfstand() {// haalt de minuten op van rit
        return minuten;
    }

    @Override
    public String toString() {
        return "("+minuten+", "+super.getBestemming().getName()+")";
    }
}
