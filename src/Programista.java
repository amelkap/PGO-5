public class Programista extends Pracownik{
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow){
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny(){
        double bonus = 0;
        if(liczbaRepozytoriow > 2){
            bonus = (liczbaRepozytoriow - 2) * 0.1 * getStawkaBazowa();
        }
        return getStawkaBazowa() + bonus;
    }

    @Override
    public String przedstawSie(){
        return "Programista: " + getImie() + " " + getNazwisko() + " , Jezyk: " + glownyJezyk + ", Repozytoria: " + liczbaRepozytoriow;
    }

    public void wypiszTechnologie() {
        System.out.println("Technologie pracownika " + getImie() + " " + getNazwisko() +
                ": glowny jezyk - " + glownyJezyk + ", liczba repozytoriow: " + liczbaRepozytoriow);
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + "glownyJezyk='" + glownyJezyk + '\'' +
                ", liczbaRepozytoriow=" + liczbaRepozytoriow +
                '}';
    }
}

