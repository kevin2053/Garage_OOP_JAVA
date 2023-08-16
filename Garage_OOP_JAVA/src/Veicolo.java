public class Veicolo {
    private Marche marca;
    private String annoAquisto;
    private String cilindrata;

    public Veicolo(Marche marca, String annoAquisto, String cilindrata) {
        this.marca = marca;
        this.annoAquisto = annoAquisto;
        this.cilindrata = cilindrata;
    }

    public Marche getMarca() {
        return marca;
    }

    public void setMarca(Marche marca) {
        this.marca = marca;
    }

    public String getAnnoAquisto() {
        return annoAquisto;
    }

    public void setAnnoAquisto(String annoAquisto) {
        this.annoAquisto = annoAquisto;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }


}
