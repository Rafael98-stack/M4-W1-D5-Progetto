package Contenuto;

public class Video {



   static public void play(){
       Luminosita luminosita = new Luminosita();
       Audio audio = new Audio();
       luminosita.setAumentaLuminosita();

       audio.setAlzaVolume();
System.out.println("///////////Recupero Dati///////////");
luminosita.getDati();
audio.getDati();
    }
    public static void main(String[] args) {

play();
    }
}
