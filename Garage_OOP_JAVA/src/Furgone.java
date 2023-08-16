public class Furgone extends Veicolo{
    private String capienza;

    public Furgone(Marche marca, String annoAquisto, String cilindrata, String capienza) {
        super(marca, annoAquisto, cilindrata);
        this.capienza = capienza;
    }

    public String getCapienza() {
        return capienza;
    }

    public void setCapienza(String capienza) {
        this.capienza = capienza;
    }

    @Override
    public String toString() {
        return "Furgone{" +
                "capienza='" + capienza + '\'' +
                '}';
    }
}
