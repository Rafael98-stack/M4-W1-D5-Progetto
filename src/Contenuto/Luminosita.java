package Contenuto;

import java.util.Scanner;


abstract class   Intensita {

   public void setAumentaLuminosita(){

     }
       public void setDiminuisciLuminosita(){

       }
  }
 interface Durata {
    public void getDurata();
  }
       class Luminosita extends Intensita implements Durata {
           Tipologia tipo = Tipologia.VIDEO ;
           public int Valore = 0;
           public int Last = 0;

           public Luminosita() {
           }


           @Override
           public void getDurata() {
               System.out.println("Impostare Durata");
               Scanner scanner = new Scanner(System.in);
               int n = scanner.nextInt();
               this.Last = n;
               System.out.println("La Durata e' di: " + this.Last);
           }

           public void setAumentaLuminosita() {
               Scanner Valore = new Scanner(System.in);
               System.out.println("Impostare la Luminosita'");
               int Luminosita = Valore.nextInt();
               this.Valore = Luminosita;
               final int n = Luminosita;
               System.out.println("La Luminosita' e' di: " + this.Valore);
               for (int i = 0; i < this.Valore; i++) {
                   System.out.print("!");
               }

               System.out.println();
           }

           public void getDati() {
               switch (tipo) {

                   case VIDEO:
                       System.out.println("Livello di Luminosita' e Durata: " + this.Valore +" e " +this.Last);
                       break;
                   case IMMAGINE:
                       System.out.println("Livello di Luminosita': " + this.Valore);
                       break;
                   default:
                       System.out.println("Nessun Dato");
                       break;
               }

           }


           public void setDiminuisciLuminosita(int valore) {
               this.Valore -= valore;
           }
       }


