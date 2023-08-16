
public class Main {
    public static void main(String[] args) {

        var garage = new Garage();

        //esempi di utilizzo dei metodi

        garage.aggiungiAuto(Marche.BMW,"2015","3.8","4",TipologiaAlimentazione.DISEL);
        garage.aggiungiAuto(Marche.KIA,"2017","2.8","4",TipologiaAlimentazione.ELETTRICO);
        garage.aggiungiFurgone(Marche.KIA,"2020","3.8","3.98");
        garage.aggiungiMoto(Marche.MAZDA,"2023","6.7",TempiMoto.DUETEMPI);
        garage.togliElemento(2);

        System.out.println(garage.getVeicoliInGarage());



    }
}