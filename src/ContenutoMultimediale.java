import Contenuto.Immagine;
import Contenuto.Video;

public class ContenutoMultimediale {
    public static void main(String[] args) {
        Video video = new Video();
        Immagine immagine = new Immagine();
        video.play();
        immagine.show();
    }
}
