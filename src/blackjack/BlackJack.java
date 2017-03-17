package blackjack;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int playerTotal;
        int dealerTotal;
        //Deck d = new Deck();
        Deck6 d = new Deck6();
        int money;
        int bet;
        boolean b =true;
        //d.izpis();

        Card player1 = d.getRandomCard6();
        Card player2 = d.getRandomCard6();
        Card pRand3 = d.getRandomCard6();

        Card dealer1 = d.getRandomCard6();
        Card dealer2 = d.getRandomCard6();
        Card dRand3 = d.getRandomCard6();

        System.out.println("BlackJack!");

        money = 500;
        while (true) {
            System.out.println("Ostalo ti je še " + money + " dollars.");

            do {
                System.out.println("Koliko želiš staviti?");
                bet = sc.nextInt();

            } while (bet < 0 || bet > money);

            if (bet == 0) {
                System.exit(0);
            }
        

            System.out.println();
            System.out.print("Tvoji karti sta: " + player1.getCardToString() + " in " + player2.getCardToString() + ".");
            playerTotal = player1.getValue() + player2.getValue();
            System.out.println();
            System.out.println("Vsota tvojih kart je " + playerTotal + ".");
            System.out.println();

            if (playerTotal == 21) {
                System.out.println("Blackjack, igralec zmaga.");
                System.out.println();

                money = money + bet;
                if (money == 0) {
                    System.out.println();
                    System.out.println("Zmanjkalo ti je denarja!");
                    System.exit(0);;
                }

                System.out.println();
                System.out.println("Ostalo ti je še " + money + " dollars.");

                System.exit(0);
            }

            System.out.println("Dealer ima vidno karto " + dealer1.getCardToString() + " in eno skrito karto.");
            dealerTotal = dealer1.getValue() + dealer2.getValue();
            System.out.println();
            if (dealerTotal > 21) {
                System.out.println("Vsota dealerjevih kart je " + dealerTotal + ".");
                System.out.println("Blackjack, igralec zmaga.");
                System.out.println();

                if (playerTotal > dealerTotal || dealerTotal > 21 || playerTotal >=21) {
                    money = money + bet;
                } else if (playerTotal > dealerTotal || playerTotal > 21) {
                    money = money - bet;
                } else if (money == 0) {
                    System.out.println();
                    System.out.println("Zmanjkalo ti je denarja!");
                }

                System.out.println();
                System.out.println("Ostalo ti je še " + money + " dollars.");

                System.exit(0);
            }
            if (dealerTotal == 21) {
                System.out.println();
                System.out.println("Dealer pokaže drugo karto " + dealer2.getCardToString() + ".");
                System.out.println("Vsota dealerjevih kart je " + dealerTotal + ".");
                System.out.println();
                System.out.println("Bust, dealer zmaga.");
                System.out.println();

                money = money - bet;

                System.out.println();
                System.out.println("Ostalo ti je še " + money + " dollars.");
                
                System.exit(0);
            }

            System.out.println("Vsota dealerjevih kart je skrita.");
            System.out.println();

            System.out.println("\"hit\" ali \"stay\"? ");
            String hitStay = sc.next();
            System.out.println();

            int x = 4;
            if (hitStay.equalsIgnoreCase("hit")) {
                while (playerTotal < 21 || hitStay.equalsIgnoreCase("hit")) {
                    if (hitStay.equalsIgnoreCase("hit")) {
                        System.out.println("Dobil si " + pRand3.getCardToString() + ".");
                        playerTotal = playerTotal + pRand3.getValue();
                        System.out.println("Tvoja vsota je " + playerTotal + ".");
                        System.out.println();
                        x++;
                        if (playerTotal > 21) {
                            System.out.println("Bust, dealer zmaga.");

                            money = money - bet;

                            System.out.println();
                            System.out.println("Ostalo ti je še " + money + " dollars.");

                            System.exit(0);
                        }
                        if (playerTotal == 21) {
                            System.out.println("Blackjack, igralec zmaga.");

                            money = money + bet;

                            System.out.println();
                            System.out.println("Ostalo ti je še " + money + " dollars.");

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
            System.out.println("Njegova vsota je " + dealerTotal + ".");

            x++;
            while (dealerTotal < 17) {
                System.out.println();
                System.out.println("Dealer se odloči za hit.");
                System.out.println("Dobil je " + dRand3.getCardToString() + ".");
                x++;
                dealerTotal = dealerTotal + dRand3.getValue();
                System.out.println();
                System.out.println("Njegova vsota je " + dealerTotal + ".");

                if (dealerTotal > 21) {
                    System.out.println();
                    System.out.println("Blackjack, igralec zmaga!");

                    money = money + bet;

                    System.out.println();
                    System.out.println("Ostalo ti je še " + money + " dollars.");

                    if (dealerTotal == 21) {
                        System.out.println();
                        System.out.println("Bust, dealer zmaga!");

                        money = money - bet;

                        System.out.println();
                        System.out.println("Ostalo ti je še " + money + " dollars.");
                    }

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

            if (dealerTotal > playerTotal || dealerTotal > 21) {
                System.out.println("Dealer zmaga.");

                money = money - bet;

                System.out.println();
                System.out.println("Ostalo ti je še " + money + " dollars.");
                System.exit(0);

            }
            if (dealerTotal == playerTotal) {
                System.out.println("Izenačeno.");

                money = money;

                System.out.println();
                System.out.println("Ostalo ti je še " + money + " dollars.");
                System.exit(0);

            }
            if (dealerTotal < playerTotal) {
                System.out.println("Ti zmagaš.");

                money = money + bet;
                
                System.out.println();
                System.out.println("Ostalo ti je še " + money + " dollars.");
                System.exit(0);

            }
        }
    }

}
