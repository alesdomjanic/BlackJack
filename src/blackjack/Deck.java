package blackjack;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;
    private Card rand;

    public Deck() {

        deck = new ArrayList<Card>();
        barva(Barva.CLUBS);
        barva(Barva.DIAMONDS);
        barva(Barva.HEARTS);
        barva(Barva.SPADES);
        
    }
        
    private void barva(Barva b) {
        deck.add(new Card(b, Rank.TWO));
        deck.add(new Card(b, Rank.THREE));
        deck.add(new Card(b, Rank.FOUR));
        deck.add(new Card(b, Rank.FIVE));
        deck.add(new Card(b, Rank.SIX));
        deck.add(new Card(b, Rank.SEVEN));
        deck.add(new Card(b, Rank.EIGHT));
        deck.add(new Card(b, Rank.NINE));
        deck.add(new Card(b, Rank.TEN));
        deck.add(new Card(b, Rank.JACK));
        deck.add(new Card(b, Rank.QUEEN));
        deck.add(new Card(b, Rank.KING));
        deck.add(new Card(b, Rank.AS));
    }
    
    public void izpis(){
        for(int i=0;i<deck.size();i++){
            deck.get(i).izpis();
        }
    }
    
    public Card getRandomCard(){

        Card c;
        int rand = (int) (Math.random() * deck.size());
        c = deck.get(rand);
        deck.remove(rand);
        return c;
    }
    
  }

