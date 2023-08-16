import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List veicoliInGarage = new ArrayList();

    Garage(){};

    //metodi


        public void aggiungiAuto (Marche marca, String annoAcquisto, String cilindrata, String porte,
            TipologiaAlimentazione tipoAlimentazione){
        var auto = new Auto(marca, annoAcquisto, cilindrata, porte, tipoAlimentazione);
        veicoliInGarage.add(auto);
    }



    public void aggiungiFurgone(Marche marca, String annoAcquisto, String cilindrata, String capienza){
            var furgone = new Furgone(marca, annoAcquisto, cilindrata, capienza);
            veicoliInGarage.add(furgone);
    }

    public void aggiungiMoto(Marche marca, String annoAcquisto, String cilindrata, TempiMoto tempi){
            var moto = new Moto(marca, annoAcquisto, cilindrata, tempi);
            veicoliInGarage.add(moto);
    }



    public void clear(){

            veicoliInGarage.clear();
    }

    public void togliElemento(int numerazione){

            veicoliInGarage.remove(numerazione);
    }

    // getter/setter

    public List getVeicoliInGarage() {
        return veicoliInGarage;
    }

    public void setVeicoliInGarage(List veicoliInGarage) {
        this.veicoliInGarage = veicoliInGarage;
    }

}
