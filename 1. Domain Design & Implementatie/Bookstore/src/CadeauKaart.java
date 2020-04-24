public class CadeauKaart {
    double balance;
    String naam;

    public CadeauKaart(double balance, String naam) {
        this.balance = balance;
        this.naam = naam;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return naam +": "+ balance;
    }
}
