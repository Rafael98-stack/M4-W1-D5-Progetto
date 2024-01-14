package Contenuto;

import java.util.Scanner;

interface Volume {
    public void setAlzaVolume();
    public void setAbbassaVolume();
}
 class Audio implements Volume {
public int Audio = 0;
    public Audio(){

    }
     public void setAlzaVolume(){

         Scanner Volume = new Scanner(System.in);
         System.out.println("Impostare l'Audio':");
         int Valore = Volume.nextInt();
         this.Audio=Valore;
         System.out.println("L'Audio' e' di: "+this.Audio);
         for (int i = 0; i<this.Audio;i++){
             System.out.print("*");
         }
         System.out.println();
     }
     public void getDati(){
        System.out.println("Livello Audio: "+this.Audio);
     }
     public void setAbbassaVolume(){}
}
