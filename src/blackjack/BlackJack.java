package blackjack;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Deck d = new Deck();
        Deck6 d= new Deck6();
        //d.izpis();

        Card player1 = d.getRandomCard6();
        Card player2 = d.getRandomCard6();
        Card pRand3 = d.getRandomCard6();

        Card dealer1 = d.getRandomCard6();
        Card dealer2 = d.getRandomCard6();
        Card dRand3 = d.getRandomCard6();

        System.out.println("BlackJack!");
        System.out.println();
        System.out.print("Tvoji karti sta: " + player1.getCardToString() + " in " + player2.getCardToString() + ".");
        int playerTotal = player1.getValue() + player2.getValue();
        System.out.println();
        System.out.println("Vsota tvojih kart je " + playerTotal + ".");
        System.out.println();

        if (playerTotal == 21) {
            System.out.println("Blackjack, igralec zmaga.");
            System.out.println();
            System.exit(0);
        }

        System.out.println("Dealer ima vidno karto " + dealer1.getCardToString() + " in eno skrito karto.");
        int dealerTotal = dealer1.getValue() + dealer2.getValue();
        System.out.println();
        if (dealerTotal > 21) {
            System.out.println("Vsota dealerjevih kart je " + dealerTotal + ".");
            System.out.println("Blackjack, igralec zmaga.");
            System.out.println();
            System.exit(0);
        }
        if (dealerTotal == 21) {
            System.out.println();
            System.out.println("Dealer pokaže drugo karto " + dealer2.getCardToString() + ".");
            System.out.println("Vsota dealerjevih kart je " + dealerTotal + ".");
            System.out.println();
            System.out.println("Bust, dealer zmaga.");
            System.out.println();
            System.exit(0);
        }

        System.out.println("Vsota dealerjevih kart je skrita.");
        System.out.println();

        System.out.println("\"hit\" ali \"stay\"? ");
        String hitStay = sc.next();
        System.out.println();

        int x = 4;
        if (hitStay.equalsIgnoreCase("hit")) {
            while (playerTotal < 21 && hitStay.equalsIgnoreCase("hit")) {
                if (hitStay.equalsIgnoreCase("hit")) {
                    System.out.println("Dobil si " + pRand3.getCardToString() + ".");
                    playerTotal = playerTotal + pRand3.getValue();
                    System.out.println("Tvoja vsota je " + playerTotal + ".");
                    System.out.println();
                    x++;
                    if (playerTotal > 21) {
                        System.out.println("Bust, dealer zmaga.");
                        System.exit(0);
                    }
                    if (playerTotal == 21) {
                        System.out.println("Blackjack, igralec zmaga.");
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
        System.out.println("Njegova skrita karta je " + dealer2.getCardToString() + ".");
        System.out.println("Njegova vsota je " + dealerTotal+".");

        x++;
        while (dealerTotal < 17) {
            System.out.println();
            System.out.println("Dealer se odloči za hit.");
            System.out.println("Dobil je " + dRand3.getCardToString() + ".");
            x++;
            dealerTotal = dealerTotal + dRand3.getValue();
            System.out.println();
            System.out.println("Njegova vsota je " + dealerTotal+".");

            if (dealerTotal > 21) {
                System.out.println();
                System.out.println("Blackjack, igralec zmaga!");
                System.exit(0);
            }

            if (dealerTotal < 21 && dealerTotal > 17) {
                System.out.println();
                System.out.println("Dealer Stays.");
            }

        }

        System.out.println();
        System.out.println("Njegova vsota je " + dealerTotal);
        System.out.println("Tvoja vsota je " + playerTotal);
        System.out.println();

        if (dealerTotal > playerTotal) {
            System.out.println("Dealer zmaga.");
        }
        if (dealerTotal == playerTotal) {
            System.out.println("Izenačeno.");
        }
        if (dealerTotal < playerTotal) {
            System.out.println("Ti zmagaš.");
        }

    }

}
