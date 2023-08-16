public class Auto extends Veicolo{
    private String porte;
    private TipologiaAlimentazione tipoAlimentazione;

    public Auto(Marche marca, String annoAquisto, String cilindrata, String porte, TipologiaAlimentazione tipoAlimentazione) {
        super(marca, annoAquisto, cilindrata);
        this.porte = porte;
        this.tipoAlimentazione = tipoAlimentazione;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public TipologiaAlimentazione getTipoAlimentazione() {
        return tipoAlimentazione;
    }

    public void setTipoAlimentazione(TipologiaAlimentazione tipoAlimentazione) {
        this.tipoAlimentazione = tipoAlimentazione;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "porte='" + porte + '\'' +
                ", tipoAlimentazione=" + tipoAlimentazione +
                '}';
    }
}
