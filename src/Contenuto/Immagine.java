package Contenuto;

public class Immagine {
    Tipologia tipo=Tipologia.IMMAGINE;
    static public void show(){
        Luminosita luminosita = new Luminosita();
        System.out.println("///////////IMMAGINE///////////");
        System.out.println("///////////Impostazioni:///////////");
        luminosita.setAumentaLuminosita();
        System.out.println("///////////Recupero Dati///////////");
        luminosita.tipo = Tipologia.IMMAGINE;
        luminosita.getDati();
    }


}
