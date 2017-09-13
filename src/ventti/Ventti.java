/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventti;


import java.util.Random;
import java.util.Scanner;
//
///**
// *
// * @author s1700331
// */
public class Ventti {
//
//    /**
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
		

        Scanner lukija = new Scanner(System.in);

        //52 korttia, ässät aina 14
        int[] newCard = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14};

        //Sekoittaja, kerranpelissä
        shuffleArray(newCard);
        





        //Aloitus
        System.out.println("Tervetuloa pelaamaan Venttiä !");



        System.out.println();
        System.out.println("Sinulle nostettiin " + newCard[0] + " ja  " + newCard[1] + ".");
        int playerTotal = newCard[0] + newCard[1];
        System.out.println("Pistemääräsi on " + playerTotal + ".");
        System.out.println();

        //Ensimmäinen kierros
        if (playerTotal == 21){
            System.out.println("Ventti, voitit!.");
            System.exit(0);
        }
        if (playerTotal > 21){
            System.out.println("Yli 21 pistettä, hävisit!");
            System.exit(0);
        }
        

        // Lisää/jää pelaajalle
        System.out.print("Nostatko lisäkortin \"(k)yllä\" or \"(e)i)\"? ");
        String hitStay =lukija.next();
        System.out.println();

        //cc = indexin arvo
        int cc = 2;
        if (hitStay.equalsIgnoreCase("k")){
            
            while (playerTotal < 21 && hitStay.equalsIgnoreCase("k")){
                if (hitStay.equalsIgnoreCase("k")){
                    System.out.println("Sait kortin " + newCard[cc] + ".");
                    playerTotal = playerTotal + newCard[cc];
                    System.out.println("Pistemääräsi on " + playerTotal + ".");
                    System.out.println();
                    cc++;       
                    if (playerTotal > 21){
                        System.out.println("Pisteesi ovat yli 21! Hävisit!!.");
                        System.exit(0);
                    }
                    if (playerTotal == 21){
                        System.out.println("VENTTI!! Voitit!!");
                        System.exit(0);
                    }
                    System.out.print("Nostatko lisäkortin \"(k)yllä\" or \"(e)i\"? ");
                    hitStay = lukija.next();
                    System.out.println();
                }
            }        
        }
        
        // Jakajan vuoro
        lukija.close();
        System.out.println("Ok Jakajan vuoro.");
        int dealerTotal=0;
        
        
        while (dealerTotal < playerTotal && dealerTotal <=21){ 
            
            System.out.println();
            System.out.println("Jakaja nostaa kortin");
            System.out.println("Jakaja saa kortin " + newCard[cc] + ".");
            dealerTotal = dealerTotal + newCard[cc];
            cc++;
            System.out.println();
            System.out.println("Jakajan pisteet ovat " + dealerTotal);
            
            if (dealerTotal > 21){
                System.out.println();
                System.out.println("Jakajan pisteet ovat yli 21! VOITIT!!");
                System.exit(0);
            }
           
            
        }
//
        // Loppulauseet
        System.out.println();
        System.out.println("Jakajan pistemäärä on " + dealerTotal);
        System.out.println("Pelaajan pistemäärä on  " + playerTotal);
        System.out.println();

        if (dealerTotal > playerTotal){
            System.out.println("Jakaja voittaa!!");
        } 
        if (dealerTotal == playerTotal){
            System.out.println("Molemmat nostavat kortin ");
        }
        if (dealerTotal < playerTotal){
            System.out.println("Pelaaja voittaa!!");
        }
    }

    static void shuffleArray(int[] deckCards){

        

        Random rnd = new Random();
        for (int i = deckCards.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Swap
            int a = deckCards[index];
            deckCards[index] = deckCards[i];
            deckCards[i] = a;
        }
    }
}