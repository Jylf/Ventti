/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti;


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
        

        //Start BlackJack.
        System.out.println("Tervetuloa pelaamaan Venttiä !");
        System.out.println();
        System.out.println("Sinulle nostettiin " + newCard[0] + " ja  " + newCard[1] + ".");
        int playerTotal = newCard[0] + newCard[1];
        System.out.println("Pistemääräsi on " + playerTotal + ".");
        System.out.println();

        //Player can get blackjack/bust in the 1st deal. - awaiting betting system (enhanced bets for blackjack in first round)
        if (playerTotal == 21){
            System.out.println("Ventti, voitit!.");
            System.exit(0);
        }
        if (playerTotal > 21){
            System.out.println("Yli 21 pistettä, hävisit!");
            System.exit(0);
        }
        // Dealer cards
        System.out.println("Jakajalla " + newCard[2] + " kädessä");
        int dealerTotal = newCard[2] + newCard[3];
        if (dealerTotal > 21){     //Dealer bust check.
            System.out.println();
            System.out.println("Jakajan pistemäärä " + dealerTotal + ".");
            System.out.println("Jakajan pistemäärä yli 21! Voitit!!");
            System.exit(0);
        }
        if (dealerTotal == 21){    //Dealer blackjack check.
            System.out.println();
            System.out.println("Jakajalla lisäkortti " + newCard[3] + ".");
            System.out.println("Jakajan pistemäärä on " + dealerTotal + ".");
            System.out.println();
            System.out.println("Jakajalla on Ventti! Hävisit!!.");
            System.exit(0);
        }
        System.out.println("Jakajalla on kortti pöydällä");
        System.out.println();


        // Hit or Stay for player.
        System.out.print("Nostatko lisäkortin \"(k)yllä\" or \"(e)i\"? ");
        String hitStay =lukija.next();
        System.out.println();

        //cc = card count
        int cc = 4; 
        if (hitStay.equalsIgnoreCase("k")){
            // While loop to ensure different cards & multiple "hits".
            while (playerTotal < 21 && hitStay.equalsIgnoreCase("k")){
                if (hitStay.equalsIgnoreCase("k")){
                    System.out.println("Sait kortin " + newCard[cc] + ".");
                    playerTotal = playerTotal + newCard[cc];
                    System.out.println("Pistemääräsi on " + playerTotal + ".");
                    System.out.println();
                    cc++;        //Adds 1 to ensure next card is different.
                    // Bust & Blackjack check.
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

        // Dealers turn, only if Round 1 didn't end in bust/blackjack.
        lukija.close();
        System.out.println("Ok Jakajan vuoro.");
        System.out.println("Jakajan lisäkortti " + newCard[3] + "."); // reveal hidden from round one.

        cc++; // Pretty sure its not needed.
        while (dealerTotal < 16){ // Dealer will stay on 16+ and hit if below.
            System.out.println();
            System.out.println("Jakaja nostaa kortin");
            System.out.println("Jakaja saa kortin " + newCard[cc] + ".");
            cc++;
            dealerTotal = dealerTotal + newCard[cc];
            System.out.println();
            System.out.println("Jakajan pisteet ovat" + dealerTotal);
            // bust check - no need for blackjack check due to final win sequence
            if (dealerTotal > 21){
                System.out.println();
                System.out.println("Jakajan pisteet ovat yli 21! VOITIT!!");
                System.exit(0);
            }
            // stay condition.
            if (dealerTotal < 21 && dealerTotal > 16){
                System.out.println();
                System.out.println("Jakaja ei ota lisää kortteja");
            }
        }
//
        // final win sequence.
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

        /**
         * This code is obtained from the internet and is not my own though process
         * I need to understand it before I will be happy using it.
         * I'll have a try at explaining this, please correct me if I suckarino.
         * deckCards is a placeholder for the array I chose to use.
         * i = the length of the array which is 52, -1 would be 51.
         * i will be greater than 0 until the i-- completely loops it down to 0.
         * index is a random number between 1 & 52.
         * a is a random number in the array.
         * deckCards[i] is replaced with a; 
         * essentially shuffling 1 card in the array, this happens 51 times?
         */

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