/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
		
//		
//                int pata2 = 2;
//		int pata3 = 3;
//                int pata4 = 4;
//                int pata5 = 5;
//                int pata6 = 6;
//                int pata7 = 7;
//                int pata8 = 8;
//                int pata9 = 9;
//                int pata10 = 10;
//                int pata11 = 11;
//                int pata12 = 12;
//                int pata13 = 13;
//                int pata14 = 14;
//                int ruutu2 = 2;
//                int ruutu3 = 3;
//                int ruutu4 = 4;
//                int ruutu5 = 5;
//                int ruutu6 = 6;
//                int ruutu7 = 7;
//                int ruutu8 = 8;
//                int ruutu9 = 9;
//                int ruutu10 = 10;
//                int ruutu11 = 11;
//                int ruutu12 = 12;
//                int ruutu13 = 14;
//                int ruutu14 = 14;
//                int risti2 = 2;
//                int risti3 = 3;
//                int risti4 = 4;
//                int risti5 = 5;
//                int risti6 = 6;
//                int risti7 = 7;
//                int risti8 = 8;
//                int risti9 = 9;
//                int risti10 = 10;
//                int risti11 = 11;
//                int risti12 = 12;
//                int risti13 = 13;
//                int risti14 = 14;
//                int hertta2 = 2;
//                int hertta3 = 3;
//                int hertta4 = 4;
//                int hertta5 = 5;
//                int hertta6 = 6;
//                int hertta7 = 7;
//                int hertta8 = 8;
//                int hertta9 = 9;
//                int hertta10 = 10;
//                int hertta11 = 11;
//                int hertta12 = 12;
//                int hertta13 = 13;
//                int hertta14 = 14;
               
                
                ArrayList kortit = new ArrayList();
                
		kortit.add("Pata2");
		kortit.add("Pata3");
		kortit.add("Pata4");
                kortit.add("Pata5");
                kortit.add("Pata6");
                kortit.add("Pata7");
                kortit.add("Pata8");
                kortit.add("Pata9");
                kortit.add("Pata10");
                kortit.add("Pata11");
                kortit.add("Pata12");
                kortit.add("Pata13");
                kortit.add("Pata14");
                kortit.add("Ruutu2");
		kortit.add("Ruutu3");
		kortit.add("Ruutu4");
                kortit.add("Ruutu5");
                kortit.add("Ruutu6");
                kortit.add("Ruutu7");
                kortit.add("Ruutu8");
                kortit.add("Ruutu9");
                kortit.add("Ruutu10");
                kortit.add("Ruutu11");
                kortit.add("Ruutu12");
                kortit.add("Ruutu13");
                kortit.add("Ruutu14");
                kortit.add("Risti2");
		kortit.add("Risti3");
		kortit.add("Risti4");
                kortit.add("Risti5");
                kortit.add("Risti6");
                kortit.add("Risti7");
                kortit.add("Risti8");
                kortit.add("Risti9");
                kortit.add("Risti10");
                kortit.add("Risti11");
                kortit.add("Risti12");
                kortit.add("Risti13");
                kortit.add("Risti14");
                kortit.add("Hertta2");
		kortit.add("Hertta3");
		kortit.add("Hertta4");
                kortit.add("Hertta5");
                kortit.add("Hertta6");
                kortit.add("Hertta7");
                kortit.add("Hertta8");
                kortit.add("Hertta9");
                kortit.add("Hertta10");
                kortit.add("Hertta11");
                kortit.add("Hertta12");
                kortit.add("Hertta13");
                kortit.add("Hertta14");
		
                
        Random random = new Random();

    for (int x = 0; x < 1; x++) {
        int randomindex =random.nextInt(kortit.size());
        System.out.println(kortit.get(randomindex));			
	       kortit.remove(randomindex);	
               
               for (int j = 0; j<kortit.size(); j++){
               System.out.println(kortit.get(j));
               }
                
    }
    }
}



//public class Ventti {
//
//    public static void main(String[] args) {
//
//        Scanner keyboard = new Scanner(System.in);
//
//        //52 korttia, ässät aina 14
//        int[] newCard = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13,14,14,14,14};
//
//        //Shuffle. Once per game.
//        shuffleArray(newCard);
//        
//
////        //Start BlackJack.
////        System.out.println("Welcome to BlackJack!");
////        System.out.println();
////        System.out.println("You get a " + newCard[0] + " and a " + newCard[1] + ".");
////        int playerTotal = newCard[0] + newCard[1];
////        System.out.println("Your total is " + playerTotal + ".");
////        System.out.println();
////
////        //Player can get blackjack/bust in the 1st deal. - awaiting betting system (enhanced bets for blackjack in first round)
////        if (playerTotal == 21){
////            System.out.println("Blackjack, you win.");
////            System.exit(0);
////        }
////        if (playerTotal > 21){
////            System.out.println("Bust, You lose.");
////            System.exit(0);
////        }
////        // Dealer cards
////        System.out.println("The dealer has a " + newCard[2] + " showing, and a hidden card.");
////        int dealerTotal = newCard[2] + newCard[3];
////        if (dealerTotal > 21){     //Dealer bust check.
////            System.out.println();
////            System.out.println("Dealers total is " + dealerTotal + ".");
////            System.out.println("Dealer is bust, you win!");
////            System.exit(0);
////        }
////        if (dealerTotal == 21){    //Dealer blackjack check.
////            System.out.println();
////            System.out.println("Dealer reveals his second card: " + newCard[3] + ".");
////            System.out.println("Dealers total is " + dealerTotal + ".");
////            System.out.println();
////            System.out.println("Dealer has BlackJack, you lose.");
////            System.exit(0);
////        }
////        System.out.println("His total is hidden.");
////        System.out.println();
////
////
////        // Hit or Stay for player.
////        System.out.print("Would you like to \"hit\" or \"stay\"? ");
////        String hitStay = keyboard.next();
////        System.out.println();
////
////        //cc = card count
////        int cc = 4; 
////        if (hitStay.equalsIgnoreCase("hit")){
////            // While loop to ensure different cards & multiple "hits".
////            while (playerTotal < 21 && hitStay.equalsIgnoreCase("hit")){
////                if (hitStay.equalsIgnoreCase("hit")){
////                    System.out.println("You drew a " + newCard[cc] + ".");
////                    playerTotal = playerTotal + newCard[cc];
////                    System.out.println("Your total is " + playerTotal + ".");
////                    System.out.println();
////                    cc++;        //Adds 1 to ensure next card is different.
////                    // Bust & Blackjack check.
////                    if (playerTotal > 21){
////                        System.out.println("You are bust, You lose.");
////                        System.exit(0);
////                    }
////                    if (playerTotal == 21){
////                        System.out.println("Blackjack, you win.");
////                        System.exit(0);
////                    }
////                    System.out.print("Would you like to \"hit\" or \"stay\"? ");
////                    hitStay = keyboard.next();
////                    System.out.println();
////                }
////            }        
////        }
////
////        // Dealers turn, only if Round 1 didn't end in bust/blackjack.
////        keyboard.close();
////        System.out.println("Ok dealers turn.");
////        System.out.println("His hidden card was a " + newCard[3] + "."); // reveal hidden from round one.
////
////        cc++; // Pretty sure its not needed.
////        while (dealerTotal < 16){ // Dealer will stay on 16+ and hit if below.
////            System.out.println();
////            System.out.println("Dealer chooses to hit.");
////            System.out.println("He draws a " + newCard[cc] + ".");
////            cc++;
////            dealerTotal = dealerTotal + newCard[cc];
////            System.out.println();
////            System.out.println("His total is " + dealerTotal);
////            // bust check - no need for blackjack check due to final win sequence
////            if (dealerTotal > 21){
////                System.out.println();
////                System.out.println("Dealer is bust, YOU WIN!");
////                System.exit(0);
////            }
////            // stay condition.
////            if (dealerTotal < 21 && dealerTotal > 16){
////                System.out.println();
////                System.out.println("Dealer Stays.");
////            }
////        }
////
////        // final win sequence.
////        System.out.println();
////        System.out.println("Dealer total is " + dealerTotal);
////        System.out.println("Your total is " + playerTotal);
////        System.out.println();
////
////        if (dealerTotal > playerTotal){
////            System.out.println("Dealer wins.");
////        } 
////        if (dealerTotal == playerTotal){
////            System.out.println("You both draw.");
////        }
////        if (dealerTotal < playerTotal){
////            System.out.println("You win.");
////        }
////    }
//
//    static void shuffleArray(int[] deckCards){
//
//        /**
//         * This code is obtained from the internet and is not my own though process
//         * I need to understand it before I will be happy using it.
//         * I'll have a try at explaining this, please correct me if I suckarino.
//         * deckCards is a placeholder for the array I chose to use.
//         * i = the length of the array which is 52, -1 would be 51.
//         * i will be greater than 0 until the i-- completely loops it down to 0.
//         * index is a random number between 1 & 52.
//         * a is a random number in the array.
//         * deckCards[i] is replaced with a; 
//         * essentially shuffling 1 card in the array, this happens 51 times?
//         */
//
//        Random rnd = new Random();
//        for (int i = deckCards.length - 1; i > 0; i--)
//        {
//            int index = rnd.nextInt(i + 1);
//            // Swap
//            int a = deckCards[index];
//            deckCards[index] = deckCards[i];
//            deckCards[i] = a;
//        }
//    }
//}