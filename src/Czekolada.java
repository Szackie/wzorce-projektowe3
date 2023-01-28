public class Czekolada extends SkladnikDekorator {
    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 1.1;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z czekolada";
    }
}
