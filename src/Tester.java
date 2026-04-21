public class Tester extends Pracownik{
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
    return czyAutomatyzujacy;
    }

    @Override
    public double obliczKosztMiesieczny(){
        if(czyAutomatyzujacy){
            return getStawkaBazowa() * 1.15;
        }
        else{
            return getStawkaBazowa();
        }
    }

    @Override
    public String przedstawSie(){
        return "Tester: " + getImie() + " " + getNazwisko() + " , Automatyzacja: " + (czyAutomatyzujacy ? "TAK" : "NIE") + ", Scenariusze: " + liczbaScenariuszy;
    }

    public void uruchomRaportTestow(){
        System.out.println("Raport testow testera " + getImie() + " " + getNazwisko() +
                ": liczba scenariuszy - " + liczbaScenariuszy + ", tryb: " + (czyAutomatyzujacy ? "automatyczny" : "manualny"));
    }

    @Override
    public String toString() {
        return super.toString() +
                " czyAutomatyzujacy=" + czyAutomatyzujacy +
                ", liczbaScenariuszy=" + liczbaScenariuszy +
                '}';
    }
}


