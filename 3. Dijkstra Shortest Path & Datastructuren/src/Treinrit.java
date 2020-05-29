public class Treinrit extends Stap {
    int minuten;

    public Treinrit(int minuten, Node bestemming) {
        super(bestemming);
        this.minuten = minuten;
    }

    public int getAfstand() {
        return minuten;
    }

    @Override
    public String toString() {
        return "("+minuten+", "+super.getBestemming().getName()+")";
    }
}
