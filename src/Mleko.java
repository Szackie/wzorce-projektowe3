public class Mleko extends SkladnikDekorator {
    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.45;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z mlekiem";
    }
}
