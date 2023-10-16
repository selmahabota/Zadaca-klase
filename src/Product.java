public abstract class Product {
    String nazivProizvoda;
    String barcode;
    double osnovnaCijena;
    final static double porez=0.2;

    public Product(String nazivProizvoda, String barcode, double osnovnaCijena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barcode = barcode;
        this.osnovnaCijena = osnovnaCijena;
    }
    public double racunanjeCijene (double osnovnaCijena)
    {
        return osnovnaCijena+osnovnaCijena*porez;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nazivProizvoda='" + nazivProizvoda + '\'' +
                ", barcode=" + barcode +
                ", osnovnaCijena=" + osnovnaCijena +
                '}';
    }
}
