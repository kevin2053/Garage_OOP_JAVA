public class Moto extends Veicolo{
    private TempiMoto tempi;

    public Moto(Marche marca, String annoAquisto, String cilindrata, TempiMoto tempi) {
        super(marca, annoAquisto, cilindrata);
        this.tempi = tempi;
    }

    public TempiMoto getTempi() {
        return tempi;
    }

    public void setTempi(TempiMoto tempi) {
        this.tempi = tempi;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tempi=" + tempi +
                '}';
    }
}
