public class Book extends Item {
    private String author;

    public Book(String nm, double pr, String au) {
        super(nm, pr);
        this.author = au;
    }

    public String toString() {// geeft alle info van het boek in een string
        return this.getName()+" voor €"+this.getPrice()+" door "+author;
    }
}
