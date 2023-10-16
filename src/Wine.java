public class Wine extends Product{

    private final static double dodatniPorez=0.1;
    private double zapreminaBoce;

    public Wine(String nazivProizvoda, String barcode, double osnovnaCijena, double zapreminaBoce) {
        super(nazivProizvoda, barcode, osnovnaCijena);
        this.zapreminaBoce=zapreminaBoce;
    }

    @Override
    public double racunanjeCijene (double osnovnaCijena)
    {
        osnovnaCijena=osnovnaCijena+osnovnaCijena*porez;
        return (osnovnaCijena+osnovnaCijena*dodatniPorez);
    }

    @Override
    public String toString() {
        return "Wine: " +
                " naziv proizvoda='" + nazivProizvoda + '\'' +
                ", barcode=" + barcode +
                ", osnovna cijena=" + osnovnaCijena +
                ", dodatni porez=" + dodatniPorez +
                ", zapremina boce=" + zapreminaBoce +
                ", cijena sa PDV-om=" + racunanjeCijene(osnovnaCijena);
    }
}
