public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        this.type = tp;
        this.prijsPerDag = prPd;
    }
    public void setPrijsPerDag(double prPd){
    }
    public double getPrijsPerDag(){
        return this.prijsPerDag;
    }
    public String toString(){
        return this.type;
    }

}
