public class MleczkoSojowe extends SkladnikDekorator {
    public MleczkoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.55;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z mleczkiem sojowym";
    }
}
