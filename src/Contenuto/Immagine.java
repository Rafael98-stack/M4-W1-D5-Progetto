package Contenuto;

public class Immagine {
    static void show(){
        Luminosita luminosita = new Luminosita();
        luminosita.setAumentaLuminosita();
        System.out.println("///////////Recupero Dati///////////");
        luminosita.getDati();
    }
    public static void main(String[] args) {
        show();
    }

}
