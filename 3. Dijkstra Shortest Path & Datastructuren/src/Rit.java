public class Rit extends Stap {
    int kilometers;

    public Rit(int kilometers, Node bestemming) {
        super(bestemming);
        this.kilometers = kilometers;
    }

    public int getAfstand() {// haalt de kilometers op van rit
        return kilometers;
    }

    @Override
    public String toString() {
        return "("+kilometers+", "+super.getBestemming().getName()+")";
    }
}
