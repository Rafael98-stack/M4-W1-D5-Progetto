import Contenuto.Immagine;
import Contenuto.Video;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ContenutoMultimediale {



    public static void main(String[] args) {
        Video video = new Video();
        Immagine immagine = new Immagine();

        try {
            video.play();
            immagine.show();
            Modifiche();
            Conferma();
         } catch (
    InputMismatchException e){
        System.out.println("Hai inserito una lettera... devi inserire un numero");
            video.play();
            immagine.show();
            Modifiche();
            Conferma();
    }
    }
    public static void Modifiche() {
        final String str = "Vuoi Modificare Qualcosa?";
         String risposta = "";

        System.out.println(str);
        Scanner Scanner = new Scanner(System.in);
        risposta = Scanner.nextLine();
        Video video = new Video();
        Immagine immagine = new Immagine();

        if (Objects.equals(risposta, "Si") || Objects.equals(risposta, "si") || Objects.equals(risposta, "sI") || Objects.equals(risposta, "SI")){
            Video.play();
            Immagine.show();
        } else if (Objects.equals(risposta, "No") || Objects.equals(risposta, "NO") || Objects.equals(risposta, "nO") || Objects.equals(risposta, "no")){
            System.out.println("Perfetto Buon Proseguimento");
        } else {
            System.out.println("Comando non Accettato... Chiusura dello Scanner");
        }
    }
    public static void Conferma() {
        final String str = "Modifiche Effettuate... Confermi?";
        String risposta = "";
        System.out.println(str);
        Scanner Scanner = new Scanner(System.in);
        risposta = Scanner.nextLine();
        Video video = new Video();
        Immagine immagine = new Immagine();

        if (Objects.equals(risposta, "Si") || Objects.equals(risposta, "si") || Objects.equals(risposta, "sI") || Objects.equals(risposta, "SI")){
            System.out.println("Perfetto Buon Proseguimento");
        } else if (Objects.equals(risposta, "No") || Objects.equals(risposta, "NO") || Objects.equals(risposta, "nO") || Objects.equals(risposta, "no")){

            Video.play();
            Immagine.show();
            System.out.println("Chiusura dello Scanner");
            Scanner.close();
        } else {
            System.out.println("Comando non Accettato... Chiusura dello Scanner");
        }
    }
}