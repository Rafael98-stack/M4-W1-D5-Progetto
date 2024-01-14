package Contenuto;

public  class Video {

    public Tipologia tipo = Tipologia.VIDEO;

     public static void play() {
         Luminosita luminosita = new Luminosita();
         Audio audio = new Audio();

         System.out.println("///////////VIDEO///////////");
         System.out.println("///////////Impostazioni:///////////");

         luminosita.getDurata();
         luminosita.setAumentaLuminosita();
         luminosita.setDiminuisciLuminosita(1);
         audio.setAlzaVolume();
         System.out.println("///////////Recupero Dati///////////");
         luminosita.getDati();
         audio.getDati();
     }


}
