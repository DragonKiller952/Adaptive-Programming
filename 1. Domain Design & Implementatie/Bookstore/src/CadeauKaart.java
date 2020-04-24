public class CadeauKaart {
    double balance;
    String naam;

    public CadeauKaart(double balance, String naam) {
        this.balance = balance;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public double getBalance() {
        return balance;
    }

    public void addCredit(double amount){
        balance += amount;
    }

    public void withdrawCredit(double amount) {
        balance -= amount;
    }
}
