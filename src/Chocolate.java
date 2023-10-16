public class Chocolate extends Product{
    private double tezina;
    public Chocolate(String nazivProizvoda, String barcode, double osnovnaCijena, double tezina) {
        super(nazivProizvoda, barcode, osnovnaCijena);
        this.tezina=tezina;
    }

    @Override
    public double racunanjeCijene (double osnovnaCijena)
    {
       return super.racunanjeCijene(osnovnaCijena);
    }

    @Override
    public String toString() {
        return "Chocolate: " +
                " naziv proizvoda='" + nazivProizvoda + '\'' +
                ", barcode=" + barcode +
                ", osnovna cijena=" + osnovnaCijena +
                ", tezina=" + tezina +
                ", cijena sa PDV-om=" + racunanjeCijene(osnovnaCijena);
    }
}
