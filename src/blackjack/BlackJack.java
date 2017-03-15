
package blackjack;

import java.util.Random;
import java.util.Scanner;


public class BlackJack {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int[] newCard = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        
        shuffleArray(newCard);
        
        System.out.println("Welcome to BlackJack!");
        System.out.println();
        System.out.println("Tvoji karti sta " + newCard[0] + " in " + newCard[1] + ".");
        int playerTotal = newCard[0] + newCard[1];
        System.out.println("Vsota tvojih kart je " + playerTotal + ".");
        System.out.println();
        
        
        if (playerTotal == 21){
            System.out.println("Blackjack, zmaga.");
            System.exit(0);
        }
        if (playerTotal > 21){
            System.out.println("Bust, poraz.");
            System.exit(0);
        }
        
        System.out.println("Dealer ima vidno karto " + newCard[2] + " in eno skrito karto.");
        int dealerTotal = newCard[2] + newCard[3];
        if (dealerTotal > 21){     
            System.out.println();
            System.out.println("Vsota dealerjevih kart je " + dealerTotal + ".");
            System.out.println("Dealer is bust, ti zmagaš!");
            System.exit(0);
        }
        
        if (dealerTotal == 21) {  
            System.out.println();
            System.out.println("Dealer pokaže drugo karto: " + newCard[3] + ".");
            System.out.println("Vsota dealerjevih kart je " + dealerTotal + ".");
            System.out.println();
            System.out.println("Dealer has BlackJack, ti izgubiš.");
            System.exit(0);
        }
        System.out.println("Vsota dealerjevih kart je skrita.");
        System.out.println();
        
        System.out.print("\"hit\" ali \"stay\"? ");
        String hitStay = sc.next();
        System.out.println();
        
        int x = 4; 
        if (hitStay.equalsIgnoreCase("hit")){
            while (playerTotal < 21 && hitStay.equalsIgnoreCase("hit")){
                if (hitStay.equalsIgnoreCase("hit")){
                    System.out.println("Dobil si " + newCard[x] + ".");
                    playerTotal = playerTotal + newCard[x];
                    System.out.println("Tvoja vsota je " + playerTotal + ".");
                    System.out.println();
                    x++;     
                    if (playerTotal > 21){
                        System.out.println("You are bust, ti izgubiš.");
                        System.exit(0);
                    }
                    if (playerTotal == 21){
                        System.out.println("Blackjack, ti zmagaš.");
                        System.exit(0);
                    }
                    System.out.print("\"hit\" ali \"stay\"? ");
                    hitStay = sc.next();
                    System.out.println();
                }
            }        
        }


        sc.close();
        System.out.println("Na vrsti je dealer.");
        System.out.println("Njegova skrita karta je " + newCard[3] + "."); 

        x++; 
        while (dealerTotal < 16){ 
            System.out.println();
            System.out.println("Dealer se odloči za hit.");
            System.out.println("Dobil je " + newCard[x] + ".");
            x++;
            dealerTotal = dealerTotal + newCard[x];
            System.out.println();
            System.out.println("Njegova vsota je " + dealerTotal);

            if (dealerTotal > 21){
                System.out.println();
                System.out.println("Dealer is bust, Ti zmagaš!");
                System.exit(0);
            }

            if (dealerTotal < 21 && dealerTotal > 16){
                System.out.println();
                System.out.println("Dealer Stays.");
            }
        }

        // final win sequence.
        System.out.println();
        System.out.println("Njegova vsota je " + dealerTotal);
        System.out.println("Tvoja vsota je " + playerTotal);
        System.out.println();

        if (dealerTotal > playerTotal){
            System.out.println("Dealer zmaga.");
        } 
        if (dealerTotal == playerTotal){
            System.out.println("Izenačeno.");
        }
        if (dealerTotal < playerTotal){
            System.out.println("Ti zmagaš.");
        }
        
    }
    
    static void shuffleArray(int[] deckCards){


        Random rnd = new Random();
        for (int i = deckCards.length - 1; i > 0; i--){
            int index = rnd.nextInt(i + 1);

            int a = deckCards[index];
            deckCards[index] = deckCards[i];
            deckCards[i] = a;
        }
    }
}
