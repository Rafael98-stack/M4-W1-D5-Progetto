package Contenuto;

import java.util.Scanner;

abstract class   Intensita {

   public void setAumentaLuminosita(int valore){

     }
       public void setDiminuisciLuminosita(int valore){

       }
  }
       class Luminosita extends Intensita {
           private int Valore=0;

           public Luminosita() {

           }

           public void setAumentaLuminosita() {
               Scanner Valore = new Scanner(System.in);
               System.out.println("Impostare la Luminosita'");
               int Luminosita = Valore.nextInt();
               this.Valore=Luminosita;


               System.out.println("La Luminosita' e' di: "+this.Valore);

               for (int i = 0; i<this.Valore;i++){

                 System.out.print("!");


               }
               System.out.println();


           }
public  void getDati(){
                System.out.println("Livello di Luminosita': "+this.Valore);
}
           public void setDiminuisciLuminosita(int valore) {
               this.Valore -=valore;
           }


       }
