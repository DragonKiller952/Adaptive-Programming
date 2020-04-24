public class Bookstore {
    public static void main(String[] args) {
        Customer C1 = new Customer("Henk", "Zonnedauw 6", "Soest");
        System.out.println(C1.toString());

        Book B1 = new Book("The mistery of life", 29.99, "Pieter Jansen");
        System.out.println(B1.toString());

        Bestelling Bes1 = new Bestelling(15, C1);
        Bes1.addItem(B1);
        System.out.println(Bes1.toString());
        Bes1.addItem(B1);
        System.out.println(Bes1.toString());
        Bes1.removeItem(B1);
        System.out.println(Bes1.toString());

        Customer C2 = new Customer("Peter", "Nummerdauw 6", "Seost");
        C2.addBestelling(Bes1);
        System.out.println(C2.toString());
        C2.addBestelling(Bes1);
        System.out.println(C2.toString());
        C2.removeBestelling(Bes1);
        System.out.println(C2.toString());

        Cd Cd1 = new Cd("Bubbelgum K.K.", 32.95, "K.K. Slider");
        Customer C3 = new Customer("Jan", "ugh", "aah");
        Bestelling Bes2 = new Bestelling(1234567890, C2);
        Bes2.addItem(Cd1);
        C3.addBestelling(Bes2);
        System.out.println(C3.toString());
    }
}
