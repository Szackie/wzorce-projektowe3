public class BitaSmietana extends SkladnikDekorator {
    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.69;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z bita smietana";
    }
}
