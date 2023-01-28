public class KawiarniaStarCafe {
    public static void main(String [] args){
        Napoj napoj= new Espresso();
        napoj = new BitaSmietana(new Czekolada(new Czekolada(napoj)));
        System.out.println(napoj.pobierzOpis()+", cena: "+napoj.koszt());
    }
}
