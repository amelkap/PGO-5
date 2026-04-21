 import java.util.ArrayList;
    public class ZespolProjektowy {
        private final String nazwaProjektu;
        private final ArrayList<Pracownik> pracownicy;
        public ZespolProjektowy(String nazwaProjektu) {
            this.nazwaProjektu = nazwaProjektu;
            this.pracownicy = new ArrayList<>();
        }
        public void dodajPracownika(Pracownik pracownik) {
            pracownicy.add(pracownik);
        }
        public void wypiszSkladZespolu() {
            System.out.println("Sklad zespolu projektu: " + nazwaProjektu);
            for (Pracownik pracownik : pracownicy) {
                System.out.println("- " + pracownik.przedstawSie());
            }
        }
        public double policzLacznyKoszt() {
            double suma = 0.0;
            for (Pracownik pracownik : pracownicy) {
                suma += pracownik.obliczKosztMiesieczny();
            }
            return suma;
        }
        public Pracownik znajdzPoId(String idPracownika) {
            for (Pracownik pracownik : pracownicy) {
                if (pracownik.pobierzIdPracownika().equals(idPracownika)) {
                    return pracownik;
                }
            }
            return null;
        }
        public void wypiszTesterowAutomatyzujacych() {
            System.out.println("Testerzy automatyzujacy:");
            for (Pracownik pracownik : pracownicy) {
                if (pracownik instanceof Tester) {
                    Tester tester = (Tester) pracownik;
                    if (tester.isCzyAutomatyzujacy()) {
                        System.out.println("- " + tester.przedstawSie());
                    }
                }
            }
        }
    }


