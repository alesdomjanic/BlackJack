
package blackjack;

import java.util.Random;
import java.util.Scanner;


public class BlackJack {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int[] newCard = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        
        shuffleArray(newCard);
        
        System.out.println("BlackJack!");
        System.out.println();
        System.out.println("Tvoji karti sta " + newCard[0] + " in " + newCard[1] + ".");
        int playerTotal = newCard[0] + newCard[1];
        System.out.println("Vsota tvojih kart je " + playerTotal + ".");
        System.out.println();
        
        if (playerTotal == 21){
            System.out.println("Blackjack, ti zmagaš.");
            System.exit(0);
        }
        if (playerTotal > 21){
            System.out.println("Bust, ti izgubiš.");
            System.exit(0);
        }
        
        System.out.println("Dealer ima vidno karto " + newCard[2] + " in eno skrito.");
        int dealerTotal = newCard[2] + newCard[3];
        if(dealerTotal > 21){
            System.out.println();
            System.out.println("Vsota njegovih kart je " + dealerTotal + ".");
            System.out.println("Bust, dealer izgubi.");
            System.exit(0);            
        }
        
        if(dealerTotal == 21){
            System.out.println();
            System.out.println("Dealer pokaže drugo karto " + newCard[3]);
            System.out.println();
            System.out.println("Blackjack, dealer zmaga");   
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
                        System.out.println("Bust, ti izgubiš.");
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
        while(dealerTotal <=17){
            System.out.println();
            System.out.println("Dealer se odloči za hit.");
            x++;
            System.out.println("Dobil je " + newCard[x] + ".");
            dealerTotal = dealerTotal + newCard[x];
            System.out.println("Njegova vsota je " + dealerTotal + ".");
            
            if(dealerTotal > 21){
                System.out.println();
                System.out.println("Bust, dealer izgubi.");
                System.exit(0);
            }
            
            if(dealerTotal > 16 && dealerTotal < 21){
                System.out.println();
                System.out.println("Dealer stays.");
            }
        }
        
        System.out.println();
        System.out.println("Tvoja vsota je " + playerTotal);
        System.out.println("Njegova vsota je " + dealerTotal);
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


        Random rand = new Random();
        for (int i = deckCards.length - 1; i > 0; i--){
            int index = rand.nextInt(i + 1);

            int a = deckCards[index];
            deckCards[index] = deckCards[i];
            deckCards[i] = a;
        }
    }
}
